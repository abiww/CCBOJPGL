import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame implements ActionListener {
	JFrame frame;
	JPanel topPanel, topLeftPanel, topRightPanel, centerPanel;
	JLayeredPane layeredPane;
	JPanel homePanel, aboutPanel, registrationPanel, registerPanel, registerPicturePanel;
	JButton home, about, registration, register, orderSlip;
	ImageIcon logo;
	Image image, resizedImage;
	JLabel logoLabel, fullname, studentID, department, program;
	JTextField fullnameTF, studentIDTF, departmentTF, programTF;
	
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
		registration.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18));
		registration.setBackground(new Color(0x293478));
		registration.setForeground(Color.WHITE);
		registration.setPreferredSize(new Dimension(180, 80));
		registration.setBorderPainted(false);
		registration.setFocusable(false);
		registration.addActionListener(this);
		
		logo = new ImageIcon("C:\\Users\\National University\\Desktop\\ALLADO_INF224\\NU BE Pics\\BulldogLogo.png");
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
		topRightPanel.add(registration);
		
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
		
		registrationPanel = new JPanel();
		registrationPanel.setBackground(Color.ORANGE);
		registrationPanel.setBounds(0, 0, 1185, 630);
		registrationPanel.setLayout(null);
		
		//add details in registration panel
		registerPanel = new JPanel();
		registerPanel.setBounds(400, 65, 400, 450);
		registerPanel.setLayout(null);
		
		fullname = new JLabel("NAME:");
		fullname.setFont(new Font("Tahoma", Font.BOLD, 15));
		fullname.setForeground(Color.BLACK);
		fullname.setBounds(35, 50, 50, 25);
		
		studentID = new JLabel("STUDENT ID:");
		studentID.setFont(new Font("Tahoma", Font.BOLD, 15));
		studentID.setForeground(Color.BLACK);
		studentID.setBounds(35, 90, 100, 25);
		
		department = new JLabel("DEPARTMENT:");
		department.setFont(new Font("Tahoma", Font.BOLD, 15));
		department.setForeground(Color.BLACK);
		department.setBounds(35, 130, 110, 25);
		
		program = new JLabel("PROGRAM:");
		program.setFont(new Font("Tahoma", Font.BOLD, 15));
		program.setForeground(Color.BLACK);
		program.setBounds(35, 170, 100, 25);
		
		fullnameTF = new JTextField();
		fullnameTF.setBounds(165, 50, 200, 25);
		
		studentIDTF = new JTextField();
		studentIDTF.setBounds(165, 90, 200, 25);
		
		departmentTF = new JTextField();
		departmentTF.setBounds(165, 130, 200, 25);
		
		programTF = new JTextField();
		programTF.setBounds(165, 170, 200, 25);
		
		register = new JButton("REGISTER");
		register.setHorizontalAlignment(SwingConstants.CENTER);
		register.setFont(new Font("Tahoma", Font.BOLD, 15));
		register.setBackground(new Color(0x00FF00));
		register.setForeground(Color.WHITE);
		register.setBounds(165, 210, 115, 25);
		register.setFocusable(false);
		register.addActionListener(this);

		registerPanel.add(fullname);
		registerPanel.add(studentID);
		registerPanel.add(department);
		registerPanel.add(program);
		registerPanel.add(fullnameTF);
		registerPanel.add(studentIDTF);
		registerPanel.add(departmentTF);
		registerPanel.add(programTF);
		registerPanel.add(register);
		
		registrationPanel.add(registerPanel, BorderLayout.CENTER);
		
		layeredPane.add(homePanel, Integer.valueOf(2));
		layeredPane.add(aboutPanel, Integer.valueOf(1));
		layeredPane.add(registrationPanel, Integer.valueOf(0));
		
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
		
		if (e.getSource().equals(register)) {
			frame.dispose();
			new FeaturesFrame ("NU Bulldog Exchange Queueing Management System");
		}
	}
	
	public static void main (String[] args) {
		new MainFrame ("NU Bulldog Exchange Queueing Management System");
	}
}
