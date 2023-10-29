package bulldog;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class AccountVerifiedWindow extends JFrame {

	private JPanel contentPane;
	private JPanel RegisterPanel2;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountVerifiedWindow frame = new AccountVerifiedWindow();
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
	public AccountVerifiedWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		RegisterPanel2 = new JPanel();
		RegisterPanel2.setBackground(Color.LIGHT_GRAY);
		RegisterPanel2.setBounds(10, 75, 766, 336);
		contentPane.add(RegisterPanel2);
		RegisterPanel2.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(67, 42, 638, 254);
		RegisterPanel2.add(panel);
		panel.setLayout(null);
		
		JLabel verifiedLbl = new JLabel("ACCOUNT VERIFIED");
		verifiedLbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		verifiedLbl.setBackground(Color.GREEN);
		verifiedLbl.setHorizontalAlignment(SwingConstants.CENTER);
		verifiedLbl.setBounds(63, 30, 507, 131);
		panel.add(verifiedLbl);
		
		JButton LoginBtn = new JButton("Log in");
		LoginBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LoginBtn.setBounds(251, 183, 147, 23);
		panel.add(LoginBtn);
	}

}
