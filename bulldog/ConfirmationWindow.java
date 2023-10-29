package bulldog;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.DropMode;
import javax.swing.SwingConstants;

public class ConfirmationWindow extends JFrame {

	private JPanel contentPane;
	private JTextField ConfirmationTxt;
	private JTextField EmailNotiftxt;
	private JButton ConfirmationBtn;
	private JPanel BasketPanel2;
	private JPanel ConfirmationPanel1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmationWindow frame = new ConfirmationWindow();
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
	public ConfirmationWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BasketPanel2 = new JPanel();
		BasketPanel2.setBackground(Color.LIGHT_GRAY);
		BasketPanel2.setBounds(10, 11, 766, 433);
		contentPane.add(BasketPanel2);
		BasketPanel2.setLayout(null);
		
		ConfirmationPanel1 = new JPanel();
		ConfirmationPanel1.setBounds(187, 101, 403, 220);
		BasketPanel2.add(ConfirmationPanel1);
		ConfirmationPanel1.setLayout(null);
		
		ConfirmationTxt = new JTextField();
		ConfirmationTxt.setHorizontalAlignment(SwingConstants.CENTER);
		ConfirmationTxt.setDropMode(DropMode.ON);
		ConfirmationTxt.setText("DO YOU WANT TO CHECK OUT?");
		ConfirmationTxt.setBounds(45, 28, 336, 20);
		ConfirmationPanel1.add(ConfirmationTxt);
		ConfirmationTxt.setColumns(10);
		
		EmailNotiftxt = new JTextField();
		EmailNotiftxt.setText(" Once confirmed please check your email for your receipt ");
		EmailNotiftxt.setHorizontalAlignment(SwingConstants.CENTER);
		EmailNotiftxt.setDropMode(DropMode.ON);
		EmailNotiftxt.setColumns(10);
		EmailNotiftxt.setBounds(45, 59, 336, 20);
		ConfirmationPanel1.add(EmailNotiftxt);
		
		ConfirmationBtn = new JButton("Confirm");
		ConfirmationBtn.setBackground(Color.GREEN);
		ConfirmationBtn.setBounds(141, 120, 140, 45);
		ConfirmationPanel1.add(ConfirmationBtn);
		
	}

}
