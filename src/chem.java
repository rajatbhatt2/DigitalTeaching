import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class chem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chem frame = new chem();
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
	public chem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Organic");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
					
					String myurl ="https://www.khanacademy.org/science/organic-chemistry";
				java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
				}
					catch (Exception e2)
					{
						e2.printStackTrace();
					}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(48, 48, 100, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Inorganic");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(48, 106, 100, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Phsyical");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(48, 165, 100, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Analytical");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(48, 215, 100, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("BACK");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Physics window =new Physics();
				window.frame.setVisible(true);
				
				dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 9));
		btnNewButton_4.setBounds(321, 215, 89, 23);
		contentPane.add(btnNewButton_4);
	}

}
