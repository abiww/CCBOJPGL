import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPortfolio implements ActionListener{
	JFrame frame;
	JLayeredPane layeredPane;
	
	//panels
	JPanel sidePanel;
	JPanel menuPanel;
	JPanel aboutPanel;
	JPanel skillsPanel;
	JPanel educationPanel;
	JPanel projectPanel;
	JPanel interestPanel;
	JPanel contactPanel;
	
	//image
	ImageIcon logo;
	JLabel logoLabel;
	
	//buttons
	JButton about;
	JButton skills;
	JButton project;
	JButton education;
	JButton interest;
	JButton contact;
	
	//labels
	JLabel aboutHeadings;
	JLabel skillsHeadings;
	JLabel educationHeadings;
	JLabel projectHeadings;
	JLabel interestHeadings;
	JLabel contactHeadings;
	
	 MyPortfolio() {
		 //setting frame
		 frame = new JFrame("Portfolio");
		 
		 //setting layered panel
		 layeredPane = new JLayeredPane();
		 layeredPane.setBounds(230,0,770,600);
		 
		 //setting panels
		 sidePanel = new JPanel();
		 sidePanel.setBackground(Color.ORANGE);
		 sidePanel.setBounds(0,0,30,600);
		 
		 menuPanel = new JPanel();
		 menuPanel.setBackground(Color.WHITE);
		 menuPanel.setBounds(30,0,200,600);
		 menuPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
	
		 aboutPanel = new JPanel();
		 aboutPanel.setBackground(Color.ORANGE);
		 aboutPanel.setBounds(0,0,770,600);
		 aboutPanel.setLayout(null);
		 
		 skillsPanel = new JPanel();
		 skillsPanel.setBackground(Color.CYAN);
		 skillsPanel.setBounds(0,0,770,600);
		 skillsPanel.setLayout(null);
		 
		 educationPanel = new JPanel();
		 educationPanel.setBackground(new Color(0x99FF99));
		 educationPanel.setBounds(0,0,770,600);
		 educationPanel.setLayout(null);
		 
		 projectPanel = new JPanel();
		 projectPanel.setBackground(new Color(0xCC99FF));
		 projectPanel.setBounds(0,0,770,600);
		 projectPanel.setLayout(null);
		 
		 interestPanel = new JPanel();
		 interestPanel.setBackground(new Color(0x87CEEB));
		 interestPanel.setBounds(0,0,770,600);
		 interestPanel.setLayout(null);
		 
		 contactPanel = new JPanel();
		 contactPanel.setBackground(Color.PINK);
		 contactPanel.setBounds(0,0,770,600);
		 contactPanel.setLayout(null);
		 
		 //add logo image
		 logo = new ImageIcon("C:\\Users\\National University\\Desktop\\ALLADO_INF224\\ABee.png");
		 Image image = logo.getImage() ;
		 Image resizedImage = image.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
		 logo = new ImageIcon(resizedImage);
		 
		 logoLabel = new JLabel();

		 logoLabel.setIcon(logo);
		 logoLabel.setVerticalTextPosition(JLabel.TOP);
		 
		 //add menu buttons
		 about = new JButton("ABOUT");
		 about.setFont(new Font("Tahoma", Font.BOLD, 20));
		 about.setBackground(new Color(255, 255, 255));
		 about.setForeground(Color.BLACK);
		 about.setBorderPainted(false);
		 about.setFocusable(false);
		 about.addActionListener(this);
		 
		 skills = new JButton("SKILLS");
		 skills.setFont(new Font("Tahoma", Font.BOLD, 20));
		 skills.setBackground(new Color(255, 255, 255));
		 skills.setForeground(Color.BLACK);
		 skills.setBorderPainted(false);
		 skills.setFocusable(false);
		 skills.addActionListener(this);
		 
		 education = new JButton("EDUCATION");
		 education.setFont(new Font("Tahoma", Font.BOLD, 20));
		 education.setBackground(new Color(255, 255, 255));
		 education.setForeground(Color.BLACK);
		 education.setBorderPainted(false);
		 education.setFocusable(false);
		 education.addActionListener(this);
		 
		 project = new JButton("PROJECT");
		 project.setFont(new Font("Tahoma", Font.BOLD, 20));
		 project.setBackground(new Color(255, 255, 255));
		 project.setForeground(Color.BLACK);
		 project.setBorderPainted(false);
		 project.setFocusable(false);
		 project.addActionListener(this);
		 
		 interest = new JButton("INTEREST");
		 interest.setFont(new Font("Tahoma", Font.BOLD, 20));
		 interest.setBackground(new Color(255, 255, 255));
		 interest.setForeground(Color.BLACK);
		 interest.setBorderPainted(false);
		 interest.setFocusable(false);
		 interest.addActionListener(this);
		 
		 contact = new JButton("CONTACT");
		 contact.setFont(new Font("Tahoma", Font.BOLD, 20));
		 contact.setBackground(new Color(255, 255, 255));
		 contact.setForeground(Color.BLACK);
		 contact.setBorderPainted(false);
		 contact.setFocusable(false);
		 contact.addActionListener(this);
		 
		 menuPanel.add(logoLabel);
		 menuPanel.add(about);
		 menuPanel.add(skills);
		 menuPanel.add(education);
		 menuPanel.add(project);
		 menuPanel.add(interest);
		 menuPanel.add(contact);
		 
		 //adding details in about panel
//		 aboutHeadings = new JLabel("ABOUT ME");
//		 aboutHeadings.setFont(new Font("Tahoma", Font.BOLD, 40));
//		 aboutHeadings.setForeground(Color.BLACK);
//		 aboutHeadings.setBounds(100, 100, 770, 50);
		 
//		 aboutPanel.add(aboutHeadings);
		 
		 //adding details in skills panel
//		 skillsHeadings = new JLabel("RELEVANT SKILLS");
//		 skillsHeadings.setFont(new Font("Tahoma", Font.BOLD, 40));
//		 skillsHeadings.setForeground(Color.BLACK);
//		 skillsHeadings.setBounds(100, 100, 770, 50);
		 
//		 skillsPanel.add(skillsHeadings);
		 
		 //adding details in education panel
//		 educationHeadings = new JLabel("EDUCATION BACKGROUND");
//		 educationHeadings.setFont(new Font("Tahoma", Font.BOLD, 40));
//		 educationHeadings.setForeground(Color.BLACK);
//		 educationHeadings.setBounds(100, 100, 770, 50);
		 
//		 educationPanel.add(educationHeadings);
		 
		 //adding details in experience panel
//		 projectHeadings = new JLabel("PROJECTS");
//		 projectHeadings.setFont(new Font("Tahoma", Font.BOLD, 40));
//		 projectHeadings.setForeground(Color.BLACK);
//		 projectHeadings.setBounds(100, 100, 770, 50);
		 
//		 projectPanel.add(projectHeadings);
		 
		 //adding details in interest panel
//		 interestHeadings = new JLabel("INTEREST");
//		 interestHeadings.setFont(new Font("Tahoma", Font.BOLD, 40));
//		 interestHeadings.setForeground(Color.BLACK);
//		 interestHeadings.setBounds(100, 100, 770, 50);
		 
//		 interestPanel.add(interestHeadings);
		 
		 //adding details in contact panel
//		 contactHeadings = new JLabel("CONTACT DETAILS");
//		 contactHeadings.setFont(new Font("Tahoma", Font.BOLD, 40));
//		 contactHeadings.setForeground(Color.BLACK);
//		 contactHeadings.setBounds(100, 100, 770, 50);
		 
//		 contactPanel.add(contactHeadings);
		 
		 //adding panels in layered panels
		 layeredPane.add(aboutPanel, Integer.valueOf(5));
		 layeredPane.add(skillsPanel, Integer.valueOf(4));
		 layeredPane.add(educationPanel, Integer.valueOf(3));
		 layeredPane.add(projectPanel, Integer.valueOf(2));
		 layeredPane.add(interestPanel, Integer.valueOf(1));
		 layeredPane.add(contactPanel, Integer.valueOf(0));
		 frame.add(layeredPane);
		 
		 frame.add(menuPanel);
		 frame.add(sidePanel);
		 
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(new Dimension(1000,600));
		 frame.setLocationRelativeTo(null);
		 frame.setLayout(null);
		 frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(about)) {
			sidePanel.setBackground(Color.ORANGE);
			aboutPanel.setVisible(true);
			skillsPanel.setVisible(false);
			educationPanel.setVisible(false);
			projectPanel.setVisible(false);
			interestPanel.setVisible(false);
			contactPanel.setVisible(false);
		}
		
		if(e.getSource().equals(skills)) {
			sidePanel.setBackground(Color.CYAN);
			aboutPanel.setVisible(false);
			skillsPanel.setVisible(true);
			educationPanel.setVisible(false);
			projectPanel.setVisible(false);
			interestPanel.setVisible(false);
			contactPanel.setVisible(false);
		}
		
		if(e.getSource().equals(education)) {
			sidePanel.setBackground(new Color(0x99FF99));
			aboutPanel.setVisible(false);
			skillsPanel.setVisible(false);
			educationPanel.setVisible(true);
			projectPanel.setVisible(false);
			interestPanel.setVisible(false);
			contactPanel.setVisible(false);
		}

		if(e.getSource().equals(project)) {
			sidePanel.setBackground(new Color(0xCC99FF));
			aboutPanel.setVisible(false);
			skillsPanel.setVisible(false);
			educationPanel.setVisible(false);
			projectPanel.setVisible(true);
			interestPanel.setVisible(false);
			contactPanel.setVisible(false);
		}
		
		if(e.getSource().equals(interest)) {
			sidePanel.setBackground(new Color(0x87CEEB));
			aboutPanel.setVisible(false);
			skillsPanel.setVisible(false);
			educationPanel.setVisible(false);
			projectPanel.setVisible(false);
			interestPanel.setVisible(true);
			contactPanel.setVisible(false);
		}
		
		if(e.getSource().equals(contact)) {
			sidePanel.setBackground(Color.PINK);
			aboutPanel.setVisible(false);
			skillsPanel.setVisible(false);
			educationPanel.setVisible(false);
			projectPanel.setVisible(false);
			interestPanel.setVisible(false);
			contactPanel.setVisible(true);
		}
	}
	
	public static void main(String args[]) {
		MyPortfolio myPortfolio = new MyPortfolio();
	}
}