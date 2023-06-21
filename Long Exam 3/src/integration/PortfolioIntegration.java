//This is our (WonderPets) - Long Exam 3 (Portfollio Integration), where our portfolio are combined together in single system.
//With Facebook as our design inspiration.

package integration;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;

import portfolio.abigail.*;
import portfolio.charles.*;
import portfolio.kat.*;

public class PortfolioIntegration extends JFrame {
	private JPanel topPanel, middlePanel, abiPanel, charlesPanel, katPanel;
	private RoundedButton viewAbi, viewCharles, viewKat, requestAbi, requestCharles, requestKat;
	private JLabel logoLabel, friendReqLabel, seeAllLabel, abiLabel, charlesLabel, katLabel;
	private ImageIcon logo, light, dark, abiProfile, charlesProfile, katProfile;
	private Image image, resizedImage;
	private JToggleButton switchMode;
	
	PortfolioIntegration() {
		setTitle("Portfolio Integration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(640, 410));
		setLayout(new BorderLayout());
		
		topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(0, 60));
		topPanel.setBackground(new Color(0x242526));
		topPanel.setLayout(null);
		
		logo = new ImageIcon("icon/fb-logo.png");
		image = logo.getImage() ;
		resizedImage = image.getScaledInstance(45, 45, java.awt.Image.SCALE_SMOOTH);
		logo = new ImageIcon(resizedImage);

		logoLabel = new JLabel("FriendsBook");
		logoLabel.setFont(new java.awt.Font(null, Font.BOLD, 30));
		logoLabel.setForeground(new Color(0x1877F2));
		logoLabel.setIcon(logo);
		logoLabel.setBounds(10, 5, 240, 50);
		
		dark = new ImageIcon("icon/dark.png");
		light = new ImageIcon("icon/light.png");
		
		switchMode = new JToggleButton(dark);
		switchMode.setOpaque(false);
		switchMode.setBounds(560, 5, 50, 50);
		switchMode.setBackground(getForeground());
		switchMode.setBorderPainted(false);
        switchMode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (switchMode.isSelected()) {
                    switchMode.setIcon(light);
                    lightMode();
                } else {
                    switchMode.setIcon(dark);
                    darkMode();
                }
            }
        });
		
		topPanel.add(logoLabel);
		topPanel.add(switchMode);
		
		middlePanel = new JPanel();
		middlePanel.setBackground(new Color(0x18191A));
		middlePanel.setLayout(null);

		friendReqLabel = new JLabel("Friend Requests");
		friendReqLabel.setFont(new Font(null, Font.BOLD, 20));
		friendReqLabel.setForeground(Color.white);
		friendReqLabel.setBounds(20, 5, 180, 30);
		
		seeAllLabel = new JLabel("See All");
		seeAllLabel.setFont(new Font(null, Font.BOLD, 20));
		seeAllLabel.setForeground(new Color(0x2572DE));
		seeAllLabel.setBounds(535, 5, 70, 30);
		
		abiPanel = new JPanel();
		abiPanel.setBounds(20, 40, 180, 250);
		abiPanel.setBackground(new Color(0x3B3D3E));
		abiPanel.setLayout(null);
		
		
		abiProfile = new ImageIcon("profile/abi.png");
		image = abiProfile.getImage() ;
		resizedImage = image.getScaledInstance(180, 140, java.awt.Image.SCALE_SMOOTH);
		abiProfile = new ImageIcon(resizedImage);
		
		abiLabel = new JLabel("Abigail Allado");
		abiLabel.setFont(new java.awt.Font(null, Font.BOLD, 18));
		abiLabel.setHorizontalTextPosition(JLabel.CENTER);
		abiLabel.setVerticalTextPosition(JLabel.BOTTOM);
		abiLabel.setForeground(Color.WHITE);
		abiLabel.setIcon(abiProfile);
		abiLabel.setBounds(0, 0, 180, 169);
		
		requestAbi = new RoundedButton("Confirm Request");
		requestAbi.setBackground(new Color(0x2572DE));
		requestAbi.setBounds(10, 175, 160, 30);
		requestAbi.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(requestAbi)) {
					requestAbi.setText("Request Accepted");
					requestAbi.setBackground(new Color(0xA6A6A6));
					requestAbi.setEnabled(false);
		        } 
			}
		});
		
		viewAbi = new RoundedButton("View Portfolio");
		viewAbi.setBackground(new Color(0x737373));
		viewAbi.setFocusable(false);
		viewAbi.setBounds(10, 210, 160, 30);
		viewAbi.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(viewAbi)) {
					AbiPortfolio abi = new AbiPortfolio();
					abi.abiPortfolioRun();
		        } 
			}
		});
		
		abiPanel.add(abiLabel);
		abiPanel.add(requestAbi);
		abiPanel.add(viewAbi);
		
		charlesPanel = new JPanel();
		charlesPanel.setBounds(220, 40, 180, 250);
		charlesPanel.setBackground(new Color(0x3B3D3E));
		charlesPanel.setLayout(null);
		
		charlesProfile = new ImageIcon("profile/charles.png");
		image = charlesProfile.getImage();
		resizedImage = image.getScaledInstance(180, 140, java.awt.Image.SCALE_SMOOTH);
		charlesProfile = new ImageIcon(resizedImage);
		
		charlesLabel = new JLabel("Charles Alejaga");
		charlesLabel.setFont(new java.awt.Font(null, Font.BOLD, 18));
		charlesLabel.setHorizontalTextPosition(JLabel.CENTER);
		charlesLabel.setVerticalTextPosition(JLabel.BOTTOM);
		charlesLabel.setForeground(Color.WHITE);
		charlesLabel.setIcon(charlesProfile);
		charlesLabel.setBounds(0, 0, 180, 169);
		
		requestCharles = new RoundedButton("Confirm Request");
		requestCharles.setBackground(new Color(0x2572DE));
		requestCharles.setBounds(10, 175, 160, 30);
		requestCharles.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(requestCharles)) {
					requestCharles.setText("Request Accepted");
					requestCharles.setBackground(new Color(0xA6A6A6));
					requestCharles.setEnabled(false);
		        } 
			}
		});
		
		viewCharles = new RoundedButton("View Portfolio");
		viewCharles.setBackground(new Color(0x737373));
		viewCharles.setFocusable(false);
		viewCharles.setBounds(10, 210, 160, 30);
		viewCharles.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(viewCharles)) {
					HomePage charles= new HomePage();
					charles.charlesPortfolioRun();
		        } 
			}
		});
		
		charlesPanel.add(charlesLabel);
		charlesPanel.add(requestCharles);
		charlesPanel.add(viewCharles);
		
		katPanel = new JPanel();
		katPanel.setBounds(420, 40, 180, 250);
		katPanel.setBackground(new Color(0x3B3D3E));
		katPanel.setLayout(null);
		
		katProfile = new ImageIcon("profile/kat.png");
		image = katProfile.getImage();
		resizedImage = image.getScaledInstance(180, 140, java.awt.Image.SCALE_SMOOTH);
		katProfile = new ImageIcon(resizedImage);
		
		katLabel = new JLabel("Katrina Lara");
		katLabel.setFont(new java.awt.Font(null, Font.BOLD, 18));
		katLabel.setHorizontalTextPosition(JLabel.CENTER);
		katLabel.setVerticalTextPosition(JLabel.BOTTOM);
		katLabel.setForeground(Color.WHITE);
		katLabel.setIcon(katProfile);
		katLabel.setBounds(0, 0, 180, 169);
		
		requestKat = new RoundedButton("Confirm Request");
		requestKat.setBackground(new Color(0x2572DE));
		requestKat.setBounds(10, 175, 160, 30);
		requestKat.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(requestKat)) {
					requestKat.setText("Request Accepted");
					requestKat.setBackground(new Color(0xA6A6A6));
					requestKat.setEnabled(false);
		        } 
			}
		});
		
		viewKat = new RoundedButton("View Portfolio");
		viewKat.setBackground(new Color(0x737373));
		viewKat.setFocusable(false);
		viewKat.setBounds(10, 210, 160, 30);
		viewKat.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(viewKat)) {
					MyPortfolio kat = new MyPortfolio();
					kat.katPortfolioRun();
		        } 
			}
		});
		
		katPanel.add(katLabel);
		katPanel.add(requestKat);
		katPanel.add(viewKat);

		middlePanel.add(friendReqLabel);
		middlePanel.add(seeAllLabel);
		middlePanel.add(abiPanel);
		middlePanel.add(charlesPanel);
		middlePanel.add(katPanel);
		
		add(topPanel, BorderLayout.NORTH);
		add(middlePanel, BorderLayout.CENTER);
	}
	
	void lightMode() {
		topPanel.setBackground(new Color(0xFFFFFF));
		friendReqLabel.setForeground(Color.BLACK);
		middlePanel.setBackground(new Color(0xEDEFF2));
		
		abiPanel.setBackground(new Color(0xFFFFFE));
		charlesPanel.setBackground(new Color(0xFFFFFE));
		katPanel.setBackground(new Color(0xFFFFFE));
		
		abiLabel.setForeground(Color.BLACK);
		viewAbi.setBackground(new Color(0xF0F2F5));
		viewAbi.setForeground(Color.BLACK);
		
		charlesLabel.setForeground(Color.BLACK);
		viewCharles.setBackground(new Color(0xF0F2F5));
		viewCharles.setForeground(Color.BLACK);
		
		katLabel.setForeground(Color.BLACK);
		viewKat.setBackground(new Color(0xF0F2F5));
		viewKat.setForeground(Color.BLACK);
	}
	
	void darkMode() {
		topPanel.setBackground(new Color(0x242526));
		friendReqLabel.setForeground(Color.white);
		middlePanel.setBackground(new Color(0x18191A));
		
		abiPanel.setBackground(new Color(0x3B3D3E));
		charlesPanel.setBackground(new Color(0x3B3D3E));
		katPanel.setBackground(new Color(0x3B3D3E));
		
		abiLabel.setForeground(Color.WHITE);
		viewAbi.setBackground(new Color(0x737373));
		viewAbi.setForeground(Color.WHITE);
		
		charlesLabel.setForeground(Color.WHITE);
		viewCharles.setBackground(new Color(0x737373));
		viewCharles.setForeground(Color.WHITE);
		
		katLabel.setForeground(Color.WHITE);
		viewKat.setBackground(new Color(0x737373));
		viewKat.setForeground(Color.WHITE);
	}
	
	 private static class RoundedButton extends JButton { //To create a rounded corners of the JButtons

	        public RoundedButton(String text) {
	            super(text);
	            setHorizontalAlignment(SwingConstants.CENTER);
	    		setFont(new Font(null, Font.BOLD, 15));
	    		setForeground(Color.WHITE);
	            setOpaque(false);
	            setBorderPainted(false);
	        }

	        @Override
	        protected void paintComponent(Graphics g) {
	            Graphics2D graphics2D = (Graphics2D) g.create();
	            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	            int width = getWidth();
	            int height = getHeight();

	            // Paint the button background
	            if (getModel().isPressed()) {
	                graphics2D.setColor(getBackground().darker());
	            } else {
	                graphics2D.setColor(getBackground());
	            }

	            graphics2D.fill(new RoundRectangle2D.Double(0, 0, width - 1, height - 1, 10, 10));

	            // Paint the button text
	            graphics2D.setColor(getForeground());
	            FontMetrics fontMetrics = graphics2D.getFontMetrics();
	            String text = getText();
	            int textWidth = fontMetrics.stringWidth(text);
	            int textHeight = fontMetrics.getHeight();
	            int x = (width - textWidth) / 2;
	            int y = (height + textHeight) / 2 - fontMetrics.getDescent();
	            graphics2D.drawString(text, x, y);

	            graphics2D.dispose();
	        }
	    }
	 
	 public void portfolioIntegrationRun() { //To instantiate the PortfolioIntegration object
		 PortfolioIntegration portfolios = new PortfolioIntegration();
		 portfolios.setVisible(true);
	 }
}
