package bulldog;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VerificationWindow extends JFrame {

	private JPanel contentPane;
	private JPanel RegisterPanel1;
	private JTextField VerificationTxt;
	private JLabel CodeResendLbl;
	private JButton ResendBtn;
	private JLabel VerificationLbl;
	private JPanel VerificationPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerificationWindow frame = new VerificationWindow();
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
	public VerificationWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		RegisterPanel1 = new JPanel();
		RegisterPanel1.setBackground(Color.LIGHT_GRAY);
		RegisterPanel1.setBounds(10, 75, 766, 336);
		contentPane.add(RegisterPanel1);
		RegisterPanel1.setLayout(null);
		
		VerificationPanel = new JPanel();
		VerificationPanel.setBounds(67, 42, 638, 254);
		RegisterPanel1.add(VerificationPanel);
		VerificationPanel.setLayout(null);
		
		VerificationLbl = new JLabel("VERIFICATION");
		VerificationLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		VerificationLbl.setHorizontalAlignment(SwingConstants.CENTER);
		VerificationLbl.setBounds(157, 38, 338, 14);
		VerificationPanel.add(VerificationLbl);
		
		VerificationTxt = new JTextField();
		VerificationTxt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		VerificationTxt.setBounds(88, 90, 478, 70);
		VerificationPanel.add(VerificationTxt);
		VerificationTxt.setColumns(10);
		
		CodeResendLbl = new JLabel("Couldn't get code?");
		CodeResendLbl.setHorizontalAlignment(SwingConstants.CENTER);
		CodeResendLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		CodeResendLbl.setBounds(171, 204, 171, 25);
		VerificationPanel.add(CodeResendLbl);
		
		ResendBtn = new JButton("Resend");
		ResendBtn.setBounds(335, 205, 97, 26);
		VerificationPanel.add(ResendBtn);
	}
}
