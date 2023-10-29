package bulldog;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

public class AdminItemCatalogWindow extends JFrame {

	private JPanel contentPane;
	private JPanel SidePanelItemCatalog;
	private JPanel ItemCatalogPanel;
	private JTextField SearchBarTxt;
	private JButton AddItemBtn;
	private JButton EditItemBtn;
	private JButton AdminControlBtn;
	private JButton LogOutBtn;
	private JLabel ItemCataloglbl2;
	private JButton searchBtn;
	private JScrollBar scrollBar;
	private JButton ItemCatalogBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminItemCatalogWindow frame = new AdminItemCatalogWindow();
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
	public AdminItemCatalogWindow() {
		setTitle("Admin Item Catalog");
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
		
		ItemCatalogPanel = new JPanel();
		ItemCatalogPanel.setBounds(180, 69, 606, 386);
		contentPane.add(ItemCatalogPanel);
		ItemCatalogPanel.setLayout(null);
		
		scrollBar = new JScrollBar();
		scrollBar.setBounds(590, 0, 17, 408);
		ItemCatalogPanel.add(scrollBar);
		
		SearchBarTxt = new JTextField();
		SearchBarTxt.setBounds(284, 11, 191, 20);
		ItemCatalogPanel.add(SearchBarTxt);
		SearchBarTxt.setColumns(10);
		
		searchBtn = new JButton("SEARCH");
		searchBtn.setBounds(485, 10, 89, 23);
		ItemCatalogPanel.add(searchBtn);
		
		ItemCataloglbl2 = new JLabel("ITEM CATALOG");
		ItemCataloglbl2.setBounds(193, 11, 159, 20);
		contentPane.add(ItemCataloglbl2);
	}

}
