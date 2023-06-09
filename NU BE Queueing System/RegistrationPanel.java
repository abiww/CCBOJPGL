import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;

class RegistrationPanel extends ContentPanel implements ActionListener{
	 private JPanel registerPanel;
	 private ContentPanel registrationBGPanel;
	 private JLabel registrationLabel, registrationMessageLabel;
	 private JLabel fullnameLabel, studentIDLabel, emailLabel, contactNumberLabel, departmentLabel;
	 private JTextField fullnameTF, studentIDTF, departmentTF, emailTF, contactTF;
	 private JButton register;
	 private JLayeredPane layeredPane;
	 private JLabel text_1, text_2, text_3, text_4, text_5;

	RegistrationPanel(int color) {
		super(color);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1185, 585);
		
		registrationBGPanel = new ContentPanel(0xFFBD59);
		registrationBGPanel.addImage("C:\\Users\\abiga\\OneDrive\\Desktop\\Project(NU BE Queueing Management System)\\National University Bulldog Exchange.png",  1185, 585);
		
		registerPanel = new JPanel();
		registerPanel.setBackground(new Color(0x293478));
		registerPanel.setBounds(450, 40, 350, 500);
		registerPanel.setLayout(null);
		
		registrationLabel = new JLabel("REGISTRATION");
		registrationLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		registrationLabel.setForeground(Color.ORANGE);
		registrationLabel.setBounds(82, 30, 200, 25);
		
		registrationMessageLabel = new JLabel("Kindly fill in the fields below to register");
		registrationMessageLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		registrationMessageLabel.setForeground(Color.WHITE);
		registrationMessageLabel.setBounds(70, 60, 220, 25);
			
		fullnameLabel = new JLabel("FULL NAME");
		fullnameLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		fullnameLabel.setForeground(Color.WHITE);
		fullnameLabel.setBounds(40, 90, 150, 25);
		
		fullnameTF = new JTextField();
		fullnameTF.setBounds(40, 115, 273, 25);
		fullnameTF.setFont(new Font("Tahoma", Font.BOLD, 15));
		fullnameTF.setCaretColor(Color.BLACK);
		fullnameTF.addFocusListener(new FocusListener() {
	            @Override
	            public void focusGained(FocusEvent e) {
	                // Reset border color to BLACK when the text field gains focus
	            	fullnameTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                // Set border color to red if the text field is empty
	                if (fullnameTF.getText().isEmpty()) {
	                	fullnameTF.setBorder(BorderFactory.createLineBorder(Color.RED));
	                    text_1.setText("You need to fill this up!");
	                } else {
	                	fullnameTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	                    text_1.setText("");
	                }
	            }
	        });
		
		text_1 = new JLabel();
		text_1.setForeground(Color.RED);
		text_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		text_1.setBounds(40, 135, 273, 25);
			
		studentIDLabel = new JLabel("STUDENT ID");
		studentIDLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		studentIDLabel.setForeground(Color.WHITE);
		studentIDLabel.setBounds(40, 155, 100, 25);
		
		studentIDTF = new JTextField();
		studentIDTF.setBounds(40, 180, 273, 25);
		studentIDTF.setFont(new Font("Tahoma", Font.BOLD, 15));
		studentIDTF.setCaretColor(Color.BLACK);
		studentIDTF.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Reset border color to BLACK when the text field gains focus
            	studentIDTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Set border color to red if the text field is empty
                if (studentIDTF.getText().isEmpty()) {
                	studentIDTF.setBorder(BorderFactory.createLineBorder(Color.RED));
                    text_2.setText("You need to fill this up!");
                } else {
                	studentIDTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    text_2.setText("");
                }
            }
        });
		
		text_2 = new JLabel();
		text_2.setForeground(Color.RED);
		text_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		text_2.setBounds(40, 200, 273, 25);
		
		emailLabel = new JLabel("EMAIL");
		emailLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		emailLabel.setForeground(Color.WHITE);
		emailLabel.setBounds(40, 225, 110, 25);
		
		emailTF = new JTextField();
		emailTF.setBounds(40, 250, 273, 25);
		emailTF.setFont(new Font("Tahoma", Font.BOLD, 15));
		emailTF.setCaretColor(Color.BLACK);
		emailTF.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Reset border color to BLACK when the text field gains focus
            	emailTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Set border color to red if the text field is empty
                if (emailTF.getText().isEmpty()) {
                	emailTF.setBorder(BorderFactory.createLineBorder(Color.RED));
                    text_3.setText("You need to fill this up!");
                } else {
                	emailTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    text_3.setText("");
                }
            }
        });
		
		text_3 = new JLabel();
		text_3.setForeground(Color.RED);
		text_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		text_3.setBounds(40, 270, 273, 25);
		
		departmentLabel = new JLabel("DEPARTMENT");
		departmentLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		departmentLabel.setForeground(Color.WHITE);
		departmentLabel.setBounds(40, 295, 150, 25);
		
		departmentTF = new JTextField();
		departmentTF.setBounds(40, 320, 273, 25);
		departmentTF.setFont(new Font("Tahoma", Font.BOLD, 15));
		departmentTF.setCaretColor(Color.BLACK);
		departmentTF.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Reset border color to BLACK when the text field gains focus
            	departmentTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Set border color to red if the text field is empty
                if (departmentTF.getText().isEmpty()) {
                	departmentTF.setBorder(BorderFactory.createLineBorder(Color.RED));
                	text_4.setText("You need to fill this up!");
                } else {
                	departmentTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                	text_4.setText("");
                }
            }
        });
		
		text_4 = new JLabel();
		text_4.setForeground(Color.RED);
		text_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		text_4.setBounds(40, 340, 273, 25);
		
		contactNumberLabel = new JLabel("CONTACT NUMBER");
		contactNumberLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		contactNumberLabel.setForeground(Color.WHITE);
		contactNumberLabel.setBounds(40, 365, 150, 25);
		
		contactTF = new JTextField();
		contactTF.setBounds(40, 390, 273, 25);
		contactTF.setFont(new Font("Tahoma", Font.BOLD, 15));
		contactTF.setCaretColor(Color.BLACK);
		contactTF.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Reset border color to BLACK when the text field gains focus
            	contactTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Set border color to red if the text field is empty
                if (contactTF.getText().isEmpty()) {
                	contactTF.setBorder(BorderFactory.createLineBorder(Color.RED));
                	text_5.setText("You need to fill this up!");
                } else {
                	contactTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                	text_5.setText("");
                }
            }
        });
		
		text_5 = new JLabel();
		text_5.setForeground(Color.RED);
		text_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		text_5.setBounds(40, 410, 273, 25);
			
		register = new JButton("REGISTER");
		register.setHorizontalAlignment(SwingConstants.CENTER);
		register.setFont(new Font("Tahoma", Font.BOLD, 15));
		register.setBackground(new Color(0x00FF00));
		register.setForeground(Color.WHITE);
		register.setBounds(125, 440, 115, 25);
		register.setFocusable(false);
		register.addActionListener(this);
		
		registerPanel.add(registrationLabel);
		registerPanel.add(registrationMessageLabel);
		registerPanel.add(fullnameLabel);
		registerPanel.add(studentIDLabel);
		registerPanel.add(contactNumberLabel);
		registerPanel.add(departmentLabel);
		registerPanel.add(emailLabel);
		registerPanel.add(fullnameTF);
		registerPanel.add(contactTF);
		registerPanel.add(studentIDTF);
		registerPanel.add(departmentTF);
		registerPanel.add(emailTF);
		registerPanel.add(register);
		registerPanel.add(text_1);
		registerPanel.add(text_2);
		registerPanel.add(text_3);
		registerPanel.add(text_4);
		registerPanel.add(text_5);
		
		layeredPane.add(registerPanel, Integer.valueOf(1));
		layeredPane.add(registrationBGPanel.getPanel(), Integer.valueOf(0));
		
	
		addLP(layeredPane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
