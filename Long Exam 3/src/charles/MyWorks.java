package portfolio.charles;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyWorks extends Myself {
    // Array of image paths
    private String[] imagePaths = {
        "charlesPics/Work 1.jpg",
        "charlesPics/Work 2.jpg",
        "charlesPics/Work 3.jpg",
        "charlesPics/Work 4.jpg"
    };
    
    // Variable declaration
    private int currentImageIndex = 0;
    private JButton backButton;
    private JButton nextButton;
    private JFrame frame;
    
    // Inherit methods from the superclass
    @Override
    public void actionPerformed(ActionEvent e) {
    	JFrame homePage = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
    	homePage.dispose();
    	
        ImageIcon imageIcon = new ImageIcon(imagePaths[currentImageIndex]);

        frame = createFrame("MyWorks", 800, 600);
        JPanel contentPane = createPanel(frame.getSize(), new BorderLayout());
        JLabel imageLabel = createImageLabel(imageIcon, contentPane.getSize());
        nextButton = createNextButton();
        backButton = createBackButton();
        JPanel buttonPanel = createButtonPanel(backButton, nextButton);
        
        // Add the image and button panel to the frame
        contentPane.add(imageLabel, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.NORTH);
        
        // Frame components and functions
        frame.setContentPane(contentPane);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        
        stopButton();
    }
     
    // Display the new image
    private JLabel createImageLabel(ImageIcon imageIcon, Dimension panelSize) {
        Image image = imageIcon.getImage().getScaledInstance(panelSize.width, panelSize.height, Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(image);
        return new JLabel(resizedImageIcon);
    }
    
    // Override the fuction of the next button
    @Override
    protected JButton createNextButton() {
        nextButton = new JButton(">");
        nextButton.setBackground(Color.BLACK);
        nextButton.setForeground(Color.WHITE);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentImageIndex++;
                stopButton();
                MyWorks.this.actionPerformed(e);
            }
        });
        return nextButton;
    }
    
    // Override the fuction of the back button
    @Override
    protected JButton createBackButton() {
        JButton backButton = new JButton("x");
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the current frame
                HomePage homePage = new HomePage();
                homePage.setVisible(true); // Show the HomePage frame
            }
        });
        return backButton;
    }
    
    // To disable next button
    private void stopButton() {
        int imageCount = imagePaths.length;
        if (currentImageIndex == imageCount - 1) {
            nextButton.setEnabled(false);
        } else {
            nextButton.setEnabled(true);
        }
    }
}
