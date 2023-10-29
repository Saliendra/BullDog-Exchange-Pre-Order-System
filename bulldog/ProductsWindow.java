package bulldog;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import java.awt.Color;

public class ProductsWindow extends JFrame {

	private JPanel contentPane;
	private JButton aboutBtn2;
	private JButton productsBtn2;
	private JButton newReleaseBtn2;
	private JButton logInBtn2;
	private JButton registerBtn2;
	private JTextField searchBar1;
	private JScrollBar scrollBar1;
	private JPanel productPanel1;
	private JButton searchBtn1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductsWindow frame = new ProductsWindow();
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
	public ProductsWindow() {
		setTitle("PRODUCTS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		aboutBtn2 = new JButton("ABOUT");
		aboutBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		aboutBtn2.setBounds(240, 35, 89, 23);
		contentPane.add(aboutBtn2);
		
		productsBtn2 = new JButton("PRODUCTS");
		productsBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		productsBtn2.setBounds(339, 35, 89, 23);
		contentPane.add(productsBtn2);
		
		newReleaseBtn2 = new JButton("NEW RELEASE");                  
		newReleaseBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		newReleaseBtn2.setBounds(438, 35, 106, 23);
		contentPane.add(newReleaseBtn2);
		
		logInBtn2 = new JButton("Log in");
		logInBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		logInBtn2.setBounds(577, 35, 89, 23);
		contentPane.add(logInBtn2);
		
		registerBtn2 = new JButton("Register");
		registerBtn2.setBounds(676, 35, 89, 23);
		contentPane.add(registerBtn2);
		
		searchBar1 = new JTextField();
		searchBar1.setBounds(260, 94, 406, 20);
		contentPane.add(searchBar1);
		searchBar1.setColumns(10);
		
		searchBtn1 = new JButton("SEARCH");
		searchBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		searchBtn1.setBounds(676, 93, 89, 23);
		contentPane.add(searchBtn1);
		
		productPanel1 = new JPanel();
		productPanel1.setBackground(Color.LIGHT_GRAY);
		productPanel1.setBounds(20, 135, 745, 309);
		contentPane.add(productPanel1);
		productPanel1.setLayout(null);
		
		scrollBar1 = new JScrollBar();
		scrollBar1.setBounds(728, 0, 17, 309);
		productPanel1.add(scrollBar1);

	}
}
