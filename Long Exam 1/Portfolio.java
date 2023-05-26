import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Portfolio implements ActionListener{
	JFrame frame;
	JLayeredPane layeredPane;
	JButton about, skill, project, education, interest, contact, resume;
	JPanel sidePanel, menuPanel, aboutPanel, skillPanel, educationPanel, projectPanel, interestPanel, contactPanel;
	JLabel logoLabel, aboutLabel, skillLabel, projectLabel, educationLabel, interestLabel, contactLabel;
	ImageIcon logo, aboutImage, skillImage, projectImage, educationImage, interestImage, contactImage;
	Image image, resizedImage;

	 Portfolio() {
		 
		 frame = new JFrame("Portfolio");
		 
		 layeredPane = new JLayeredPane();
		 layeredPane.setBounds(230,0,770,600);
		 
		 sidePanel = new JPanel();
		 sidePanel.setBackground(Color.ORANGE);
		 sidePanel.setBounds(0,0,30,600);
		 
		 menuPanel = new JPanel();
		 menuPanel.setBackground(Color.WHITE);
		 menuPanel.setBounds(30,0,200,600);
		 menuPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		 
		 aboutPanel = new JPanel();
		 aboutPanel.setBackground(Color.ORANGE);
		 aboutPanel.setBounds(0,0,770,600);
		 aboutPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 80));
		 
		 skillPanel = new JPanel();
		 skillPanel.setBackground(Color.ORANGE);
		 skillPanel.setBounds(0,0,770,600);
		 skillPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 80));
		 
		 educationPanel = new JPanel();
		 educationPanel.setBackground(Color.ORANGE);
		 educationPanel.setBounds(0,0,770,600);
		 educationPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 80));
		 
		 projectPanel = new JPanel();
		 projectPanel.setBackground(Color.ORANGE);
		 projectPanel.setBounds(0,0,770,600);
		 projectPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 80));
		 
		 interestPanel = new JPanel();
		 interestPanel.setBackground(Color.ORANGE);
		 interestPanel.setBounds(0,0,770,600);
		 interestPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 80));
		 
		 contactPanel = new JPanel();
		 contactPanel.setBackground(Color.ORANGE);
		 contactPanel.setBounds(0,0,770,600);
		 contactPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 80));
		 
		 //add logo image
		 logo = new ImageIcon("C:\\Users\\63999\\Downloads\\ABee-removebg-preview.png");
		 image = logo.getImage() ;
		 resizedImage = image.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
		 logo = new ImageIcon(resizedImage);
		 
		 logoLabel = new JLabel();
		 logoLabel.setIcon(logo);
		 
		 //add menu buttons
		 Dimension size = new Dimension(200,55);
		 
		 about = new JButton("ABOUT");
		 about.setHorizontalAlignment(SwingConstants.LEFT);
		 about.setFont(new Font("Tahoma", Font.BOLD, 20));
		 about.setBackground(new Color(255, 255, 255));
		 about.setForeground(Color.BLACK);
		 about.setBorderPainted(false);
		 about.setPreferredSize(size);
		 about.setFocusable(false);
		 about.addActionListener(this);
		 
		 skill = new JButton("SKILLS");
		 skill.setHorizontalAlignment(SwingConstants.LEFT);
		 skill.setFont(new Font("Tahoma", Font.BOLD, 20));
		 skill.setBackground(new Color(255, 255, 255));
		 skill.setForeground(Color.BLACK);
		 skill.setBorderPainted(false);
		 skill.setFocusable(false);
		 skill.setPreferredSize(size);
		 skill.addActionListener(this);
		 
		 education = new JButton("EDUCATION");
		 education.setHorizontalAlignment(SwingConstants.LEFT);
		 education.setFont(new Font("Tahoma", Font.BOLD, 20));
		 education.setBackground(new Color(255, 255, 255));
		 education.setForeground(Color.BLACK);
		 education.setBorderPainted(false);
		 education.setFocusable(false);
		 education.setPreferredSize(size);
		 education.addActionListener(this);
		 
		 project = new JButton("PROJECT");
		 project.setHorizontalAlignment(SwingConstants.LEFT);
		 project.setFont(new Font("Tahoma", Font.BOLD, 20));
		 project.setBackground(new Color(255, 255, 255));
		 project.setForeground(Color.BLACK);
		 project.setBorderPainted(false);
		 project.setFocusable(false);
		 project.setPreferredSize(size);
		 project.addActionListener(this);
		 
		 interest = new JButton("INTEREST");
		 interest.setHorizontalAlignment(SwingConstants.LEFT);
		 interest.setFont(new Font("Tahoma", Font.BOLD, 20));
		 interest.setBackground(new Color(255, 255, 255));
		 interest.setForeground(Color.BLACK);
		 interest.setBorderPainted(false);
		 interest.setFocusable(false);
		 interest.setPreferredSize(size);
		 interest.addActionListener(this);
		 
		 contact = new JButton("CONTACT");
		 contact.setHorizontalAlignment(SwingConstants.LEFT);
		 contact.setFont(new Font("Tahoma", Font.BOLD, 20));
		 contact.setBackground(new Color(255, 255, 255));
		 contact.setForeground(Color.BLACK);
		 contact.setBorderPainted(false);
		 contact.setFocusable(false);
		 contact.setPreferredSize(size);
		 contact.addActionListener(this);
		 
		 menuPanel.add(logoLabel);
		 menuPanel.add(about);
		 menuPanel.add(skill);
		 menuPanel.add(education);
		 menuPanel.add(project);
		 menuPanel.add(interest);
		 menuPanel.add(contact);
		 
		 //adding details in about panel
		 aboutImage = new ImageIcon("C:\\Users\\63999\\Downloads\\OOP_Portfolio\\about.png");
		 image = aboutImage.getImage() ;
		 resizedImage = image.getScaledInstance(700, 400, java.awt.Image.SCALE_SMOOTH);
		 aboutImage = new ImageIcon(resizedImage);
		 
		 aboutLabel = new JLabel();
		 aboutLabel.setIcon(aboutImage);
		 
		 aboutPanel.add(aboutLabel);
		 
		 //adding details in skill panel
		 skillImage = new ImageIcon("C:\\Users\\63999\\Downloads\\OOP_Portfolio\\skill.png");
		 image = skillImage.getImage();
		 resizedImage = image.getScaledInstance(700, 400, java.awt.Image.SCALE_SMOOTH);
		 skillImage = new ImageIcon(resizedImage);
		 
		 skillLabel = new JLabel();
		 skillLabel.setIcon(skillImage);
		 
		 skillPanel.add(skillLabel);
		 
		 //adding details in education panel
		 educationImage = new ImageIcon("C:\\Users\\63999\\Downloads\\OOP_Portfolio\\education.png");
		 image = educationImage.getImage();
		 resizedImage = image.getScaledInstance(700, 400, java.awt.Image.SCALE_SMOOTH);
		 educationImage = new ImageIcon(resizedImage);
		 
		 educationLabel = new JLabel();
		 educationLabel.setIcon(educationImage);
		 
		 educationPanel.add(educationLabel);
		 
		 //adding details in project panel
		 projectImage = new ImageIcon("C:\\Users\\63999\\Downloads\\OOP_Portfolio\\project.png");
		 image = projectImage.getImage() ;
		 resizedImage = image.getScaledInstance(700, 400, java.awt.Image.SCALE_SMOOTH);
		 projectImage = new ImageIcon(resizedImage);
		 
		 projectLabel = new JLabel();
		 projectLabel.setIcon(projectImage);
		 
		 projectPanel.add(projectLabel);
		 
		 //adding details in interest panel
		 interestImage = new ImageIcon("C:\\Users\\63999\\Downloads\\OOP_Portfolio\\interest.png");
		 image = interestImage.getImage() ;
		 resizedImage = image.getScaledInstance(700, 400, java.awt.Image.SCALE_SMOOTH);
		 interestImage = new ImageIcon(resizedImage);
		 
		 interestLabel = new JLabel();
		 interestLabel.setIcon(interestImage);
		 
		 interestPanel.add(interestLabel);
		 
		 //adding details in contact panel
		 contactImage = new ImageIcon("C:\\Users\\63999\\Downloads\\OOP_Portfolio\\contact.png");
		 image = contactImage.getImage() ;
		 resizedImage = image.getScaledInstance(700, 400, java.awt.Image.SCALE_SMOOTH);
		 contactImage = new ImageIcon(resizedImage);
		 
		 contactLabel = new JLabel();
		 contactLabel.setLayout( new FlowLayout() );
		 contactLabel.setIcon(contactImage);
		 
		 contactPanel.add(contactLabel);
		 
		 //adding panels in layered panels
		 layeredPane.add(aboutPanel, Integer.valueOf(5));
		 layeredPane.add(skillPanel, Integer.valueOf(4));
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
			about.setHorizontalAlignment(SwingConstants.CENTER);
			skill.setHorizontalAlignment(SwingConstants.LEFT);
			education.setHorizontalAlignment(SwingConstants.LEFT);
			project.setHorizontalAlignment(SwingConstants.LEFT);
			interest.setHorizontalAlignment(SwingConstants.LEFT);
			contact.setHorizontalAlignment(SwingConstants.LEFT);
			
			about.setBackground(Color.ORANGE);
			skill.setBackground(Color.WHITE);
			education.setBackground(Color.WHITE);
			project.setBackground(Color.WHITE);
			interest.setBackground(Color.WHITE);
			contact.setBackground(Color.WHITE);
			
			aboutPanel.setVisible(true);
			skillPanel.setVisible(false);
			educationPanel.setVisible(false);
			projectPanel.setVisible(false);
			interestPanel.setVisible(false);
			contactPanel.setVisible(false);
		}
		
		if(e.getSource().equals(skill)) {
			about.setHorizontalAlignment(SwingConstants.LEFT);
			skill.setHorizontalAlignment(SwingConstants.CENTER);
			education.setHorizontalAlignment(SwingConstants.LEFT);
			project.setHorizontalAlignment(SwingConstants.LEFT);
			interest.setHorizontalAlignment(SwingConstants.LEFT);
			contact.setHorizontalAlignment(SwingConstants.LEFT);
			
			about.setBackground(Color.WHITE);
			skill.setBackground(Color.ORANGE);
			education.setBackground(Color.WHITE);
			project.setBackground(Color.WHITE);
			interest.setBackground(Color.WHITE);
			contact.setBackground(Color.WHITE);
			
			aboutPanel.setVisible(false);
			skillPanel.setVisible(true);
			educationPanel.setVisible(false);
			projectPanel.setVisible(false);
			interestPanel.setVisible(false);
			contactPanel.setVisible(false);
		}
		
		if(e.getSource().equals(education)) {
			about.setHorizontalAlignment(SwingConstants.LEFT);
			skill.setHorizontalAlignment(SwingConstants.LEFT);
			education.setHorizontalAlignment(SwingConstants.CENTER);
			project.setHorizontalAlignment(SwingConstants.LEFT);
			interest.setHorizontalAlignment(SwingConstants.LEFT);
			contact.setHorizontalAlignment(SwingConstants.LEFT);
			
			about.setBackground(Color.WHITE);
			skill.setBackground(Color.WHITE);
			education.setBackground(Color.ORANGE);
			project.setBackground(Color.WHITE);
			interest.setBackground(Color.WHITE);
			contact.setBackground(Color.WHITE);
			
			aboutPanel.setVisible(false);
			skillPanel.setVisible(false);
			educationPanel.setVisible(true);
			projectPanel.setVisible(false);
			interestPanel.setVisible(false);
			contactPanel.setVisible(false);
		}

		if(e.getSource().equals(project)) {
			about.setHorizontalAlignment(SwingConstants.LEFT);
			skill.setHorizontalAlignment(SwingConstants.LEFT);
			education.setHorizontalAlignment(SwingConstants.LEFT);
			project.setHorizontalAlignment(SwingConstants.CENTER);
			interest.setHorizontalAlignment(SwingConstants.LEFT);
			contact.setHorizontalAlignment(SwingConstants.LEFT);
			
			about.setBackground(Color.WHITE);
			skill.setBackground(Color.WHITE);
			education.setBackground(Color.WHITE);
			project.setBackground(Color.ORANGE);
			interest.setBackground(Color.WHITE);
			contact.setBackground(Color.WHITE);

			aboutPanel.setVisible(false);
			skillPanel.setVisible(false);
			educationPanel.setVisible(false);
			projectPanel.setVisible(true);
			interestPanel.setVisible(false);
			contactPanel.setVisible(false);
		}
		
		if(e.getSource().equals(interest)) {
			about.setHorizontalAlignment(SwingConstants.LEFT);
			skill.setHorizontalAlignment(SwingConstants.LEFT);
			education.setHorizontalAlignment(SwingConstants.LEFT);
			project.setHorizontalAlignment(SwingConstants.LEFT);
			interest.setHorizontalAlignment(SwingConstants.CENTER);
			contact.setHorizontalAlignment(SwingConstants.LEFT);
			
			about.setBackground(Color.WHITE);
			skill.setBackground(Color.WHITE);
			education.setBackground(Color.WHITE);
			project.setBackground(Color.WHITE);
			interest.setBackground(Color.ORANGE);
			contact.setBackground(Color.WHITE);
			
			aboutPanel.setVisible(false);
			skillPanel.setVisible(false);
			educationPanel.setVisible(false);
			projectPanel.setVisible(false);
			interestPanel.setVisible(true);
			contactPanel.setVisible(false);
		}
		
		if(e.getSource().equals(contact)) {
			about.setHorizontalAlignment(SwingConstants.LEFT);
			skill.setHorizontalAlignment(SwingConstants.LEFT);
			education.setHorizontalAlignment(SwingConstants.LEFT);
			project.setHorizontalAlignment(SwingConstants.LEFT);
			interest.setHorizontalAlignment(SwingConstants.LEFT);
			contact.setHorizontalAlignment(SwingConstants.CENTER);
			
			about.setBackground(Color.WHITE);
			skill.setBackground(Color.WHITE);
			education.setBackground(Color.WHITE);
			project.setBackground(Color.WHITE);
			interest.setBackground(Color.WHITE);
			contact.setBackground(Color.ORANGE);
			
			aboutPanel.setVisible(false);
			skillPanel.setVisible(false);
			educationPanel.setVisible(false);
			projectPanel.setVisible(false);
			interestPanel.setVisible(false);
			contactPanel.setVisible(true);
		}
	}
	
	public static void main(String args[]) {
		Portfolio myPortfolio = new Portfolio();
	}
}

//inheritance to be added
