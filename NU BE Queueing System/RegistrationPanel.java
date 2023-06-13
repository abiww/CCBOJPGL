import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

import nube.model.UserManagement;
import nube.model.Users;

class RegistrationPanel extends ContentPanel {
	 private JPanel registerPanel;
	 private ContentPanel registrationBGPanel;
	 private JLabel registrationLabel, registrationMessageLabel;
	 private JLabel firstNameLabel, lastNameLabel, studentIDLabel, emailLabel, contactNumberLabel, departmentLabel, yearLabel;
	 private JTextField firstNameTF, lastNameTF, studentIDTF, departmentTF, emailTF, contactTF;
	 private JComboBox yearCB;
	 private JButton register, clear;
	 private JLayeredPane layeredPane;
	 private JLabel text_0, text_1, text_2, text_3, text_4, text_5;
	 
	  private HomeFrame homeFrame;

	RegistrationPanel(int color, HomeFrame homeFrame) {
		super(color);
        this.homeFrame = homeFrame;
		
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
			
		firstNameLabel = new JLabel("FIRST NAME");
		firstNameLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		firstNameLabel.setForeground(Color.WHITE);
		firstNameLabel.setBounds(40, 90, 150, 25);
		
		firstNameTF = new JTextField();
		firstNameTF.setBounds(40, 115, 134, 25);
		firstNameTF.setFont(new Font("Tahoma", Font.BOLD, 15));
		firstNameTF.setCaretColor(Color.BLACK);
		firstNameTF.addFocusListener(new FocusListener() {
	            @Override
	            public void focusGained(FocusEvent e) {
	                // Reset border color to BLACK when the text field gains focus
	            	firstNameTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                // Set border color to red if the text field is empty
	                if (firstNameTF.getText().isEmpty()) {
	                	firstNameTF.setBorder(BorderFactory.createLineBorder(Color.RED));
	                	text_0.setText("You need to fill this up!");
	                } else {
	                	firstNameTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	                	text_0.setText("");
	                }
	            }
	        });
		
		text_0 = new JLabel();
		text_0.setForeground(Color.RED);
		text_0.setFont(new Font("Tahoma", Font.BOLD, 10));
		text_0.setBounds(40, 135, 273, 25);
		
		lastNameLabel = new JLabel("LAST NAME");
		lastNameLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lastNameLabel.setForeground(Color.WHITE);
		lastNameLabel.setBounds(180, 90, 150, 25);
		
		lastNameTF = new JTextField();
		lastNameTF.setBounds(180, 115, 134, 25);
		lastNameTF.setFont(new Font("Tahoma", Font.BOLD, 15));
		lastNameTF.setCaretColor(Color.BLACK);
		lastNameTF.addFocusListener(new FocusListener() {
	            @Override
	            public void focusGained(FocusEvent e) {
	                // Reset border color to BLACK when the text field gains focus
	            	lastNameTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                // Set border color to red if the text field is empty
	                if (lastNameTF.getText().isEmpty()) {
	                	lastNameTF.setBorder(BorderFactory.createLineBorder(Color.RED));
	                    text_1.setText("You need to fill this up!");
	                } else {
	                	lastNameTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	                    text_1.setText("");
	                }
	            }
	        });
		
		text_1 = new JLabel();
		text_1.setForeground(Color.RED);
		text_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		text_1.setBounds(180, 135, 273, 25);
			
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
		departmentTF.setBounds(40, 320, 170, 25);
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
		
		yearLabel = new JLabel("YEAR");
		yearLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		yearLabel.setForeground(Color.WHITE);
		yearLabel.setBounds(220, 295, 150, 25);
		
		String years[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		
		yearCB = new JComboBox(years);
		yearCB.setForeground(Color.BLACK);
		yearCB.setBackground(Color.WHITE);
		((JLabel) yearCB.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		yearCB.setBounds(220, 320, 93, 25);
		
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
		register.setBounds(40, 440, 130, 25);
		register.setFocusable(false);
		register.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            if (e.getSource() == register) {
	                // Validate the form fields
	                boolean isValid = validateFields();
	                if (isValid) {
	                	String firstName = firstNameTF.getText();
	                	String lastName = lastNameTF.getText();
	    	            String studentID = studentIDTF.getText();
	                	String department = departmentTF.getText();
	                	String years = (String) yearCB.getSelectedItem();
	                	String email = emailTF.getText();
	                	String contactNumber = contactTF.getText();
	                	
	                	int year = Integer.parseInt(years);
	                	
	                	Users users = new Users(firstName, lastName, studentID, department, email, year, contactNumber); 
	                    
	                    // Show success message
	                    JOptionPane.showMessageDialog(null, "Registered Successful!", "Registration", JOptionPane.PLAIN_MESSAGE);
	                    
	                    UserManagement userManagement = new UserManagement(firstName, lastName, studentID, department, email, year, contactNumber);
	                    
	                    userManagement.addUsers(users);

	                    // Clear fields and perform other actions if needed
	                    clearFields();
	                    homeFrame.dispose();
	                    ServiceFrame services = new ServiceFrame("NU Bulldog Exchange Queueing Management", firstName);
	                }
	            }
	        }
	    });

		
		clear = new JButton("CLEAR");
		clear.setHorizontalAlignment(SwingConstants.CENTER);
		clear.setFont(new Font("Tahoma", Font.BOLD, 15));
		clear.setBackground(new Color(0xFF3333));
		clear.setForeground(Color.WHITE);
		clear.setBounds(183, 440, 130, 25);
		clear.setFocusable(false);
		clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == clear) {
                        clearFields();   
                }
            }
        });
		
		registerPanel.add(registrationLabel);
		registerPanel.add(registrationMessageLabel);
		registerPanel.add(firstNameLabel);
		registerPanel.add(lastNameLabel);
		registerPanel.add(studentIDLabel);
		registerPanel.add(contactNumberLabel);
		registerPanel.add(departmentLabel);
		registerPanel.add(emailLabel);
		registerPanel.add(firstNameTF);
		registerPanel.add(lastNameTF);
		registerPanel.add(contactTF);
		registerPanel.add(studentIDTF);
		registerPanel.add(departmentTF);
		registerPanel.add(emailTF);
		registerPanel.add(yearLabel);
		registerPanel.add(yearCB);
		registerPanel.add(register);
		registerPanel.add(clear);
		registerPanel.add(text_0);
		registerPanel.add(text_1);
		registerPanel.add(text_2);
		registerPanel.add(text_3);
		registerPanel.add(text_4);
		registerPanel.add(text_5);
		
		layeredPane.add(registerPanel, Integer.valueOf(1));
		layeredPane.add(registrationBGPanel.getPanel(), Integer.valueOf(0));
		
	
		addLP(layeredPane);
	}
	
	private boolean validateFields() {
        String first_name = firstNameTF.getText();
        String last_name = lastNameTF.getText();
        String studentID = studentIDTF.getText();
        String department = departmentTF.getText();
        String email = emailTF.getText();
        String contactNumber = contactTF.getText();

        // Define regex patterns for validation
        String namePattern = "^[A-Za-z\\s]+$";
        String studentIDPattern = "^\\d{4}-\\d{6}$";
        String departmentPattern = "^[A-Za-z\\s]+$";
        String emailPattern = "^\\w+@students\\.national-u\\.edu\\.ph$";
        String contactNumberPattern = "^\\d{11}$";

        // Validate fields
        if (!validateField(first_name, namePattern, "First Name")) {
            return false;
        }
        
        if (!validateField(last_name, namePattern, "Last Name")) {
            return false;
        }
        
        if (!validateField(studentID, studentIDPattern, "Student ID")) {
            return false;
        }
        
        if (!validateField(department, departmentPattern, "Department")) {
            return false;
        }
        
        if (!validateField(email, emailPattern, "Email")) {
            return false;
        }
        
        if (!validateField(contactNumber, contactNumberPattern, "Contact Number")) {
            return false;
        }
        return true;
    }

    private boolean validateField(String fieldValue, String pattern, String fieldName) {
        Pattern regexPattern = Pattern.compile(pattern);
        Matcher matcher = regexPattern.matcher(fieldValue);
        boolean isValid = matcher.matches();
        if (!isValid) {
            JOptionPane.showMessageDialog(null, "Invalid " + fieldName, "Validation Error", JOptionPane.ERROR_MESSAGE);
        }
        return isValid;
    }
    
    void clearFields() {
        firstNameTF.setText("");
        lastNameTF.setText("");
        studentIDTF.setText("");
        departmentTF.setText("");
        emailTF.setText("");
        contactTF.setText("");
    }  
}
