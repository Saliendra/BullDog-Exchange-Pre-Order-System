package bulldog;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class AdminEditItemWindow extends JFrame {

	private JPanel contentPane;
	private JPanel SidePanelItemCatalog;
	private JPanel editItemPanel;
	private JLabel editItemLbl;
	private JLabel image1;
	private JLabel image2;
	private JLabel image3;
	private JLabel image4;
	private JButton insertImageBtn;
	private JButton deleteItemBtn;
	private JButton saveEditBtn;
	private JLabel itemNameLbl;
	private JTextField itemNameBtn;
	private JLabel itemQuantityLbl;
	private JTextField itemQuantityTxt;
	private JLabel itemCategoryLbl;
	private JComboBox itemCategoryCmb;
	private JLabel itemColorLbl;
	private JTextField itemColorTxt;
	private JLabel itemSizeLbl;
	private JTextField textField;
	private JButton addColorBtn;
	private JButton addSizeBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminEditItemWindow frame = new AdminEditItemWindow();
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
	public AdminEditItemWindow() {
		setTitle("Admin Edit Item");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		editItemPanel = new JPanel();
		editItemPanel.setBounds(98, 49, 626, 369);
		contentPane.add(editItemPanel);
		editItemPanel.setBackground(Color.GRAY);
		editItemPanel.setLayout(null);
		
		editItemLbl = new JLabel("EDIT ITEM");
		editItemLbl.setBounds(22, 11, 102, 21);
		editItemPanel.add(editItemLbl);
		
		image1 = new JLabel("Image1");
		image1.setHorizontalAlignment(SwingConstants.CENTER);
		image1.setBounds(22, 61, 66, 89);
		editItemPanel.add(image1);
		
		image2 = new JLabel("Image2");
		image2.setHorizontalAlignment(SwingConstants.CENTER);
		image2.setBounds(98, 61, 66, 89);
		editItemPanel.add(image2);
		
		image3 = new JLabel("Image3");
		image3.setHorizontalAlignment(SwingConstants.CENTER);
		image3.setBounds(22, 173, 66, 89);
		editItemPanel.add(image3);
		
		image4 = new JLabel("Image4");
		image4.setHorizontalAlignment(SwingConstants.CENTER);
		image4.setBounds(98, 173, 66, 89);
		editItemPanel.add(image4);
		
		insertImageBtn = new JButton("INSERT IMAGE");
		insertImageBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		insertImageBtn.setBounds(41, 301, 113, 23);
		editItemPanel.add(insertImageBtn);
		
		deleteItemBtn = new JButton("DELETE ITEM");
		deleteItemBtn.setBackground(Color.RED);
		deleteItemBtn.setBounds(380, 335, 113, 23);
		editItemPanel.add(deleteItemBtn);
		
		saveEditBtn = new JButton("SAVE AND EDIT");
		saveEditBtn.setBackground(Color.GREEN);
		saveEditBtn.setBounds(503, 335, 113, 23);
		editItemPanel.add(saveEditBtn);
		
		itemNameLbl = new JLabel("ITEM NAME");
		itemNameLbl.setBounds(280, 87, 81, 14);
		editItemPanel.add(itemNameLbl);
		
		itemNameBtn = new JTextField();
		itemNameBtn.setBounds(280, 112, 113, 20);
		editItemPanel.add(itemNameBtn);
		itemNameBtn.setColumns(10);
		
		itemQuantityLbl = new JLabel("ITEM QUANTITY");
		itemQuantityLbl.setBounds(280, 239, 81, 14);
		editItemPanel.add(itemQuantityLbl);
		
		itemQuantityTxt = new JTextField();
		itemQuantityTxt.setColumns(10);
		itemQuantityTxt.setBounds(280, 264, 113, 20);
		editItemPanel.add(itemQuantityTxt);
		
		itemCategoryLbl = new JLabel("ITEM CATEGORY");
		itemCategoryLbl.setBounds(280, 163, 81, 14);
		editItemPanel.add(itemCategoryLbl);
		
		itemCategoryCmb = new JComboBox();
		itemCategoryCmb.setBounds(280, 188, 113, 22);
		editItemPanel.add(itemCategoryCmb);
		
		itemColorLbl = new JLabel("ITEM COLOR");
		itemColorLbl.setBounds(445, 87, 81, 14);
		editItemPanel.add(itemColorLbl);
		
		itemColorTxt = new JTextField();
		itemColorTxt.setColumns(10);
		itemColorTxt.setBounds(445, 112, 113, 20);
		editItemPanel.add(itemColorTxt);
		
		itemSizeLbl = new JLabel("ITEM SIZE");
		itemSizeLbl.setBounds(445, 210, 81, 14);
		editItemPanel.add(itemSizeLbl);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(445, 236, 113, 20);
		editItemPanel.add(textField);
		
		addColorBtn = new JButton("ADD");
		addColorBtn.setBounds(509, 143, 55, 23);
		editItemPanel.add(addColorBtn);
		
		addSizeBtn = new JButton("ADD");
		addSizeBtn.setBounds(509, 263, 55, 23);
		editItemPanel.add(addSizeBtn);
		
		SidePanelItemCatalog = new JPanel();
		SidePanelItemCatalog.setBackground(Color.LIGHT_GRAY);
		SidePanelItemCatalog.setBounds(0, 0, 180, 455);
		contentPane.add(SidePanelItemCatalog);
		SidePanelItemCatalog.setLayout(null);
		
	}

}
