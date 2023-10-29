package bulldog;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class ProductPreviewWindow extends JFrame {

	private JPanel contentPane;
	private JPanel productviewPanel;
	private JButton colorBtn1;
	private JButton colorBtn2;
	private JButton sizeBtn1;
	private JButton sizeBtn2;
	private JLabel txtOutputQuantityLbl;
	private JButton minusBtn1;
	private JButton addBtn1;
	private JButton addToCartBtn1;
	private JButton buyBtn1;
	private JTextField txtOutputQuantity1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductPreviewWindow frame = new ProductPreviewWindow();
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
	public ProductPreviewWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		productviewPanel = new JPanel();
		productviewPanel.setBackground(Color.LIGHT_GRAY);
		productviewPanel.setBounds(10, 99, 766, 323);
		contentPane.add(productviewPanel);
		productviewPanel.setLayout(null);
		
		colorBtn1 = new JButton("");
		colorBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		colorBtn1.setBounds(295, 62, 144, 23);
		productviewPanel.add(colorBtn1);
		
		colorBtn2 = new JButton("");
		colorBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		colorBtn2.setBounds(295, 91, 144, 23);
		productviewPanel.add(colorBtn2);
		
		sizeBtn1 = new JButton("");
		sizeBtn1.setBounds(295, 143, 144, 23);
		productviewPanel.add(sizeBtn1);
		
		sizeBtn2 = new JButton("");
		sizeBtn2.setBounds(295, 173, 144, 23);
		productviewPanel.add(sizeBtn2);
		
		JLabel colorLbl1 = new JLabel("Color");
		colorLbl1.setBounds(226, 80, 59, 14);
		productviewPanel.add(colorLbl1);
		
		JLabel sizeLbl1 = new JLabel("Size");
		sizeLbl1.setBounds(226, 161, 59, 14);
		productviewPanel.add(sizeLbl1);
		
		JLabel ImageLbl1 = new JLabel("IMAGE");
		ImageLbl1.setHorizontalAlignment(SwingConstants.CENTER);
		ImageLbl1.setBounds(10, 11, 206, 286);
		productviewPanel.add(ImageLbl1);
		
		txtOutputQuantityLbl = new JLabel("txtOutputQuantity");
		txtOutputQuantityLbl.setBounds(226, 236, 59, 14);
		productviewPanel.add(txtOutputQuantityLbl);
		
		minusBtn1 = new JButton("-");                        
		minusBtn1.setBackground(Color.RED);
		minusBtn1.setBounds(285, 232, 46, 23);
		productviewPanel.add(minusBtn1);
		
		addBtn1 = new JButton("+");
		addBtn1.setBackground(Color.GREEN);
		addBtn1.setBounds(385, 232, 46, 23);
		productviewPanel.add(addBtn1);
		
		addToCartBtn1 = new JButton("Add to Cart");
		addToCartBtn1.setBounds(557, 289, 89, 23);
		productviewPanel.add(addToCartBtn1);
		
		buyBtn1 = new JButton("Buy Now");
		buyBtn1.setBounds(656, 289, 89, 23);
		productviewPanel.add(buyBtn1);
		
		txtOutputQuantity1 = new JTextField();
		txtOutputQuantity1.setBounds(341, 233, 34, 20);
		productviewPanel.add(txtOutputQuantity1);
		txtOutputQuantity1.setColumns(10);
		}
}
