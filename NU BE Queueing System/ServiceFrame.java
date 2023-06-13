
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import nube.model.UserManagement;
import nube.model.Users;

public class ServiceFrame extends JFrame implements ActionListener{
	private JPanel topPanel, topLeftPanel, topRightPanel;
	private ImageIcon logo;
	private Image image, resizedImage;
	private JLabel logoLabel;
	private JButton orderSlip, reservation;
//	private JButton service;
    private JLayeredPane layeredPane;
        
    private OrderSlipPanel orderslipPanel;
    private ReservationPanel reservationPanel;
    private JMenu menu;
    private JMenuBar menuBar;
    private JMenuItem logout;
	

	ServiceFrame(String title, String firstName) {
		setTitle(title);
		
		topPanel = new JPanel();
		topPanel.setBackground(new Color(0x293478));
		topPanel.setBounds(0, 0, 1185, 80);
		topPanel.setLayout(new BorderLayout());
		
		topLeftPanel = new JPanel();
		topLeftPanel.setBackground(new Color(0x293478));
		topLeftPanel.setPreferredSize(new Dimension(450, 80));
		topLeftPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 5));
		
		logo = new ImageIcon("C:\\Users\\abiga\\OneDrive\\Desktop\\Project(NU BE Queueing Management System)\\logo.png");
		image = logo.getImage() ;
		resizedImage = image.getScaledInstance(100, 70, java.awt.Image.SCALE_SMOOTH);
		logo = new ImageIcon(resizedImage);
		 
		logoLabel = new JLabel("<html> <font size=\"6\"> NU BULLDOG EXCHANGE </font> <br> <font size=\"5\"> QUEUEING MANAGEMENT </font> <html>");
		logoLabel.setFont(new java.awt.Font("Tahoma", Font.BOLD, 20));
		logoLabel.setIconTextGap(10);
		logoLabel.setForeground(Color.WHITE);
		logoLabel.setIcon(logo);
		
		topLeftPanel.add(logoLabel);
		
		topRightPanel = new JPanel();
		topRightPanel.setBackground(new Color(0x293478));
		topRightPanel.setPreferredSize(new Dimension(1000, 80));
		topRightPanel.setLayout(new FlowLayout(FlowLayout.TRAILING, 10, 0));
		
		orderSlip = new JButton("ORDER SLIP");
		orderSlip.setHorizontalAlignment(SwingConstants.CENTER);
		orderSlip.setFont(new Font("Tahoma", Font.BOLD, 18));
		orderSlip.setBackground(new Color(0x293478));
		orderSlip.setForeground(Color.WHITE);
		orderSlip.setPreferredSize(new Dimension(150,80));
		orderSlip.setBorderPainted(false);
		orderSlip.setFocusable(false);
		orderSlip.addActionListener(this);
		
		menu = new JMenu("Howdy, " + firstName);
		menu.setPreferredSize(new Dimension(150,80));
		menu.setHorizontalTextPosition(SwingConstants.CENTER);
		menu.setFont(new Font("Tahoma", Font.BOLD, 18));
		menu.setForeground(Color.WHITE);
		menu.setFocusable(false);
		menu.setBorderPainted(false);
		menu.addActionListener(this);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(0x293478));
		
		
		logout = new JMenuItem("LOGOUT");
		logout.setOpaque(true);
		logout.setBackground(new Color(0XFF3333));
		logout.setFont(new Font("Tahoma", Font.BOLD, 18));
		logout.setPreferredSize(new Dimension(150, 20));
		logout.setForeground(Color.WHITE);
		logout.setFocusable(false);
		logout.setBorderPainted(false);
		logout.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            if (e.getSource() == logout) {
	            	int leave = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
					if (leave == JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(null, "Thank you for using NU Bulldog Exchange Queueing Management!");
						
						dispose();
						
						HomeFrame home = new HomeFrame("");
					}
	            }
	        }
	    });

		menu.add(logout);
		menuBar.add(menu);

		orderSlip = new JButton("ORDER SLIP");
		orderSlip.setHorizontalAlignment(SwingConstants.CENTER);
		orderSlip.setFont(new Font("Tahoma", Font.BOLD, 18));
		orderSlip.setBackground(new Color(0x293478));
		orderSlip.setForeground(Color.WHITE);
		orderSlip.setPreferredSize(new Dimension(150,80));
		orderSlip.setBorderPainted(false);
		orderSlip.setFocusable(false);
		orderSlip.addActionListener(this);
		
		reservation = new JButton("RESERVATION");
		reservation.setHorizontalAlignment(SwingConstants.CENTER);
		reservation.setFont(new Font("Tahoma", Font.BOLD, 18));
		reservation.setBackground(new Color(0x293478));
		reservation.setForeground(Color.WHITE);
		reservation.setPreferredSize(new Dimension(170,80));
		reservation.setBorderPainted(false);
		reservation.setFocusable(false);
		reservation.addActionListener(this);
		
		topRightPanel.add(orderSlip);
		topRightPanel.add(reservation);
		topRightPanel.add(menuBar);
		
		topPanel.add(topLeftPanel, BorderLayout.WEST);
		topPanel.add(topRightPanel, BorderLayout.EAST);
                
        layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 80, 1185, 585);
                
        orderslipPanel = new OrderSlipPanel(0x29FF78);
                
        reservationPanel = new ReservationPanel(0xFFFF78);
                
        layeredPane.add(orderslipPanel.getPanel(), Integer.valueOf(1));
		layeredPane.add(reservationPanel.getPanel(), Integer.valueOf(0));
		
		add(topPanel);
        add(layeredPane);
		
		setSize(new Dimension(1200, 700));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource().equals(orderSlip)) {
			orderSlip.setForeground(Color.orange);
			reservation.setForeground(Color.white);
			menu.setForeground(Color.white);
                        
            orderslipPanel.setVisible(true);
            reservationPanel.setVisible(false);
		
		} else if (e.getSource().equals(reservation)) {
			orderSlip.setForeground(Color.white);
			reservation.setForeground(Color.orange);
			menu.setForeground(Color.white);
                        
            orderslipPanel.setVisible(false);
            reservationPanel.setVisible(true);
		
		} else if (e.getSource().equals(menu)) {
			orderSlip.setForeground(Color.white);
			reservation.setForeground(Color.white);
			menu.setForeground(Color.orange);
		}
		
	}
}
