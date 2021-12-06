package practice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Color;

public class BankGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFName;
	private JTextField textFieldLName;
	private JTextField textFieldAccNum;
	private JTextField textFieldBalance;
	private JButton addToDBButton;
	private JTable table;
	DefaultTableModel model;
	private JButton showAllButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankGUI frame = new BankGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BankGUI() {
		setTitle("Bank GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1127, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Account NUmber");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textFieldAccNum = new JTextField();
		textFieldAccNum.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textFieldFName = new JTextField();
		textFieldFName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textFieldLName = new JTextField();
		textFieldLName.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("balance");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textFieldBalance = new JTextField();
		textFieldBalance.setColumns(10);
		
		addToDBButton = new JButton("Add to DB");
		addToDBButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int accNo = Integer.parseInt(textFieldAccNum.getText());
				String fName  = textFieldFName.getText();
				String lName = textFieldLName.getText();
				double balance = Double.parseDouble(textFieldBalance.getText());
				
				BankAccount account = new BankAccount(accNo, lName, fName, balance);
				addToDB(account);
			}
		});
		addToDBButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		table = new JTable();
		table.setEnabled(false);
		table.setBackground(Color.LIGHT_GRAY);
		model = new DefaultTableModel();
		Object[] column = {"Account Number","FName","LName","Balance"};
		//final Object[] row = new Object[0];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		model.addRow(column);
		
		showAllButton = new JButton("Show All Records");
		showAllButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		showAllButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayFromDB();
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(55)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldBalance, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
								.addComponent(textFieldLName, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
								.addComponent(textFieldFName, 217, 217, 217)
								.addComponent(textFieldAccNum, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(addToDBButton, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
							.addGap(48)
							.addComponent(showAllButton, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
					.addGap(162)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 496, GroupLayout.PREFERRED_SIZE)
					.addGap(24))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(75)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textFieldAccNum, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textFieldFName, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textFieldLName, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(textFieldBalance, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(74)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(showAllButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(addToDBButton, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
					.addContainerGap(96, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(96, Short.MAX_VALUE)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 366, GroupLayout.PREFERRED_SIZE)
					.addGap(35))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void addToDB(BankAccount account)
	{
		Connection connection = null;
		Statement statement = null;
		
		
		
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		try {
			String msAccessDB = "D:\\Documents\\MS Access DB\\BankDB1.accdb";
			String dbURL = "jdbc:ucanaccess://" + msAccessDB;
			
			connection = DriverManager.getConnection(dbURL);
			statement = connection.createStatement();
			
			String insertSql = "INSERT INTO BankAccount (AccountNumber,FName,LName,Balance) VALUES ("+account.getAccountNumber()+
					",'"+account.getfName()+"','"+account.getlName()+"',"+account.getBalance()+")";
			statement.executeUpdate(insertSql);
			JOptionPane.showMessageDialog(null, "Successfull");

		
			
		} catch (SQLException e) {
			// TODO: handle exception
			//System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Account ID Already Exists ");
		}
		
		finally {
			try {
				if(connection!=null) {
					
					statement.close();
					connection.close();
				}
				
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
	}
	}
	
	public void displayFromDB() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		model = new DefaultTableModel();
		Object[] column = {"Account Number","FName","LName","Balance"};
		//final Object[] row = new Object[0];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		model.addRow(column);
		
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		try {
			String msAccessDB = "D:\\Documents\\MS Access DB\\BankDB1.accdb";
			String dbURL = "jdbc:ucanaccess://" + msAccessDB;
			
			connection = DriverManager.getConnection(dbURL);
			statement = connection.createStatement();
			
			String sql = "Select * from BankAccount";
			
			resultSet = statement.executeQuery(sql);
			
			BankAccount account = new BankAccount();
			Object[] row = new Object[4];
			
			while(resultSet.next())
			{
				account.setAccountNumber(resultSet.getInt(1));
				account.setfName(resultSet.getString(2));
				account.setlName(resultSet.getString(3));
				account.setBalance(resultSet.getDouble(4));
				
				row[0] = account.getAccountNumber();
				row[1] = account.getfName();
				row[2] = account.getlName();
				row[3] = account.getBalance();
				model.addRow(row);
				
				
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		finally {
			try {
				if(connection!=null) {
					resultSet.close();
					statement.close();
					connection.close();
				}
				
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
			
				
		}

	}
}
