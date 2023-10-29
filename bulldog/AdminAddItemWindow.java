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
import javax.swing.JComboBox;

public class AdminAddItemWindow extends JFrame {

	private JPanel contentPane;
	private JPanel SidePanelItemCatalog;
	private JButton AddItemBtn;
	private Component EditItemBtn;
	private JButton AdminControlBtn;
	private Component LogOutBtn;
	private Component ItemCatalogBtn;
	private JLabel AddItembtn;
	private JPanel AddItemPanel;
	private JLabel Image1;
	private JLabel Image2;
	private JLabel Image3;
	private JLabel Image4;
	private JButton insertBtn;
	private JTextField searchTxt;
	private JButton searchBtn;
	private JLabel itemNameLbl;
	private JTextField itemNameTxt;
	private JLabel itemCategoryLbl;
	private JTextField itemQuantityTxt;
	private JComboBox ItemCategoryCmb;
	private JLabel itemQuantityLbl;
	private JTextField itemColorTxt;
	private JTextField itemSizeTxt;
	private JButton AddItemBtn1;
	private JButton AddSizeBtn;
	private JLabel itemSizeLbl;
	private JButton AddColorBtn;
	private JLabel itemColorLbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminAddItemWindow frame = new AdminAddItemWindow();
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
	public AdminAddItemWindow() {
		setTitle("Admin Add Item");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		SidePanelItemCatalog = new JPanel();
		SidePanelItemCatalog.setBackground(Color.LIGHT_GRAY);
		SidePanelItemCatalog.setBounds(0, 0, 180, 455);
		contentPane.add(SidePanelItemCatalog);
		SidePanelItemCatalog.setLayout(null);
		
		AddItemBtn = new JButton("ADD ITEM");
		AddItemBtn.setBounds(0, 126, 180, 43);
		SidePanelItemCatalog.add(AddItemBtn);
		
		EditItemBtn = new JButton("EDIT ITEM");
		EditItemBtn.setBounds(0, 169, 180, 43);
		SidePanelItemCatalog.add(EditItemBtn);
		
		AdminControlBtn = new JButton("ADMIN CONTROL\r\n");
		AdminControlBtn.setBounds(0, 213, 180, 43);
		SidePanelItemCatalog.add(AdminControlBtn);
		
		LogOutBtn = new JButton("LOGOUT");
		LogOutBtn.setBounds(10, 410, 91, 23);
		SidePanelItemCatalog.add(LogOutBtn);
		
		ItemCatalogBtn = new JButton("ITEM CATALOG");
		ItemCatalogBtn.setBounds(0, 82, 180, 43);
		SidePanelItemCatalog.add(ItemCatalogBtn);
			
		AddItembtn = new JLabel("ADD ITEM");
		AddItembtn.setBounds(193, 11, 159, 20);
		contentPane.add(AddItembtn);
		
		AddItemPanel = new JPanel();
		AddItemPanel.setBounds(180, 69, 606, 386);
		contentPane.add(AddItemPanel);
		AddItemPanel.setLayout(null);
		
		Image1 = new JLabel("IMAGE 1");
		Image1.setHorizontalAlignment(SwingConstants.CENTER);
		Image1.setBounds(28, 59, 57, 75);
		AddItemPanel.add(Image1);
		
		Image2 = new JLabel("IMAGE 2");
		Image2.setHorizontalAlignment(SwingConstants.CENTER);
		Image2.setBounds(119, 59, 57, 75);
		AddItemPanel.add(Image2);
		
		Image3 = new JLabel("IMAGE 3");
		Image3.setHorizontalAlignment(SwingConstants.CENTER);
		Image3.setBounds(28, 189, 57, 75);
		AddItemPanel.add(Image3);
		
		Image4 = new JLabel("IMAGE 4");
		Image4.setHorizontalAlignment(SwingConstants.CENTER);
		Image4.setBounds(119, 189, 57, 75);
		AddItemPanel.add(Image4);
		
		insertBtn = new JButton("Insert Images");
		insertBtn.setBounds(45, 311, 116, 23);
		AddItemPanel.add(insertBtn);
		
		searchTxt = new JTextField();
		searchTxt.setBounds(344, 11, 141, 20);
		AddItemPanel.add(searchTxt);
		searchTxt.setColumns(10);
		
		searchBtn = new JButton("SEARCH");
		searchBtn.setBounds(495, 10, 89, 23);
		AddItemPanel.add(searchBtn);
		
		itemNameLbl = new JLabel("Item Name");
		itemNameLbl.setBounds(264, 77, 89, 14);
		AddItemPanel.add(itemNameLbl);
		
		itemNameTxt = new JTextField();
		itemNameTxt.setBounds(264, 103, 116, 20);
		AddItemPanel.add(itemNameTxt);
		itemNameTxt.setColumns(10);
		
		itemCategoryLbl = new JLabel("Item Category");
		itemCategoryLbl.setBounds(264, 154, 89, 14);
		AddItemPanel.add(itemCategoryLbl);
		
		ItemCategoryCmb = new JComboBox();
		ItemCategoryCmb.setBounds(264, 189, 116, 22);
		AddItemPanel.add(ItemCategoryCmb);
		
		itemQuantityLbl = new JLabel("Item Quantity");
		itemQuantityLbl.setBounds(264, 250, 89, 14);
		AddItemPanel.add(itemQuantityLbl);
		
		itemQuantityTxt = new JTextField();
		itemQuantityTxt.setColumns(10);
		itemQuantityTxt.setBounds(264, 275, 116, 20);
		AddItemPanel.add(itemQuantityTxt);
		
		itemColorLbl = new JLabel("Item Color");
		itemColorLbl.setBounds(453, 77, 89, 14);
		AddItemPanel.add(itemColorLbl);
		
		itemColorTxt = new JTextField();
		itemColorTxt.setColumns(10);
		itemColorTxt.setBounds(451, 103, 116, 20);
		AddItemPanel.add(itemColorTxt);
		
		AddColorBtn = new JButton("Add");
		AddColorBtn.setBounds(521, 134, 51, 23);
		AddItemPanel.add(AddColorBtn);
		
		itemSizeLbl = new JLabel("Item Size");
		itemSizeLbl.setBounds(453, 231, 89, 14);
		AddItemPanel.add(itemSizeLbl);
		
		itemSizeTxt = new JTextField();
		itemSizeTxt.setColumns(10);
		itemSizeTxt.setBounds(451, 257, 116, 20);
		AddItemPanel.add(itemSizeTxt);
		
		AddSizeBtn = new JButton("Add");
		AddSizeBtn.setBounds(533, 294, 51, 23);
		AddItemPanel.add(AddSizeBtn);
		
		AddItemBtn1 = new JButton("Add Item");
		AddItemBtn1.setBounds(468, 352, 116, 23);
		AddItemPanel.add(AddItemBtn1);
	}
}
