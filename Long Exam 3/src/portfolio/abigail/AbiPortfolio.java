  //This class is the child class which extends the parent class (Panel.java)
  //In this class, there are several components used and added as the attributes.

package portfolio.abigail;
  
  import java.awt.*;
	import javax.swing.*;

import java.awt.event.*;
	
	public class AbiPortfolio extends Panel implements ActionListener{
		//adding components or attributes in the MyPortfolio class
		private JFrame frame;
		private JLayeredPane layeredPane;
		private Panel sidePanel, menuPanel, aboutPanel, skillPanel, educationPanel, projectPanel, interestPanel, contactPanel;
		private JButton about, skill, project, education, interest, contact;
		
		public AbiPortfolio() { //This is the constructor of MyPortfolio class with title: String parameter
			frame = new JFrame("Portfolio"); //creating an instance of JFrame object (frame)
			 
			layeredPane = new JLayeredPane(); //creating an instance of JLayeredPane object (layeredPane)
			layeredPane.setBounds(230,0,770,600); //set the bounds of layeredPane's x-coordinate, y-coordinate, width, and height
			
			//creating JButton objects (about, skill, education, project, interest, contact) with registered action listener
			about = new JButton("ABOUT");
			about.addActionListener(this);
			
			skill = new JButton("SKILLS");
			skill.addActionListener(this);
			
			education = new JButton("EDUCATION");	
			education.addActionListener(this);
			
			project = new JButton("PROJECT");
			project.addActionListener(this);
			
			interest = new JButton("INTEREST");
			interest.addActionListener(this);
			
			contact = new JButton("CONTACT");
			contact.addActionListener(this);
			
			//instantiating Panel objects (sidePanel, menuPanel, aboutPanel, skillPanel, educationPanel, projectPanel, interestPanel, and contactPanel)
			sidePanel = new Panel();
			sidePanel.updateBounds(0, 0, 30, 600); //updating bounds of the panel
			
			menuPanel = new Panel();
			menuPanel.updateBounds(30, 0, 200, 600); //updating bounds of the panel
			menuPanel.changeColorToWhite(); //change menu panel background color to white
			menuPanel.updateLayout(0, 0); //update the menu panel layout vertical and horizontal gap to 0, 0 respectively
			
			menuPanel.addPicture("abiPics/logo.png", 200, 200); //add a picture by specifying the path, and width and height properties
			//adding the JButtons in menuPanel
			menuPanel.addButtons(about);
			menuPanel.addButtons(skill);
			menuPanel.addButtons(education);
			menuPanel.addButtons(project);
			menuPanel.addButtons(interest);
			menuPanel.addButtons(contact);
			
			aboutPanel = new Panel();
			aboutPanel.addPicture("abiPics/about.png", 700, 400); //add a picture by specifying the path, and width and height properties
			
			skillPanel = new Panel();
			skillPanel.addPicture("abiPics/skills.png", 700, 400);; //add a picture by specifying the path, and width and height properties
			
			educationPanel = new Panel();
			educationPanel.addPicture("abiPics/education.png", 700, 400); //add a picture by specifying the path, and width and height properties
	
			projectPanel = new Panel();
			projectPanel.addPicture("abiPics/project.png", 700, 400); //add a picture by specifying the path, and width and height properties
		
			interestPanel = new Panel();
			interestPanel.addPicture("abiPics/interest.png", 700, 400); //add a picture by specifying the path, and width and height properties
	
			contactPanel = new Panel();
			contactPanel.addPicture("abiPics/contact.png", 700, 400); //add a picture by specifying the path, and width and height properties
	
			//adding the Panel objects in layeredPane using getPanel method to return to each of the panel
			//The interger.valueOf(int) serves as the layers with 5 - at the top layer and 0 - at the bottom layer
			layeredPane.add(aboutPanel.getPanel(), Integer.valueOf(5));
			layeredPane.add(skillPanel.getPanel(), Integer.valueOf(4));
			layeredPane.add(educationPanel.getPanel(), Integer.valueOf(3));
			layeredPane.add(projectPanel.getPanel(), Integer.valueOf(2));
			layeredPane.add(interestPanel.getPanel(), Integer.valueOf(1));
			layeredPane.add(contactPanel.getPanel(), Integer.valueOf(0));
			
			//adding the Panel objects (sidePanel and menuPanel) and JLayeredPane object (layeredPane) to the frame
			//Since it's private I need to use getPanel() to return the Panel objects
			frame.add(sidePanel.getPanel());
			frame.add(menuPanel.getPanel());
			frame.add(layeredPane);
		  
			//adding frame properties
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //to terminate the frame by closing it
			frame.setSize(new Dimension(1000, 600)); //resizing the frame dimensions, width and height
			frame.setLocationRelativeTo(null); //to make the frame appear in center when run
			frame.setLayout(null); //set the layout to null
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
      //In this I just constantly used setHorizontalAlignment() to keep the text of the button in CENTER when clicked otherwise LEFT
      //I also constantly used setBackground() to change the button to ORANGE when clicked otherwise WHITE
      //and I also used setVisibilityToTrue() to make the related panel visible and setVisibilityToFalse() to make other panels not visible
      
			if (e.getSource().equals(about)) {
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
				
			} else if (e.getSource().equals(skill)) {
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
				
			} else if (e.getSource().equals(education)) {
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
				
			} else if(e.getSource().equals(project)) {
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
				
			} else if (e.getSource().equals(interest)) {
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
				
			} else if (e.getSource().equals(contact)) {
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
		
		public void abiPortfolioRun () {
			AbiPortfolio myPortfolio = new AbiPortfolio(); //I instantiate MyPortfolio class to call or it
			frame.setVisible(true); //make the frame visible
		}
	}