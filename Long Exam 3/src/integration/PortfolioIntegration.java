package integration;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;

import portfolio.abigail.*;
import portfolio.charles.*;
import portfolio.kat.*;

public class PortfolioIntegration extends Button {
	private JFrame frame;
	private JPanel topPanel, middlePanel, abiPanel, charlesPanel, katPanel;
	private Button viewAbi, viewCharles, viewKat, requestAbi, requestCharles, requestKat;
	private JLabel logoLabel, friendReqLabel, seeAllLabel, abiLabel, charlesLabel, katLabel;
	private ImageIcon logo, light, dark, abiProfile, charlesProfile, katProfile;
	private Image image, resizedImage;
	private JToggleButton switchMode;
	
	PortfolioIntegration(String text) {
		super(text);
		frame = new JFrame("Portfolio Integration");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(640, 410));
		frame.setLayout(new BorderLayout());
		design();	
	}
	
	void design() {
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
		
		requestAbi = new Button("Confirm Request");
		requestAbi.setBackground(new Color(0x2572DE));
		requestAbi.setBounds(10, 175, 160, 30);
		requestAbi.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(requestAbi)) {
					requestAbi.setText("Request Accepted");
					requestAbi.setBackground(new Color(0xA6A6A6));
					requestAbi.setEnabled(false);
					
					viewAbi.setEnabled(true);		        
				} 
			}
		});
		
		viewAbi = new Button("View Portfolio");
		viewAbi.setBackground(new Color(0x737373));
		viewAbi.setFocusable(false);
		viewAbi.setBounds(10, 210, 160, 30);
		viewAbi.setEnabled(false);
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
		
		requestCharles = new Button("Confirm Request");
		requestCharles.setBackground(new Color(0x2572DE));
		requestCharles.setBounds(10, 175, 160, 30);
		requestCharles.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(requestCharles)) {
					requestCharles.setText("Request Accepted");
					requestCharles.setBackground(new Color(0xA6A6A6));
					requestCharles.setEnabled(false);
					
					viewCharles.setEnabled(true);
		        } 
			}
		});
		
		viewCharles = new Button("View Portfolio");
		viewCharles.setBackground(new Color(0x737373));
		viewCharles.setFocusable(false);
		viewCharles.setBounds(10, 210, 160, 30);
		viewCharles.setEnabled(false);
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
		
		requestKat = new Button("Confirm Request");
		requestKat.setBackground(new Color(0x2572DE));
		requestKat.setBounds(10, 175, 160, 30);
		requestKat.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(requestKat)) {
					requestKat.setText("Request Accepted");
					requestKat.setBackground(new Color(0xA6A6A6));
					requestKat.setEnabled(false);
					viewKat.setEnabled(true);
		        } 
			}
		});
		
		viewKat = new Button("View Portfolio");
		viewKat.setBackground(new Color(0x737373));
		viewKat.setFocusable(false);
		viewKat.setBounds(10, 210, 160, 30);
		viewKat.setEnabled(false);
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
		
		frame.add(topPanel, BorderLayout.NORTH);
		frame.add(middlePanel, BorderLayout.CENTER);
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

	 public boolean portfolioIntegrationRun() {
		 frame.setVisible(true);
		 
		 return true;
	 }
}