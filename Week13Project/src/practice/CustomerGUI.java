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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class CustomerGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldId;
	private JTextField textFieldName;
	private JComboBox comboBoxLocation;
	private JList listNames;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerGUI frame = new CustomerGUI();
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
	public CustomerGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Customer ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_2 = new JLabel("Location");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textFieldId = new JTextField();
		textFieldId.setColumns(10);
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		
		comboBoxLocation = new JComboBox();
		comboBoxLocation.setModel(new DefaultComboBoxModel(new String[] {"North", "South", "East", "West"}));
		
		JButton btnAddToDB = new JButton("Add to DB");
		btnAddToDB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer customer = new Customer();
				customer.setNumber(Integer.parseInt(textFieldId.getText()));
				customer.setName(textFieldName.getText());
//				customer.setLocation(comboBoxLocation.getSelectedItem());
				customer.setLocation(comboBoxLocation.getSelectedItem().toString().charAt(0));
				
				addToDB(customer);
				
			}
		});
		btnAddToDB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		listNames = new JList();
		listNames.setEnabled(false);
		JButton btnDisplayNames = new JButton("Display Names");
		btnDisplayNames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showNames();
			}
		});
		btnDisplayNames.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(74)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lblNewLabel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldId, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(comboBoxLocation, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textFieldName, Alignment.LEADING, 155, 155, Short.MAX_VALUE)))
							.addGap(322))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap(75, Short.MAX_VALUE)
							.addComponent(btnAddToDB, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
							.addGap(46)
							.addComponent(btnDisplayNames, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
							.addGap(266)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(listNames, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
					.addGap(193))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(88)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(listNames, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(textFieldId, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addGap(21)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
							.addGap(26)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2)
								.addComponent(comboBoxLocation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(73)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnDisplayNames, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
								.addComponent(btnAddToDB, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(121, Short.MAX_VALUE))))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void addToDB(Customer customer)
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
			String msAccessDB = "D:\\Documents\\MS Access DB\\CustomerDB1.accdb";
			String dbURL = "jdbc:ucanaccess://" + msAccessDB;
			
			connection = DriverManager.getConnection(dbURL);
			statement = connection.createStatement();
			
			String insertSql = "INSERT INTO Customer VALUES ("+customer.getNumber()+
					",'"+customer.getName()+"','"+customer.getLocation()+"')";
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
	
	public void showNames() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		

		
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		try {
			String msAccessDB = "D:\\Documents\\MS Access DB\\CustomerDB1.accdb";
			String dbURL = "jdbc:ucanaccess://" + msAccessDB;
			
			connection = DriverManager.getConnection(dbURL);
			statement = connection.createStatement();
			
			String sql = "Select * from Customer";
			
			resultSet = statement.executeQuery(sql);
			
			Customer customer = new Customer();
			
			DefaultListModel<String> names = new DefaultListModel<String>();
			while(resultSet.next())
			{
				names.addElement(resultSet.getString(2));
							
				
			}
			
			listNames.setModel(names);
			
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
