package exercise;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JSandwich extends JFrame {

	private JPanel contentPane;
	private JList listIncredients;
	private JList listBreads;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSandwich frame = new JSandwich();
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
	public JSandwich() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		listIncredients = new JList();
		listIncredients.setModel(new AbstractListModel() {
			String[] values = new String[] {"Veg", "Fish", "Chicken", ""};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listIncredients.setSelectedIndex(0);
		
		JLabel lblIncredients = new JLabel("Incredients");
		lblIncredients.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		listBreads = new JList();
		listBreads.setModel(new AbstractListModel() {
			String[] values = new String[] {"Rye", "Pita", "Multigrain"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listBreads.setSelectedIndex(0);
		
		JLabel lblBreads = new JLabel("Breads");
		lblBreads.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnPrice = new JButton("Find Price");
		btnPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double price = 0.0;
				
				double incredientPrices = Math.pow((listIncredients.getSelectedIndex()+1), 2);
				price = incredientPrices+ (listBreads.getSelectedIndex()+1);
				
				JOptionPane.showMessageDialog(null, "Total Price is $"+price);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(57)
					.addComponent(listIncredients, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
					.addComponent(listBreads, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addGap(145))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(86)
					.addComponent(lblIncredients)
					.addPreferredGap(ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
					.addComponent(lblBreads, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addGap(184))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(258)
					.addComponent(btnPrice, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(314, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(54)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIncredients, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBreads))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(listIncredients, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
						.addComponent(listBreads, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
					.addGap(46)
					.addComponent(btnPrice, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(36, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
