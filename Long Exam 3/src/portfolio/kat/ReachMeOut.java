package portfolio.kat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ReachMeOut extends JFrame {
    private JButton backButton;
    private JButton nextButton;
    private JLabel imageLabel;

    private String[] imagePaths = {
           "katPics/contact.png",
    };

    private int currentImageIndex = 0;

    public ReachMeOut(JFrame parent) {
        setTitle("Projects");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(new Color(0x2B124C)); 


        backButton = new JButton("Back");
        nextButton = new JButton("Next");

        buttonPanel.add(backButton);
        buttonPanel.add(nextButton);

        add(buttonPanel, BorderLayout.SOUTH);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                goBack();
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showNextImage();
            }
        });

        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER); 
        imageLabel.setVerticalAlignment(SwingConstants.CENTER);
        showImage();

        add(imageLabel, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void goBack() {
        setVisible(false);
        MyPortfolio gui = new MyPortfolio();
        gui.copyButtonDesign(backButton);
        gui.setVisible(true);
    }

    private void showNextImage() {
        currentImageIndex++;
        if (currentImageIndex >= imagePaths.length) {
            currentImageIndex = 0;
        }
        showImage();

        // Check if there are more images
        if (currentImageIndex == imagePaths.length - 1) {
            nextButton.setEnabled(false); 
        }
    }

    private void showImage() {
        ImageIcon imageIcon = new ImageIcon(imagePaths[currentImageIndex]);
        Image image = imageIcon.getImage().getScaledInstance(1000, 600, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);
        imageLabel.setIcon(imageIcon);
    }

    public void copyButtonDesign(JButton button) {
        backButton.setFont(button.getFont());
        backButton.setBackground(button.getBackground());
        backButton.setForeground(button.getForeground());
        nextButton.setFont(button.getFont());
        nextButton.setBackground(button.getBackground());
        nextButton.setForeground(button.getForeground());
    }
}

