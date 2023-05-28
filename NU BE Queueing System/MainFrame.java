import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame implements ActionListener {
	JFrame frame;
	JPanel topPanel, topLeftPanel, topRightPanel, centerPanel;
	JLayeredPane layeredPane;
	JPanel homePanel, aboutPanel, reservationPanel, registerPanel, orderSlipPanel;
	JButton home, about, reservation, register, orderSlip;
	ImageIcon logo;
	Image image, resizedImage;
	JLabel logoLabel, titleLabel;
	
	MainFrame (String title) {
		frame = new JFrame(title);
		
		topPanel = new JPanel();
		topPanel.setBackground(new Color(0x293478));
		topPanel.setBounds(0, 0, 1185, 80);
		topPanel.setLayout(new BorderLayout());
		
		topLeftPanel = new JPanel();
		topLeftPanel.setBackground(new Color(0x293478));
		topLeftPanel.setPreferredSize(new Dimension(450, 80));
		topLeftPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 5));
		
		topRightPanel = new JPanel();
		topRightPanel.setBackground(new Color(0x293478));
		topRightPanel.setPreferredSize(new Dimension(1000, 80));
		topRightPanel.setLayout(new FlowLayout(FlowLayout.TRAILING, 5, 0));
		
		about = new JButton("ABOUT");
		about.setHorizontalAlignment(SwingConstants.CENTER);
		about.setFont(new Font("Tahoma", Font.BOLD, 18));
		about.setBackground(new Color(0x293478));
		about.setForeground(Color.WHITE);
		about.setPreferredSize(new Dimension(100,80));
		about.setBorderPainted(false);
		about.setFocusable(false);
		about.addActionListener(this);
		
		home = new JButton("HOME");
		home.setHorizontalAlignment(SwingConstants.CENTER);
		home.setFont(new Font("Tahoma", Font.BOLD, 18));
		home.setBackground(new Color(0x293478));
		home.setForeground(Color.WHITE);
		home.setPreferredSize(new Dimension(90,80));
		home.setBorderPainted(false);
		home.setFocusable(false);
		home.addActionListener(this);
		
		reservation = new JButton("RESERVATION");
		reservation.setHorizontalAlignment(SwingConstants.CENTER);
		reservation.setFont(new Font("Tahoma", Font.BOLD, 18));
		reservation.setBackground(new Color(0x293478));
		reservation.setForeground(Color.WHITE);
		reservation.setPreferredSize(new Dimension(170,80));
		reservation.setBorderPainted(false);
		reservation.setFocusable(false);
		reservation.addActionListener(this);
		
		orderSlip = new JButton("ORDER SLIP");
		orderSlip.setHorizontalAlignment(SwingConstants.CENTER);
		orderSlip.setFont(new Font("Tahoma", Font.BOLD, 18));
		orderSlip.setBackground(new Color(0x293478));
		orderSlip.setForeground(Color.WHITE);
		orderSlip.setPreferredSize(new Dimension(150,80));
		orderSlip.setBorderPainted(false);
		orderSlip.setFocusable(false);
		orderSlip.addActionListener(this);
		
		register = new JButton("REGISTRATION");
		register.setHorizontalAlignment(SwingConstants.CENTER);
		register.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18));
		register.setBackground(new Color(0x293478));
		register.setForeground(Color.WHITE);
		register.setPreferredSize(new Dimension(180, 80));
		register.setBorderPainted(false);
		register.setFocusable(false);
		register.addActionListener(this);
		
		logo = new ImageIcon("C:\\Users\\63999\\Downloads\\download-removebg-preview.png");
		image = logo.getImage() ;
		resizedImage = image.getScaledInstance(100, 70, java.awt.Image.SCALE_SMOOTH);
		logo = new ImageIcon(resizedImage);
		 
		logoLabel = new JLabel("<html> <font size=\"6\"> NU BULLDOG EXCHANGE </font> <br> <font size=\"5\"> QUEUEING MANAGEMENT </font> <html>");
		logoLabel.setFont(new java.awt.Font("Tahoma", Font.BOLD, 20));
		logoLabel.setIconTextGap(10);
		logoLabel.setForeground(Color.WHITE);
		logoLabel.setIcon(logo);
	
		
		topLeftPanel.add(logoLabel);
		
		topRightPanel.add(home);
		topRightPanel.add(about); 
		topRightPanel.add(register);
		topRightPanel.add(orderSlip);
		topRightPanel.add(reservation);
		
		topPanel.add(topLeftPanel, BorderLayout.WEST);
		topPanel.add(topRightPanel, BorderLayout.EAST);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 80, 1185,650);
		
		
		
		aboutPanel = new JPanel();
		aboutPanel.setBackground(Color.MAGENTA);
		aboutPanel.setBounds(0, 0, 1185,630);
		
		homePanel = new JPanel();
		homePanel.setBackground(Color.BLUE);
		homePanel.setBounds(0, 0, 1185, 630);
		
		registerPanel = new JPanel();
		registerPanel.setBackground(Color.ORANGE);
		registerPanel.setBounds(0, 0, 1185, 630);
		
		reservationPanel = new JPanel();
		reservationPanel.setBackground(Color.GREEN);
		reservationPanel.setBounds(0, 0, 1185, 630);
		
		orderSlipPanel = new JPanel();
		orderSlipPanel.setBackground(Color.PINK);
		orderSlipPanel.setBounds(0, 0, 1185, 630);
		
		layeredPane.add(homePanel, Integer.valueOf(4));
		layeredPane.add(aboutPanel, Integer.valueOf(3));
		layeredPane.add(registerPanel, Integer.valueOf(2));
		layeredPane.add(orderSlipPanel, Integer.valueOf(1));
		layeredPane.add(reservationPanel, Integer.valueOf(0));
		
		frame.add(topPanel);
		frame.add(layeredPane);
		
		frame.setSize(new Dimension(1200, 700));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource().equals(about)) {
			about.setForeground(Color.orange);
			home.setForeground(Color.white);
			register.setForeground(Color.white);
			orderSlip.setForeground(Color.white);
			reservation.setForeground(Color.white);
			
			aboutPanel.setVisible(true);
			homePanel.setVisible(false);
			registerPanel.setVisible(false);
			orderSlipPanel.setVisible(false);
			reservationPanel.setVisible(false);
			
		} else if (e.getSource().equals(home)) {
			about.setForeground(Color.white);
			home.setForeground(Color.orange);
			register.setForeground(Color.white);
			orderSlip.setForeground(Color.white);
			reservation.setForeground(Color.white);
			
			aboutPanel.setVisible(false);
			homePanel.setVisible(true);
			registerPanel.setVisible(false);
			orderSlipPanel.setVisible(false);
			reservationPanel.setVisible(false);
			
		} else if (e.getSource().equals(register)) {
			about.setForeground(Color.white);
			home.setForeground(Color.white);
			register.setForeground(Color.orange);
			orderSlip.setForeground(Color.white);
			reservation.setForeground(Color.white);
			
			aboutPanel.setVisible(false);
			homePanel.setVisible(false);
			registerPanel.setVisible(true);
			orderSlipPanel.setVisible(false);
			reservationPanel.setVisible(false);
			
		} else if (e.getSource().equals(orderSlip)) {
			about.setForeground(Color.white);
			home.setForeground(Color.white);
			register.setForeground(Color.white);
			orderSlip.setForeground(Color.orange);
			reservation.setForeground(Color.white);
			
			aboutPanel.setVisible(false);
			homePanel.setVisible(false);
			registerPanel.setVisible(false);
			orderSlipPanel.setVisible(true);
			reservationPanel.setVisible(false);
			
		} else if (e.getSource().equals(reservation)) {
			about.setForeground(Color.white);
			home.setForeground(Color.white);
			register.setForeground(Color.white);
			orderSlip.setForeground(Color.white);
			reservation.setForeground(Color.orange);	
			
			aboutPanel.setVisible(false);
			homePanel.setVisible(false);
			registerPanel.setVisible(false);
			orderSlipPanel.setVisible(false);
			reservationPanel.setVisible(true);
		}
	}
	
	public static void main (String[] args) {
		new MainFrame ("NU Bulldog Exchange Queueing Management System");
	}
}
