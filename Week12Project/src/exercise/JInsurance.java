package exercise;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.Visibility;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;

public class JInsurance extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbxHMO;
	private JCheckBox chckbxPPO;
	private final ButtonGroup buttonGroupInsuranceTypes = new ButtonGroup();
	private JCheckBox chckbxDental;
	private JCheckBox chckbxVision;
	private JList list;
	static double price = 0;
	private JLabel lblPrice;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JInsurance frame = new JInsurance();
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
	public JInsurance() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		
		chckbxHMO = new JCheckBox("HMO");
		buttonGroupInsuranceTypes.add(chckbxHMO);
		
		chckbxPPO = new JCheckBox("PPO");
		buttonGroupInsuranceTypes.add(chckbxPPO);
		
		chckbxDental = new JCheckBox("Dental");
		
		chckbxVision = new JCheckBox("Vision");
		list = new JList();
		list.setEnabled(false);
		
		
		chckbxHMO.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(chckbxHMO.isSelected()) {
					model.addElement("HMO $200");
					price +=200;
					lblPrice.setText("Current Price : $"+price);
					
					}
					
					
				else {price -=200;
				model.removeElement("HMO $200");
				lblPrice.setText("Current Price : $"+price);
				}
					
				
				list.setModel(model);
			}
		});
		
		chckbxPPO.addItemListener(new ItemListener() {
					
					@Override
					public void itemStateChanged(ItemEvent e) {
						// TODO Auto-generated method stub
						if(chckbxPPO.isSelected()) {
							model.addElement("PPO $600");
						price +=600;
						
						}
						else {
							model.removeElement("PPO $600");
							price -=600;
							
						}
							
						lblPrice.setText("Current Price : $"+price);
						list.setModel(model);
						
					}
				});
		
		chckbxDental.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(chckbxDental.isSelected())
				{	model.addElement("Dental $75");
					price +=75;
					
				}
					
					
				else {
					model.removeElement("Dental $75");
					price -=75;
					
				}
					
				lblPrice.setText("Current Price : $"+price);
				list.setModel(model);
			}
		});
		
		chckbxVision.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
				if(chckbxVision.isSelected()) {
					model.addElement("Vision $20");
					price +=20;
					
				}
					
					
				else {
					model.removeElement("Vision $20");
					price -=20;
					
				}
					
				lblPrice.setText("Current Price : $"+price);
				list.setModel(model);
			}
		});
		
		lblPrice = new JLabel("Current Price :$0");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(60)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxHMO, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxPPO, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxVision, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxDental, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lblPrice, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
							.addGap(162))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(133, Short.MAX_VALUE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(74)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxHMO)
								.addComponent(chckbxDental))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxPPO)
								.addComponent(chckbxVision)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(66)
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)))
					.addGap(27)
					.addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(29, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	
}
