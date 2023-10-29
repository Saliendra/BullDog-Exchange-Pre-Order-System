package bulldog;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LogInWindow extends JFrame {

	private JPanel contentPane;
	private JButton RegisterBtn;
	private JPasswordField PasswordTxt;
	private JTextField EmailTxtField;
	private JButton NextBtn;
	private JButton LogInBtn;
	private JLabel WelcomeLbl;
	private JButton ExitBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInWindow frame = new LogInWindow();
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
	public LogInWindow() {
		setTitle("LOG IN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel LogInPanel = new JPanel();
		LogInPanel.setBackground(Color.LIGHT_GRAY);
		LogInPanel.setBounds(10, 75, 766, 336);
		contentPane.add(LogInPanel);
		LogInPanel.setLayout(null);
		
		RegisterBtn = new JButton("Register");
		RegisterBtn.setBounds(460, 246, 89, 23);
		LogInPanel.add(RegisterBtn);
		
		LogInBtn = new JButton("Log In");
		LogInBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		LogInBtn.setBounds(569, 246, 89, 23);
		LogInPanel.add(LogInBtn);
		
		PasswordTxt = new JPasswordField();
		PasswordTxt.setBounds(460, 195, 205, 20);
		LogInPanel.add(PasswordTxt);
		
		EmailTxtField = new JTextField();
		EmailTxtField.setText("Email");
		EmailTxtField.setBounds(460, 164, 205, 20);
		LogInPanel.add(EmailTxtField);
		EmailTxtField.setColumns(10);
		
		WelcomeLbl = new JLabel("WELCOME!");
		WelcomeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		WelcomeLbl.setBounds(460, 55, 205, 14);
		LogInPanel.add(WelcomeLbl);
		
		ExitBtn = new JButton("Exit");
		ExitBtn.setBounds(667, 11, 89, 23);
		LogInPanel.add(ExitBtn);
		
		NextBtn = new JButton(">>>");
		NextBtn.setBounds(667, 302, 89, 23);
		LogInPanel.add(NextBtn);
	}
}
