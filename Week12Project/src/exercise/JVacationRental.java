package exercise;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JVacationRental extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtnParkSide;
	private JRadioButton rdbtnPoolSide;
	private JRadioButton rdbtnLakeSide;
	private final ButtonGroup buttonGroupLocation = new ButtonGroup();
	private JRadioButton rdbtnOneRoom;
	private JRadioButton rdbtnThreeRoom;
	private JRadioButton rdbtnTwoRoom;
	private final ButtonGroup buttonGroupRentals = new ButtonGroup();
	private JRadioButton rdbtnYes;
	private JRadioButton rdbtnNo;
	private final ButtonGroup buttonGroupMeals = new ButtonGroup();
	private JButton btnCalculate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JVacationRental frame = new JVacationRental();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private double calc() {
		double price = 0;
		if(rdbtnParkSide.isSelected())
		price+=600;
		else if(rdbtnPoolSide.isSelected())
			price+=750;
		else
			price +=825;
		
		if(rdbtnTwoRoom.isSelected())
			price +=75;
		else
			price +=150;
		
		if(rdbtnYes.isSelected())
			price+=200;
		
		return price;
		
	}

	/**
	 * Create the frame.
	 */
	public JVacationRental() {
		setTitle("Rental");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		rdbtnParkSide = new JRadioButton("Parkside");
		buttonGroupLocation.add(rdbtnParkSide);
		
		rdbtnPoolSide = new JRadioButton("Pool Side");
		buttonGroupLocation.add(rdbtnPoolSide);
		
		rdbtnLakeSide = new JRadioButton("Lake Side");
		buttonGroupLocation.add(rdbtnLakeSide);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblRentals = new JLabel("Rentals");
		lblRentals.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		rdbtnOneRoom = new JRadioButton("One Bedroom");
		buttonGroupRentals.add(rdbtnOneRoom);
		
		rdbtnTwoRoom = new JRadioButton("Two Bedroom");
		buttonGroupRentals.add(rdbtnTwoRoom);
		
		rdbtnThreeRoom = new JRadioButton("Three Bedroom");
		buttonGroupRentals.add(rdbtnThreeRoom);
		
		JLabel lblMeals = new JLabel("Meals??");
		lblMeals.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		rdbtnYes = new JRadioButton("Yes");
		buttonGroupMeals.add(rdbtnYes);
		
		rdbtnNo = new JRadioButton("No");
		buttonGroupMeals.add(rdbtnNo);
		
		btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double price = calc();
				JOptionPane.showMessageDialog(null, "The total rent is "+price);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(64)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblLocation)
							.addGap(94)
							.addComponent(lblRentals, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addGap(78)
							.addComponent(lblMeals))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnParkSide, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnPoolSide, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnLakeSide, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnThreeRoom, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnTwoRoom, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnOneRoom, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(125, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(383, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNo, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnYes, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
					.addGap(96))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(242)
					.addComponent(btnCalculate, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(237, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLocation)
						.addComponent(lblRentals)
						.addComponent(lblMeals))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnParkSide)
						.addComponent(rdbtnOneRoom))
					.addGap(14)
					.addComponent(rdbtnYes)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(14)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnPoolSide)
								.addComponent(rdbtnTwoRoom))
							.addGap(48)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnLakeSide)
								.addComponent(rdbtnThreeRoom)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addComponent(rdbtnNo)))
					.addGap(44)
					.addComponent(btnCalculate, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
