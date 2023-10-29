package bulldog;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class BasketWindow extends JFrame {

	private JPanel contentPane;
	private JTextField TotalAmountTxt;
	private JPanel BasketPanel1;
	private JLabel BasketLabel1;
	private JLabel TotalLbl1;
	private JPanel BasketScrollPanel1;
	private JScrollBar scrollBar;
	private JButton CheckOutBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasketWindow frame = new BasketWindow();
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
	public BasketWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BasketPanel1 = new JPanel();
		BasketPanel1.setBackground(Color.LIGHT_GRAY);
		BasketPanel1.setBounds(10, 99, 766, 323);
		contentPane.add(BasketPanel1);
		BasketPanel1.setLayout(null);
		
		CheckOutBtn = new JButton("Check Out");
		CheckOutBtn.setBounds(667, 289, 89, 23);
		BasketPanel1.add(CheckOutBtn);
		
		TotalAmountTxt = new JTextField();
		TotalAmountTxt.setBounds(571, 290, 86, 20);
		BasketPanel1.add(TotalAmountTxt);
		TotalAmountTxt.setColumns(10);
		
		TotalLbl1 = new JLabel("TOTAL:");
		TotalLbl1.setBounds(524, 293, 46, 14);
		BasketPanel1.add(TotalLbl1);
		
		BasketScrollPanel1 = new JPanel();
		BasketScrollPanel1.setBackground(Color.WHITE);
		BasketScrollPanel1.setBounds(10, 34, 746, 244);
		BasketPanel1.add(BasketScrollPanel1);
		BasketScrollPanel1.setLayout(null);
		
		scrollBar = new JScrollBar();
		scrollBar.setBounds(729, 0, 17, 244);
		BasketScrollPanel1.add(scrollBar);
		
		BasketLabel1 = new JLabel("Your Basket");
		BasketLabel1.setBounds(10, 11, 107, 14);
		BasketPanel1.add(BasketLabel1);
		
	}

}
