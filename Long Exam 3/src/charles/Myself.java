package portfolio.charles;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Myself implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
    	JFrame homePage = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
    	homePage.dispose();
    	
        // Action to perform when the button is clicked
        JFrame frame = createFrame("Myself", 800, 600);
        JPanel contentPane = createPanel(frame.getSize(), new BorderLayout());

        // Load the image and resize it to fit the panel
        ImageIcon imageIcon = new ImageIcon("charlesPics/Myself.jpg");
        Image image = imageIcon.getImage().getScaledInstance(contentPane.getWidth(), contentPane.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(image);

        // Create a label with the resized image
        JLabel imageLabel = new JLabel(resizedImageIcon);
        contentPane.add(imageLabel, BorderLayout.CENTER);

        // Create the next and back button
        JButton backButton = createBackButton();
        JButton nextButton = createNextButton();

        // Create the button panel and add the buttons
        JPanel buttonPanel = createButtonPanel(backButton, nextButton);

        // Add the button panel to the content pane at the top
        contentPane.add(buttonPanel, BorderLayout.NORTH);

        frame.setContentPane(contentPane);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
    // Create a frame
    protected JFrame createFrame(String title, int width, int height) {
        JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        return frame;
    }

    // Create a panel
    protected JPanel createPanel(Dimension size, LayoutManager layout) {
        JPanel panel = new JPanel(layout);
        panel.setSize(size);
        return panel;
    }

    // Create a back button
    protected JButton createBackButton() {
        JButton backButton = new JButton("X");
        backButton.setBackground(Color.black);
        backButton.setForeground(Color.white);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to go back to the home page
                HomePage homePage = new HomePage();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(backButton);
                currentFrame.dispose(); // Close the current frame
                homePage.setVisible(true); // Open the home page frame
            }
        });
        return backButton;
    }

    // Create a next button
    protected JButton createNextButton() {
        JButton nextButton = new JButton(">");
        nextButton.setBackground(Color.black);
        nextButton.setForeground(Color.white);
        nextButton.addActionListener(new MyEducation());
        return nextButton;
    }

    // Create a button panel
    protected JPanel createButtonPanel(JButton backButton, JButton nextButton) {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.black);
        buttonPanel.setLayout(new BorderLayout());
        buttonPanel.add(backButton, BorderLayout.WEST);
        buttonPanel.add(nextButton, BorderLayout.EAST);
        return buttonPanel;
    }
}
