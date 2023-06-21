package portfolio.charles;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// Extend to JFrame to inherit funtionalities
public class HomePage extends JFrame {
    private JPanel rightPanel;
    private JPanel leftPanel;

    public HomePage() {
        setTitle("Portfolio");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Create a GridLayout for the left and right panel (with 1 row and 2 columns) 
        setLayout(new GridLayout(1, 2));

        // Create the right panel
        rightPanel = new JPanel(new GridBagLayout());
        rightPanel.setBackground(Color.white);
        JLabel rightLabel = new JLabel("My Portfolio");
        rightLabel.setFont(new Font("Monospaced", Font.BOLD, 50));

        // Create GridBagConstraints and set desired position
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 0, 10, 0); // top, left, bottom, right
        rightPanel.add(rightLabel, gbc);

        // Create the buttons
        JButton selfBtn = new JButton("Myself");
        selfBtn.addActionListener(new Myself());

        JButton skillsBtn = new JButton("My Skills");
  
        skillsBtn.addActionListener(new MySkills());
        JButton worksBtn = new JButton("My Works");
        worksBtn.addActionListener(new MyWorks());

        // Resize the buttons
        Dimension buttonSize = new Dimension(150, 50);
        selfBtn.setPreferredSize(buttonSize);
        skillsBtn.setPreferredSize(buttonSize);
        worksBtn.setPreferredSize(buttonSize);

        // Change the color of the buttons
        Color buttonColor = Color.black;
        selfBtn.setBackground(buttonColor);
        skillsBtn.setBackground(buttonColor);
        worksBtn.setBackground(buttonColor);

        // Change the text color of the buttons
        Color textColor = Color.white;
        selfBtn.setForeground(textColor);
        skillsBtn.setForeground(textColor);
        worksBtn.setForeground(textColor);

        // Change the size of the text in the buttons
        int fontSize = 20; // Adjust the font size as desired
        Font buttonFont = new Font(Font.SANS_SERIF, Font.BOLD, fontSize);
        selfBtn.setFont(buttonFont);
        skillsBtn.setFont(buttonFont);
        worksBtn.setFont(buttonFont);

        // Adjust the location for the buttons
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(20, 0, 0, 0);
       
        // Add the buttons to the right panel
        rightPanel.add(selfBtn, gbc);
        rightPanel.add(skillsBtn, gbc);
        rightPanel.add(worksBtn, gbc);

        // Set the image background for the left panel
        ImageIcon backgroundImage = new ImageIcon("charlesPics/HomePage.jpg");
        leftPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };

        // Set the preferred size for the left panel
        leftPanel.setPreferredSize(new Dimension(backgroundImage.getIconWidth(), backgroundImage.getIconHeight()));

        // Add the panels to the frame
        add(leftPanel);
        add(rightPanel);
    }
    
    public void charlesPortfolioRun() {
    	// Ensures that the initialization code is executed on the event dispatch thread
        SwingUtilities.invokeLater(() -> {
            // Create an instance of the HomePage class
            HomePage homePage = new HomePage();
            
            // Set the visibility of the homePage to true, making it visible to the user
            homePage.setVisible(true);
        });
    }
}
