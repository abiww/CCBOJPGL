import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

public class Panel{

	JPanel panel;
	
	Panel() {
		panel = new JPanel();
		
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 770, 600);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
	}
	
	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	
	public void updateBounds(int x, int y, int width, int height) {
		panel.setBounds(x, y, width, height);
	}
	
	public void changeColorToWhite() {
		panel.setBackground(Color.WHITE);
	}
	
	public void updateLayout(int hgap, int vgap) {
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, hgap, vgap));
	}
	
	public void addPicture(String imagePath, int width, int height) {
		ImageIcon picture = new ImageIcon(imagePath);
		Image image = picture.getImage();
		Image resizedImage = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		picture = new ImageIcon(resizedImage);
		 
		JLabel label = new JLabel();
		label.setIcon(picture);
		
		panel.add(label);
	}
	
	public void addButtons(JButton button) {
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBackground(Color.WHITE);
		button.setForeground(Color.BLACK);
		button.setBorderPainted(false);
		button.setPreferredSize(new Dimension(200, 55));
		button.setFocusable(false);
		
		
		panel.add(button);
	}
	
	public void setVisibilityToTrue() {
			getPanel().setVisible(true); 
	}
	
	public void setVisibilityToFalse() {
		getPanel().setVisible(false);
	}
}
