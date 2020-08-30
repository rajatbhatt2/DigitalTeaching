import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Physics {

	JFrame frame;
	public JTextField txtChooseSubjectYou;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Physics window = new Physics();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Physics() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 406, 357);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Physics");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				phy ph=new phy();
				ph.setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton.setBounds(43, 109, 114, 36);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Chemsitry");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				chem ch=new chem();
				ch.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(43, 210, 114, 36);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Maths");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				mth m=new mth();
				m.setVisible(true);
				
			}
		});
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_2.setBounds(201, 111, 114, 32);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Computers");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				comp cp=new comp();
				cp.setVisible(true);
			
				
			}
		});
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setBackground(Color.YELLOW);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(201, 210, 114, 36);
		frame.getContentPane().add(btnNewButton_3);
		
		txtChooseSubjectYou = new JTextField();
		txtChooseSubjectYou.setForeground(Color.BLACK);
		txtChooseSubjectYou.setBackground(new Color(192, 192, 192));
		txtChooseSubjectYou.setFont(new Font("Verdana", Font.BOLD, 11));
		txtChooseSubjectYou.setText("Choose Subject you want to study");
		txtChooseSubjectYou.setBounds(43, 11, 272, 52);
		frame.getContentPane().add(txtChooseSubjectYou);
		txtChooseSubjectYou.setColumns(10);
	}
}
