import java.awt.*;

import javax.swing.*;

class ContentPanel {
	private JPanel panel;
	
	ContentPanel (int color) {
		panel = new JPanel();
		panel.setBackground(new Color(color));
		panel.setBounds(0, 0, 1185,630);
		panel.setLayout(null);
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public void setVisible(boolean b) {
		panel.setVisible(b);
	}

	public void addLabel(JLabel label) {
		panel.add(label);
	}
	
	public void addButton(JButton button) {
		panel.add(button);
	}
	
	public void addLP(JLayeredPane layaredPane) {
		panel.add(layaredPane);
	}
	
	public void addPanel(JPanel panels) {
		panel.add(panels);
	}
	
	public void addImage(String imagePath, int width, int height) {
		ImageIcon picture = new ImageIcon(imagePath);
		Image image = picture.getImage();
		Image resizedImage = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		picture = new ImageIcon(resizedImage);
		 
		JLabel label = new JLabel();
		label.setBounds(180, 15, 900, 600);;
		label.setIcon(picture);
		
		panel.add(label);
	}
}
