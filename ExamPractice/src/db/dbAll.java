package db;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class dbAll extends JFrame {
	private JTextField textFieldSalary;
	private JTextField textFieldName;
	private JList listFromFile;
	private JButton btnUpdateDB;
	private JButton btnDelete;
	private JButton btnToFile;
	private JLabel lblNewLabel_2;
	private JButton btnFromFile;
	private JButton btnAddBetween;
	private JList listTwo;
	private JPanel contentPane;
	private JComboBox comboBoxRole;
	private JCheckBox chckbx1;
	private JCheckBox chckbx2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dbAll frame = new dbAll();
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
	public dbAll() {
		setTitle("Title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1003, 604);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Name");
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Salary");
		
		textFieldSalary = new JTextField();
		textFieldSalary.setColumns(10);
		
		listFromFile = new JList();
		
		JButton btnAddDB = new JButton("Add db");
		btnAddDB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = textFieldName.getText();
				double salary = Double.parseDouble(textFieldSalary.getText());
				
				addToDB(name,salary);
				
			}
		});
		
		btnUpdateDB = new JButton("Update ");
		btnUpdateDB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textFieldName.getText();
				double salary = Double.parseDouble(textFieldSalary.getText());
				updateDB(name,salary);
			}
		});
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textFieldName.getText();
				deleteDB(name);
			}
		});
		
		btnToFile = new JButton("To File");
		btnToFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readDB();
			}
		});
		
		lblNewLabel_2 = new JLabel("From File");
		
		btnFromFile = new JButton("From File");
		btnFromFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = new DefaultListModel<>();
				File file = new File("EMPFILE.txt");
				Scanner sc=null;
				try {
					sc = new Scanner(file);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				while(sc.hasNext())
				{
					String line = sc.nextLine();
					String tokens[] = line.split(" ");
					model.addElement(tokens[0]);
				}
				
				listFromFile.setModel(model);
				sc.close();
			}
		});
		
		listTwo = new JList();
		DefaultListModel<String> model2 = new DefaultListModel<>();
		listTwo.setModel(model2);
		
		btnAddBetween = new JButton("Add");
		btnAddBetween.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model1 = (DefaultListModel<String>) listFromFile.getModel();
				
				int index = listFromFile.getSelectedIndex();
				String value = (String) listFromFile.getSelectedValue();
				model1.remove(index);
//				
				DefaultListModel<String> model2 = (DefaultListModel<String>) listTwo.getModel();
				model2.addElement(value);
				//listTwo.setModel(model2);
				
			}
		});
		chckbx1 = new JCheckBox("box 1");
		
		chckbx2 = new JCheckBox("box2");
		
		comboBoxRole = new JComboBox();
		String roles[] = {"Role1","Role2","Role3"};
		DefaultComboBoxModel comboModel = new DefaultComboBoxModel<>(roles);
		comboBoxRole.setModel(comboModel);
		
		JButton btnReadCombo = new JButton("Read COmbo");
		btnReadCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = "";
				if(chckbx1.isSelected())
					text += "Box 1 ";
				if(chckbx2.isSelected())
					text += "Box 2";
				JOptionPane.showMessageDialog(btnReadCombo, comboBoxRole.getSelectedItem()+" "+text);
			}
		});
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(43)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(99)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
									.addGap(37)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textFieldSalary)
										.addComponent(textFieldName, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(43)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(btnAddDB)
												.addComponent(btnToFile))
											.addGap(32)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(btnUpdateDB)
													.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(btnDelete))
												.addComponent(btnFromFile)))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnReadCombo)
											.addPreferredGap(ComponentPlacement.RELATED)))))
							.addGap(87))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(27)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(chckbx2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(chckbx1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
									.addComponent(comboBoxRole, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
									.addGap(127)))))
					.addComponent(listFromFile, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnAddBetween)
					.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
					.addComponent(listTwo, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
					.addGap(58))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(478, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addGap(436))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(82)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textFieldSalary, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBoxRole, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbx1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbx2)
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddDB)
						.addComponent(btnUpdateDB)
						.addComponent(btnDelete))
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnToFile)
						.addComponent(btnFromFile))
					.addGap(36)
					.addComponent(btnReadCombo)
					.addContainerGap(159, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(listFromFile, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
						.addComponent(listTwo, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
					.addGap(253))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(150)
					.addComponent(btnAddBetween)
					.addContainerGap(386, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void addToDB(String name,double salary) {
		
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
			String msAccessDB = "ExamTest.accdb";
			String dbURL = "jdbc:ucanaccess://" + msAccessDB;
			
			connection = DriverManager.getConnection(dbURL);
			statement = connection.createStatement();
			
			String insertSql = "INSERT INTO EMP VALUES ('"+name+"',"+salary+")";
			statement.executeUpdate(insertSql);
			JOptionPane.showMessageDialog(null, "Successfull");

		
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
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
	
	public void updateDB(String name,double salary) {
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
			String msAccessDB = "ExamTest.accdb";
			String dbURL = "jdbc:ucanaccess://" + msAccessDB;
			
			connection = DriverManager.getConnection(dbURL);
			statement = connection.createStatement();
			
			
			String updateSql = "UPDATE EMP SET ESALARY = "+salary +" WHERE ENAME = '"+name+"'";;
			int result = statement.executeUpdate(updateSql);
			if(result >= 1)
			JOptionPane.showMessageDialog(null, "Successfully Updated");
			else
			{
				JOptionPane.showMessageDialog(null, "Username does not exist");
			}

		
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
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

	public void deleteDB(String name) {
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
			String msAccessDB = "ExamTest.accdb";
			String dbURL = "jdbc:ucanaccess://" + msAccessDB;
			
			connection = DriverManager.getConnection(dbURL);
			statement = connection.createStatement();
			
			
			String deleteSql = "DELETE FROM EMP WHERE ENAME = '"+name+"'";;
			int result = statement.executeUpdate(deleteSql);
			if(result >= 1)
			JOptionPane.showMessageDialog(null, "Successfully Deleted");
			else
			{
				JOptionPane.showMessageDialog(null, "Username does not exist");
			}

		
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
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

	public void readDB() {

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
			String msAccessDB = "ExamTest.accdb";
			String dbURL = "jdbc:ucanaccess://" + msAccessDB;
			
			connection = DriverManager.getConnection(dbURL);
			statement = connection.createStatement();
			
			String sql = "Select * from EMP";
			
			resultSet = statement.executeQuery(sql);
			
			FileWriter fileWriter = new FileWriter("EMPFILE.txt");
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			
			while(resultSet.next())
			{
				
				printWriter.println(resultSet.getString(1)+" "+resultSet.getDouble(2));
				
							
				
			}
			
			printWriter.close();
			JOptionPane.showMessageDialog(null, "Written to FIle");
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		catch (Exception e) {
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
