import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;

public class mth extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mth frame = new mth();
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
	public mth() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 384, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Algebra");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
					
					String myurl ="https://www.khanacademy.org/math/algebra";
				java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
				}
					catch (Exception e2)
					{
						e2.printStackTrace();
					}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(75, 31, 146, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Trignometry");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(75, 78, 146, 36);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Caculus");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(75, 125, 146, 36);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("BACK");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Physics window =new Physics();
				window.frame.setVisible(true);
				
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_3.setBounds(284, 234, 74, 19);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Nmber Theory");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_4.setBounds(75, 183, 146, 36);
		contentPane.add(btnNewButton_4);
		
		JTextArea txtrProjectStillUnder = new JTextArea();
		txtrProjectStillUnder.setFont(new Font("MV Boli", Font.BOLD, 13));
		txtrProjectStillUnder.setForeground(Color.BLACK);
		txtrProjectStillUnder.setText("            Project Still Under Progres");
		txtrProjectStillUnder.setBounds(10, 230, 297, 36);
		contentPane.add(txtrProjectStillUnder);
	}
}
