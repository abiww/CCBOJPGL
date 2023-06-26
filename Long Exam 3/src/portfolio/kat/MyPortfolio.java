package portfolio.kat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPortfolio extends JFrame {
    private JButton aboutButton;
    private JButton reachButton;
    private JButton projectsButton;

    public MyPortfolio() {
        setTitle("My Portfolio");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); 
        setLayout(new BorderLayout());

        // Create a panel to hold the background image
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundImage = new ImageIcon("katPics/portfolio.png");
                Image image = backgroundImage.getImage();
                int width = getWidth();
                int height = getHeight();
                g.drawImage(image, 0, 0, width, height, this);
            }
        };
        backgroundPanel.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        Font buttonFont = new Font("Arial", Font.BOLD, 18);
        Color buttonColor = new Color(0x2B124C);
        Color textColor = Color.WHITE;

        aboutButton = createButton("About Me", buttonFont, buttonColor, textColor);
        projectsButton = createButton("Projects", buttonFont, buttonColor, textColor);
        reachButton = createButton("Reach Me Out", buttonFont, buttonColor, textColor);

        buttonPanel.add(aboutButton);
        buttonPanel.add(projectsButton);
        buttonPanel.add(reachButton);

        backgroundPanel.add(buttonPanel, BorderLayout.PAGE_END);
        add(backgroundPanel);

        aboutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAboutMe();
            }
        });

        reachButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openReachMeOut();
            }
        });

        projectsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openProjects();
            }
        });

    }

    private void openAboutMe() {
        AboutMe aboutMe = new AboutMe(this);
        aboutMe.copyButtonDesign(aboutButton);
        aboutMe.setVisible(true);
        setVisible(false);
    }

    private void openProjects() {
        Projects projects = new Projects(this);
        projects.copyButtonDesign(projectsButton);
        projects.setVisible(true);
        setVisible(false);
    }
    
    private void openReachMeOut() {
        ReachMeOut reachMeOut = new ReachMeOut(this);
        reachMeOut.copyButtonDesign(reachButton);
        reachMeOut.setVisible(true);
        setVisible(false);
    }   

    private JButton createButton(String text, Font font, Color backgroundColor, Color textColor) {
        JButton button = new JButton(text);
        button.setFont(font);
        button.setBackground(backgroundColor);
        button.setForeground(textColor);
        button.setFocusPainted(false);
        return button;
    }

    public void copyButtonDesign(JButton backButton) {
        backButton.setFont(aboutButton.getFont());
        backButton.setBackground(aboutButton.getBackground());
        backButton.setForeground(aboutButton.getForeground());
    }
    
    public boolean katPortfolioRun() {
    	SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MyPortfolio gui = new MyPortfolio();
                gui.setVisible(true);
            }
        });
    	
    	return true;
    }
}

