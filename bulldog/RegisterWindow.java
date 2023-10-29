package bulldog;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class RegisterWindow extends JFrame {

	private JPanel contentPane;
	private JPanel RegisterPanel;
	private JLabel RegisterLbl;
	private JTextField NUemailTxt;
	private JTextField NU_IDtxt;
	private JPasswordField NewPassTxt;
	private JPasswordField ConfirmPassTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterWindow frame = new RegisterWindow();
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
	public RegisterWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		RegisterPanel = new JPanel();
		RegisterPanel.setBackground(Color.LIGHT_GRAY);
		RegisterPanel.setBounds(10, 75, 766, 336);
		contentPane.add(RegisterPanel);
		RegisterPanel.setLayout(null);
		
		RegisterLbl = new JLabel("REGISTER");
		RegisterLbl.setHorizontalAlignment(SwingConstants.LEFT);
		RegisterLbl.setBounds(466, 53, 102, 14);
		RegisterPanel.add(RegisterLbl);
		
		NUemailTxt = new JTextField();
		NUemailTxt.setBounds(466, 87, 217, 20);
		RegisterPanel.add(NUemailTxt);
		NUemailTxt.setColumns(10);
		
		NU_IDtxt = new JTextField();
		NU_IDtxt.setColumns(10);
		NU_IDtxt.setBounds(466, 118, 217, 20);
		RegisterPanel.add(NU_IDtxt);
		
		NewPassTxt = new JPasswordField();
		NewPassTxt.setBounds(466, 161, 217, 20);
		RegisterPanel.add(NewPassTxt);
		
		ConfirmPassTxt = new JPasswordField();
		ConfirmPassTxt.setBounds(466, 192, 217, 20);
		RegisterPanel.add(ConfirmPassTxt);
		
		JButton RegisterBtn = new JButton("REGISTER");
		RegisterBtn.setBounds(495, 223, 160, 23);
		RegisterPanel.add(RegisterBtn);
		
		JButton NextBtn2 = new JButton(">>>");
		NextBtn2.setBounds(675, 302, 81, 23);
		RegisterPanel.add(NextBtn2);
	}

}
