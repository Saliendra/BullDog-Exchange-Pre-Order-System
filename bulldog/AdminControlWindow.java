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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminControlWindow extends JFrame {

	private JPanel contentPane;
	private JPanel SidePanelItemCatalog;
	private JButton AddItemBtn;
	private Component EditItemBtn;
	private Component AdminControlBtn;
	private Component LogOutBtn;
	private Component ItemCatalogBtn;
	private Component AdminControlLbl;
	private JPanel AdminControlPanel;
	private JTextField searchTxt;
	private JButton searchBtn;
	private JLabel maxOrderLbl;
	private JTextField maxOrderTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminControlWindow frame = new AdminControlWindow();
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
	public AdminControlWindow() {
		setTitle("Admin Control");
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
	
	
		AdminControlLbl = new JLabel("ADMIN CONTROL");
		AdminControlLbl.setBounds(193, 11, 159, 20);
		contentPane.add(AdminControlLbl);
		
		AdminControlPanel = new JPanel();
		AdminControlPanel.setBounds(180, 69, 606, 386);
		contentPane.add(AdminControlPanel);
		AdminControlPanel.setLayout(null);
		
		searchTxt = new JTextField();
		searchTxt.setBounds(317, 11, 156, 20);
		AdminControlPanel.add(searchTxt);
		searchTxt.setColumns(10);
		
		searchBtn = new JButton("SEARCH");
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		searchBtn.setBounds(483, 10, 89, 23);
		AdminControlPanel.add(searchBtn);
		
		maxOrderLbl = new JLabel("Set maximum item to pre-order");
		maxOrderLbl.setBounds(23, 59, 156, 14);
		AdminControlPanel.add(maxOrderLbl);
		
		maxOrderTxt = new JTextField();
		maxOrderTxt.setBounds(22, 78, 157, 20);
		AdminControlPanel.add(maxOrderTxt);
		maxOrderTxt.setColumns(10);
	}

}
