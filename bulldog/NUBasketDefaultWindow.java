package bulldog;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NUBasketDefaultWindow extends JFrame {

	private JPanel contentPane;
	private JButton aboutBtn1;
	private JButton productsBtn1;
	private JButton newReleaseBtn1;
	private JButton logInBtn1;
	private JButton registerBtn1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NUBasketDefaultWindow frame = new NUBasketDefaultWindow();
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
	public NUBasketDefaultWindow() {
		setTitle("NU BASKET ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		aboutBtn1 = new JButton("ABOUT");
		aboutBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		aboutBtn1.setBounds(240, 35, 89, 23);
		contentPane.add(aboutBtn1);
		
		productsBtn1 = new JButton("PRODUCTS");
		productsBtn1.setBounds(339, 35, 89, 23);
		contentPane.add(productsBtn1);
		
		newReleaseBtn1 = new JButton("NEW RELEASE");                  
		newReleaseBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		newReleaseBtn1.setBounds(438, 35, 106, 23);
		contentPane.add(newReleaseBtn1);
		
		logInBtn1 = new JButton("Log in");
		logInBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		logInBtn1.setBounds(577, 35, 89, 23);
		contentPane.add(logInBtn1);
		
		registerBtn1 = new JButton("Register");
		registerBtn1.setBounds(676, 35, 89, 23);
		contentPane.add(registerBtn1);
	}
}
