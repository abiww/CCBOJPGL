import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomeFrame extends JFrame implements ActionListener {
	private JPanel topPanel, topLeftPanel, topRightPanel;
	private ImageIcon logo;
	private Image image, resizedImage;
	private JLabel logoLabel;
	private JButton home, about, registration;
	private JLayeredPane layeredPane;
	
	private HomePanel homePanel;
	private AboutPanel aboutPanel;
	private RegistrationPanel registrationPanel;

	HomeFrame(String title) {
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
		
		home = new JButton("HOME");
		home.setHorizontalAlignment(SwingConstants.CENTER);
		home.setFont(new Font("Tahoma", Font.BOLD, 18));
		home.setBackground(new Color(0x293478));
		home.setForeground(Color.WHITE);
		home.setPreferredSize(new Dimension(90,80));
		home.setBorderPainted(false);
		home.setFocusable(false);
		home.addActionListener(this);
		
		about = new JButton("ABOUT");
		about.setHorizontalAlignment(SwingConstants.CENTER);
		about.setFont(new Font("Tahoma", Font.BOLD, 18));
		about.setBackground(new Color(0x293478));
		about.setForeground(Color.WHITE);
		about.setPreferredSize(new Dimension(100,80));
		about.setBorderPainted(false);
		about.setFocusable(false);
		about.addActionListener(this);
		
		registration = new JButton("REGISTRATION");
		registration.setHorizontalAlignment(SwingConstants.CENTER);
		registration.setFont(new Font("Tahoma", Font.BOLD, 18));
		registration.setBackground(new Color(0x293478));
		registration.setForeground(Color.WHITE);
		registration.setPreferredSize(new Dimension(180,80));
		registration.setBorderPainted(false);
		registration.setFocusable(false);
		registration.addActionListener(this);
		
		topRightPanel.add(home);
		topRightPanel.add(about);
		topRightPanel.add(registration);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 80, 1185, 585);
		
		homePanel = new HomePanel(0x00BD59);
		
		aboutPanel = new AboutPanel(0x99BD59);
		
		registrationPanel = new RegistrationPanel(0xFFBD59, this);
		
		topPanel.add(topLeftPanel, BorderLayout.WEST);
		topPanel.add(topRightPanel, BorderLayout.EAST);
		
		layeredPane.add(homePanel.getPanel(), Integer.valueOf(2));
		layeredPane.add(aboutPanel.getPanel(), Integer.valueOf(1));
		layeredPane.add(registrationPanel.getPanel(), Integer.valueOf(0));
		
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
		
		if (e.getSource().equals(about)) {
			about.setForeground(Color.orange);
			home.setForeground(Color.white);
			registration.setForeground(Color.white);
			
			aboutPanel.setVisible(true);
			homePanel.setVisible(false);
			registrationPanel.setVisible(false);
			
		} else if (e.getSource().equals(home)) {
			about.setForeground(Color.white);
			home.setForeground(Color.orange);
			registration.setForeground(Color.white);
			
			aboutPanel.setVisible(false);
			homePanel.setVisible(true);
			registrationPanel.setVisible(false);
			
		} else if (e.getSource().equals(registration)) {
			about.setForeground(Color.white);
			home.setForeground(Color.white);
			registration.setForeground(Color.orange);
			
			aboutPanel.setVisible(false);
			homePanel.setVisible(false);
			registrationPanel.setVisible(true);
		}
	}
	
	public static void main (String[] args) {
//		HomeFrame home = new HomeFrame("NU Bulldog Exchange Queueing Management System");
	}

}
