import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class phy extends JFrame {

	private JPanel contentPane;
	private JTextField txtChooseTheTopic;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					phy frame = new phy();
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
	public phy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 317, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtChooseTheTopic = new JTextField();
		txtChooseTheTopic.setBackground(Color.LIGHT_GRAY);
		txtChooseTheTopic.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtChooseTheTopic.setForeground(Color.WHITE);
		txtChooseTheTopic.setText("        Choose the topic");
		txtChooseTheTopic.setBounds(24, 11, 239, 23);
		contentPane.add(txtChooseTheTopic);
		txtChooseTheTopic.setColumns(10);
		
		JButton btnNewButton = new JButton("Classical mechanics");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				try {
					
				
				String myurl ="http://farside.ph.utexas.edu/teaching/301/lectures/node3.html#:~:text=Classical%20mechanics%20is%20the%20study,commonly%20known%20as%20the%20Principia.";
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
			}
				catch (Exception e2)
				{
					e2.printStackTrace();
				}}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(41, 57, 158, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Electromagnetism");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					
					String myurl ="https://byjus.com/physics/electromagnetism/";
				java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
				}
					catch (Exception e2)
					{
						e2.printStackTrace();
					}
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(41, 104, 158, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Optics");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
					
					String myurl ="https://www.optics4kids.org/what-is-optics";
				java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
				}
					catch (Exception e2)
					{
						e2.printStackTrace();
					}
			}
		});
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(41, 138, 158, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Nuclear Physics");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
					
					String myurl ="https://www.nature.com/subjects/nuclear-physics#:~:text=Nuclear%20physics%20is%20the%20study,fusion%2C%20the%20merging%20of%20nuclei.";
				java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
				}
					catch (Exception e2)
					{
						e2.printStackTrace();
					}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.setBounds(41, 172, 158, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("BACK");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				Physics window =new Physics();
				window.frame.setVisible(true);
				
				dispose();
				
				
				
			}
		});
		btnNewButton_4.setBackground(Color.GREEN);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.setBounds(215, 244, 76, 23);
		contentPane.add(btnNewButton_4);
	}
}
