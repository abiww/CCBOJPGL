//This class serves as the parent class with include JPanel object (panel) as the attribute,
//along with several methods that mostly about adding components with properties included.

package portfolio.abigail;	

import java.awt.*;
import javax.swing.*;
	
	public class Panel{
		private JPanel panel; //An attribute of panel class.
		
		Panel() { //This is the constructor of panel class
			panel = new JPanel(); //creating an instance of JPanel
			
			panel.setBackground(Color.ORANGE); //set the panel background to orange.
			panel.setBounds(0, 0, 770, 600); //set the bounds, x-coordinate, y-coordinate, width, and height
			panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 80)); //set the layout manager to flowlayout, components must be in CENTER
		}
		
		public JPanel getPanel() { //This method is used to return the panel
			return panel;
		}
		
		public void updateBounds(int x, int y, int width, int height) { //This method is to update the bounds of panel
			panel.setBounds(x, y, width, height);
		}
		
		public void changeColorToWhite() { //This method is used to change the panel background color to white
			panel.setBackground(Color.WHITE);
		}
		
		public void updateLayout(int hgap, int vgap) { //This is to add space or gap between the components, horizontally and vertically
			panel.setLayout(new FlowLayout(FlowLayout.CENTER, hgap, vgap));
		}
		
		public void setVisibilityToTrue() { //This method is used to set the panel visibility to true
			getPanel().setVisible(true); 
		}
	
		public void setVisibilityToFalse() { //This method is used to set the panel visibility to false
			getPanel().setVisible(false);
		}
		
		public void addPicture(String imagePath, int width, int height) { //This method is used to add pictures in the panel
			ImageIcon picture = new ImageIcon(imagePath); //create an ImageIcon object (picture) with imagePath: String parameter
			Image image = picture.getImage(); //create an Image object (image) with method to call or get the image
			Image resizedImage = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH); //create an Image object (resizedImage) with method used to resize the width and height of the image
			picture = new ImageIcon(resizedImage); //replace the picture with the resized image
			 
			JLabel label = new JLabel(); //creating an instance of JLabel object (label)
			label.setIcon(picture); //set the label as the icon
			
			panel.add(label); //add the label in the panel
		}
		
		public void addButtons(JButton button) { //This method is used to add buttons in the panel
			button.setHorizontalAlignment(SwingConstants.LEFT); //align the text on button in LEFT
			button.setFont(new Font("Tahoma", Font.BOLD, 22)); //set the font, style and size of the text
			button.setBackground(Color.WHITE); //set the background color of the button to WHTIE
			button.setForeground(Color.BLACK); //set the color of the text to BLACK
			button.setBorderPainted(false); //make the button border line not visible
			button.setPreferredSize(new Dimension(200, 55)); //set the new size of button
			button.setFocusable(false); //set the focus to false
			
			panel.add(button); //add the button to panel
		}
	}
