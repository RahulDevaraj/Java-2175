package windowbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class GUI extends JFrame {

	private JPanel cntPMain;
	private JLabel lblName;
	private JTextField txtName;
	private JButton btnDisplay;
	private JButton btnClose;
	private final ButtonGroup gUgroup = new ButtonGroup();
	private JRadioButton rdBtnGrad;
	private JComboBox cmBoxCourses;
	private JComboBox cmBoxDept;
	private JList listSchools_1;
	private JList listProvinces;
	private JButton btnProvinces;
	private JList listNew;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setupComponents();
		createEvents();
	}
	
	private void setupComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1149, 386);
		cntPMain = new JPanel();
		cntPMain.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("HAI");
		setContentPane(cntPMain);
		
		btnDisplay = new JButton("Display");
		btnDisplay.setIcon(new ImageIcon(GUI.class.getResource("/resources/outline_check_circle_black_24dp.png")));
		btnDisplay.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		txtName = new JTextField();
		txtName.setColumns(10);
		
		btnClose = new JButton("Close");
		
		rdBtnGrad = new JRadioButton("Grad Student");
		gUgroup.add(rdBtnGrad);
		rdBtnGrad.setSelected(true);
		
		JRadioButton rdBtnUndergrad = new JRadioButton("UnderGrad Student");
		gUgroup.add(rdBtnUndergrad);
		
		cmBoxCourses = new JComboBox();		
		cmBoxCourses.setModel(new DefaultComboBoxModel(new String[] {"CSIS 1175", "CSIS 2175", "CSIS 3475", "CSIS 1280"}));
		
		cmBoxDept = new JComboBox();
		
		String[] deptNames = {"CSIS","BUSN","ECON","MARK","HOSP"};
		Arrays.sort(deptNames);
		
		for(int i=0; i<deptNames.length;i++) {
			cmBoxDept.addItem(deptNames[i]);
		}
		
		cmBoxDept.setSelectedIndex(3);
		
		JList listSchools = new JList();
		String[] schools = {"Douglas","UBC","KPU","Langara"};
		DefaultListModel<String> schoolNames = new DefaultListModel<String>();
		Arrays.sort(schools);
		for(int i=0; i<schools.length;i++) {
			schoolNames.addElement(schools[i]);
		}
		
		listSchools_1 = new JList(schoolNames);
		listSchools_1.addMouseMotionListener(new MouseMotionAdapter() {
			
			public void mouseMoved(MouseEvent e) {
				listSchools_1.setToolTipText("Hey");
			}
		});
		
		listProvinces = new JList();
		
		btnProvinces = new JButton("Provinces");
		


		btnProvinces.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> provincesList = new DefaultListModel<String>();
				Scanner sc = null;
				try {
					File file = new File("Provinces.txt");
					 sc = new Scanner(file);
					
					while(sc.hasNext())
					{
						provincesList.addElement(sc.nextLine())
						
;					}
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
				}
				
				listProvinces.setModel(provincesList);
				sc.close();
				
				

			}
		});
		
		listNew = new JList();
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String [] newProvinces = new String[10];
				
				int count  =0;
				int toRemove =0;
				String picked = listProvinces.getSelectedValue().toString();
				toRemove = listProvinces.getSelectedIndex();
				
				newProvinces[count] = picked;
				count++;
				
				DefaultListModel<String> newList = new DefaultListModel<>();
				for(int x=0;x<count;x++) {
					newList.addElement(newProvinces[x]);
				}
				
				listNew.setModel(newList);
				
				DefaultListModel listRemoval = (DefaultListModel) listProvinces.getModel();
				
				listRemoval.remove(toRemove);
			
			}
		});
		
		
		GroupLayout gl_cntPMain = new GroupLayout(cntPMain);
		gl_cntPMain.setHorizontalGroup(
			gl_cntPMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cntPMain.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_cntPMain.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_cntPMain.createSequentialGroup()
							.addGroup(gl_cntPMain.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_cntPMain.createSequentialGroup()
									.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(58))
								.addGroup(gl_cntPMain.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
									.addGroup(gl_cntPMain.createParallelGroup(Alignment.LEADING)
										.addComponent(rdBtnGrad, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
										.addComponent(rdBtnUndergrad, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
							.addGroup(gl_cntPMain.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_cntPMain.createSequentialGroup()
									.addComponent(cmBoxCourses, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(cmBoxDept, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
									.addGap(36)))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_cntPMain.createSequentialGroup()
							.addComponent(btnDisplay, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
							.addGap(55)
							.addComponent(btnClose, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
							.addComponent(btnAdd)
							.addGap(53)))
					.addGroup(gl_cntPMain.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_cntPMain.createSequentialGroup()
							.addComponent(listSchools_1, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
							.addGap(48)
							.addComponent(listProvinces, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addGap(95))
						.addGroup(gl_cntPMain.createSequentialGroup()
							.addComponent(btnProvinces, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(listNew, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
							.addGap(258))))
		);
		gl_cntPMain.setVerticalGroup(
			gl_cntPMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cntPMain.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_cntPMain.createParallelGroup(Alignment.BASELINE)
						.addGroup(gl_cntPMain.createSequentialGroup()
							.addComponent(lblName)
							.addGap(38)
							.addComponent(rdBtnGrad)
							.addGap(15)
							.addComponent(rdBtnUndergrad))
						.addGroup(gl_cntPMain.createSequentialGroup()
							.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(59)
							.addGroup(gl_cntPMain.createParallelGroup(Alignment.BASELINE)
								.addComponent(cmBoxDept, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(cmBoxCourses, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(listSchools_1, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
						.addComponent(listProvinces, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_cntPMain.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_cntPMain.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
							.addGroup(gl_cntPMain.createParallelGroup(Alignment.LEADING)
								.addComponent(btnDisplay, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_cntPMain.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(btnAdd, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnProvinces, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnClose, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)))
							.addGap(43))
						.addGroup(gl_cntPMain.createSequentialGroup()
							.addGap(18)
							.addComponent(listNew, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		cntPMain.setLayout(gl_cntPMain);
	}
	
	private void createEvents() {

		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String degree;
				if(rdBtnGrad.isSelected())
					degree = "Grad";
				else
					degree = "Undergrad";
				JOptionPane.showMessageDialog(null, "name "+txtName.getText()+ " is a "+degree+ " student."+cmBoxCourses.getSelectedItem()+" with "+cmBoxDept.getSelectedItem()
				+ " at "+listSchools_1.getSelectedValue()+" in "+listProvinces.getSelectedValue());
			}
		});
		

		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		}
}
