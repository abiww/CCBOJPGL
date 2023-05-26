import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;

public class MyPortfolio extends Panel implements ActionListener{
	
	JFrame frame;
	JLayeredPane layeredPane;
	Panel sidePanel, menuPanel, aboutPanel, skillPanel, educationPanel, projectPanel, interestPanel, contactPanel;
	JButton about, skill, project, education, interest, contact, resume;
	
	MyPortfolio() {
		frame = new JFrame("Portfolio");
		 
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(230,0,770,600);
		
		//adding buttons
		about = new JButton("ABOUT");
		about.setHorizontalAlignment(SwingConstants.LEFT);
		about.setFont(new Font("Tahoma", Font.BOLD, 20));
		about.setBackground(Color.WHITE);
		about.setForeground(Color.BLACK);
		about.setBorderPainted(false);
		about.setPreferredSize(new Dimension(200, 55));
		about.setFocusable(false);
		about.addActionListener(this);
		
		skill = new JButton("SKILLS");
		skill.setHorizontalAlignment(SwingConstants.LEFT);
		skill.setFont(new Font("Tahoma", Font.BOLD, 20));
		skill.setBackground(Color.WHITE);
		skill.setForeground(Color.BLACK);
		skill.setBorderPainted(false);
		skill.setFocusable(false);
		skill.setPreferredSize(new Dimension(200, 55));
		skill.addActionListener(this);
		
		education = new JButton("EDUCATION");
		education.setHorizontalAlignment(SwingConstants.LEFT);
		education.setFont(new Font("Tahoma", Font.BOLD, 20));
		education.setBackground(Color.WHITE);
		education.setForeground(Color.BLACK);
		education.setBorderPainted(false);
		education.setFocusable(false);
		education.setPreferredSize(new Dimension(200, 55));
		education.addActionListener(this);
		
		project = new JButton("PROJECT");
		project.setHorizontalAlignment(SwingConstants.LEFT);
		project.setFont(new Font("Tahoma", Font.BOLD, 20));
		project.setBackground(Color.WHITE);
		project.setForeground(Color.BLACK);
		project.setBorderPainted(false);
		project.setFocusable(false);
		project.setPreferredSize(new Dimension(200, 55));
		project.addActionListener(this);
		
		interest = new JButton("INTEREST");
		interest.setHorizontalAlignment(SwingConstants.LEFT);
		interest.setFont(new Font("Tahoma", Font.BOLD, 20));
		interest.setBackground(Color.WHITE);
		interest.setForeground(Color.BLACK);
		interest.setBorderPainted(false);
		interest.setFocusable(false);
		interest.setPreferredSize(new Dimension(200, 55));
		interest.addActionListener(this);
		
		contact = new JButton("CONTACT");
		contact.setHorizontalAlignment(SwingConstants.LEFT);
		contact.setFont(new Font("Tahoma", Font.BOLD, 20));
		contact.setBackground(Color.WHITE);
		contact.setForeground(Color.BLACK);
		contact.setBorderPainted(false);
		contact.setFocusable(false);
		contact.setPreferredSize(new Dimension(200, 55));
		contact.addActionListener(this);
		
		sidePanel = new Panel();
		sidePanel.updateBounds(0, 0, 30, 600);
		
		menuPanel = new Panel();
		menuPanel.updateBounds(30, 0, 200, 600);
		menuPanel.changeColorToWhite();
		menuPanel.updateLayout(0, 0);
		
		menuPanel.addPicture("C:\\Users\\63999\\Downloads\\ABee-removebg-preview.png", 200, 200);
		menuPanel.addButtons(about);
		menuPanel.addButtons(skill);
		menuPanel.addButtons(education);
		menuPanel.addButtons(project);
		menuPanel.addButtons(interest);
		menuPanel.addButtons(contact);
		
		aboutPanel = new Panel();
		aboutPanel.addPicture("C:\\Users\\63999\\Downloads\\OOP_Portfolio\\about.png", 700, 400);
		aboutPanel.updateLayout(0, 80);
		
		skillPanel = new Panel();
		skillPanel.addPicture("C:\\Users\\63999\\Downloads\\OOP_Portfolio\\skill.png", 700, 400);
		skillPanel.updateLayout(0, 80);
		
		educationPanel = new Panel();
		educationPanel.addPicture("C:\\Users\\63999\\Downloads\\OOP_Portfolio\\education.png", 700, 400);
		educationPanel.updateLayout(0, 80);
		
		projectPanel = new Panel();
		projectPanel.addPicture("C:\\Users\\63999\\Downloads\\OOP_Portfolio\\project.png", 700, 400);
		projectPanel.updateLayout(0, 80);
		
		interestPanel = new Panel();
		interestPanel.addPicture("C:\\Users\\63999\\Downloads\\OOP_Portfolio\\interest.png", 700, 400);
		interestPanel.updateLayout(0, 80);
		
		contactPanel = new Panel();
		contactPanel.addPicture("C:\\Users\\63999\\Downloads\\OOP_Portfolio\\contact.png", 700, 400);
		contactPanel.updateLayout(0, 80);
		
		layeredPane.add(aboutPanel.getPanel(), Integer.valueOf(5));
		layeredPane.add(skillPanel.getPanel(), Integer.valueOf(4));
		layeredPane.add(educationPanel.getPanel(), Integer.valueOf(3));
		layeredPane.add(projectPanel.getPanel(), Integer.valueOf(2));
		layeredPane.add(interestPanel.getPanel(), Integer.valueOf(1));
		layeredPane.add(contactPanel.getPanel(), Integer.valueOf(0));
		
		frame.add(sidePanel.getPanel());
		frame.add(menuPanel.getPanel());
		frame.add(layeredPane);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(1000, 600));
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
			
			aboutPanel.setVisibilityToTrue();
			skillPanel.setVisibilityToFalse();
			educationPanel.setVisibilityToFalse();
			projectPanel.setVisibilityToFalse();
			interestPanel.setVisibilityToFalse();
			contactPanel.setVisibilityToFalse();
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
			
			aboutPanel.setVisibilityToFalse();
			skillPanel.setVisibilityToTrue();
			educationPanel.setVisibilityToFalse();
			projectPanel.setVisibilityToFalse();
			interestPanel.setVisibilityToFalse();
			contactPanel.setVisibilityToFalse();
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
			
			aboutPanel.setVisibilityToFalse();
			skillPanel.setVisibilityToFalse();
			educationPanel.setVisibilityToTrue();
			projectPanel.setVisibilityToFalse();
			interestPanel.setVisibilityToFalse();
			contactPanel.setVisibilityToFalse();
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

			aboutPanel.setVisibilityToFalse();
			skillPanel.setVisibilityToFalse();
			educationPanel.setVisibilityToFalse();
			projectPanel.setVisibilityToTrue();
			interestPanel.setVisibilityToFalse();
			contactPanel.setVisibilityToFalse();
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
			
			aboutPanel.setVisibilityToFalse();
			skillPanel.setVisibilityToFalse();
			educationPanel.setVisibilityToFalse();
			projectPanel.setVisibilityToFalse();
			interestPanel.setVisibilityToTrue();
			contactPanel.setVisibilityToFalse();
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
			
			aboutPanel.setVisibilityToFalse();
			skillPanel.setVisibilityToFalse();
			educationPanel.setVisibilityToFalse();
			projectPanel.setVisibilityToFalse();
			interestPanel.setVisibilityToFalse();
			contactPanel.setVisibilityToTrue();
		}
	}
	
	public static void main (String[] args) {
		MyPortfolio myPortfolio = new MyPortfolio();
	}
}
