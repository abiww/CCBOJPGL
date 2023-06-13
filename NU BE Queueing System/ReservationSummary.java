import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import javax.swing.*;

import nube.model.UserManagement;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.image.*;

public class ReservationSummaryFrame extends JFrame{
    private JLabel purposeLabel, dateLabel, timeLabel;
    private JLabel logoLabel, headings, userInfo, reservationInfo, noteLabel_1, noteLabel_2;
    private JLabel nameLabel, studentIDLabel, departmentLabel, yearLabel, currentDate;
    private JPanel topPanel, summaryPanel;
    private ImageIcon logo;
	private Image image, resizedImage;
	private JButton save;

    public ReservationSummaryFrame(String purpose_, String date_, String time_) {
        setTitle("Reservation Summary");
        
        topPanel = new JPanel();
		topPanel.setBackground(new Color(0x293478));
		topPanel.setBounds(0, 0, 350, 70);
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
		
		logo = new ImageIcon("C:\\Users\\abiga\\OneDrive\\Desktop\\Project(NU BE Queueing Management System)\\logo.png");
		image = logo.getImage() ;
		resizedImage = image.getScaledInstance(80, 60, java.awt.Image.SCALE_SMOOTH);
		logo = new ImageIcon(resizedImage);
		 
		logoLabel = new JLabel("<html> <font size=\"5\"> NU BULLDOG EXCHANGE </font> <br> <font size=\"4\"> QUEUEING MANAGEMENT </font> <html>");
		logoLabel.setFont(new java.awt.Font("Tahoma", Font.BOLD, 20));
		logoLabel.setIconTextGap(10);
		logoLabel.setForeground(Color.WHITE);
		logoLabel.setIcon(logo);
		
		topPanel.add(logoLabel, BorderLayout.CENTER);
		
		summaryPanel = new JPanel();
		summaryPanel.setBackground(new Color(0xf2cc19));
		summaryPanel.setLayout(null);
		summaryPanel.setBounds(20, 80, 300, 425);
		
		UserManagement users = new UserManagement("", "", "", "", "", 0, "");
		
		String studentId = users.getStudentID();
		String name = users.getName();
		String dept = users.getDepartment();
		int year = users.getYear();
		
		headings = new JLabel("OFFICIAL SLOT RESERVATION");
		headings.setHorizontalAlignment(JLabel.CENTER);
		headings.setFont(new Font("Tahoma", Font.BOLD, 18));
		headings.setForeground(new Color(0x293476));
		headings.setBounds(10, 15, 280, 20);
		
		String note_1 = ("This reservation is valid for the date and time selected only (1-time use ONLY). It is suggested to reschedule if you can't come.");
		noteLabel_1 = new JLabel("<html><div style='text-align: center;'>" + note_1 + "</div></html>");
		noteLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		noteLabel_1.setBounds(15, 40, 265, 35);
			
		String note_2 =("Secure a copy by taking a screenshot or saving this. Present this at the BE to avoid waiting in line.");
		noteLabel_2 = new JLabel("<html><div style='text-align: center;'>" + note_2 + "</div></html>");
		noteLabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		noteLabel_2.setBounds(20, 380, 265, 35);
		
		LocalDate current_Date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		String formattedDate = current_Date.format(formatter);
		
		currentDate = new JLabel("DATE: " + formattedDate);
		currentDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		currentDate.setForeground(Color.BLACK);
		currentDate.setBounds(165, 80, 120, 15);
		
		userInfo = new JLabel("PERSONAL INFORMATION");
		userInfo.setFont(new Font("Tahoma", Font.BOLD, 15));
		userInfo.setForeground(new Color(0x293476));
		userInfo.setBounds(15, 100, 230, 20);
		
		studentIDLabel = new JLabel("STUDENT ID: " + studentId);
		studentIDLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		studentIDLabel.setForeground(Color.BLACK);
		studentIDLabel.setBounds(15, 125, 300, 15);
		
		nameLabel = new JLabel("NAME: " + name);
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		nameLabel.setForeground(Color.BLACK);
		nameLabel.setBounds(15, 150, 300, 15);
		
		departmentLabel = new JLabel("DEPARTMENT: " + dept);
		departmentLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		departmentLabel.setForeground(Color.BLACK);
		departmentLabel.setBounds(15, 175, 300, 15);
		
		yearLabel = new JLabel("YEAR: " + year);
		yearLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		yearLabel.setForeground(Color.BLACK);
		yearLabel.setBounds(15, 200, 300, 15);
		
		reservationInfo = new JLabel("RESERVATION SUMMARY");
		reservationInfo.setFont(new Font("Tahoma", Font.BOLD, 15));
		reservationInfo.setForeground(new Color(0x293476));
		reservationInfo.setBounds(15, 225, 230, 20);
		
		purposeLabel = new JLabel("PURPOSE: " + purpose_);
		purposeLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		purposeLabel.setForeground(Color.BLACK);
		purposeLabel.setFocusable(false);
		purposeLabel.setBounds(15, 250, 300, 20);
		
		dateLabel = new JLabel("SCHEDULED DATE: " + date_);
		dateLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		dateLabel.setForeground(Color.BLACK);
		dateLabel.setBounds(15, 275, 300, 20);
		
		timeLabel = new JLabel("SCHEDULED TIME: " + time_);
		timeLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		timeLabel.setForeground(Color.BLACK);
		timeLabel.setBounds(15, 300, 300, 20);

        save = new JButton("SAVE");
		save.setHorizontalAlignment(SwingConstants.CENTER);
		save.setFont(new Font("Tahoma", Font.BOLD, 15));
		save.setBackground(new Color(0x00FF00));
		save.setForeground(Color.WHITE);
		save.setBounds(125, 520, 100, 25);
		save.setFocusable(false);
		save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    saveComponentAsImage(summaryPanel, "Reservation_Image.png", "PNG");
                    JOptionPane.showMessageDialog(null, "Image saved successfully!");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error saving image: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
		summaryPanel.add(headings);
		summaryPanel.add(noteLabel_1);
		summaryPanel.add(noteLabel_2);
        summaryPanel.add(purposeLabel);
        summaryPanel.add(dateLabel);
        summaryPanel.add(timeLabel);
        summaryPanel.add(userInfo);
        summaryPanel.add(studentIDLabel);
        summaryPanel.add(nameLabel);
        summaryPanel.add(departmentLabel);
        summaryPanel.add(yearLabel);
        summaryPanel.add(currentDate);
        summaryPanel.add(reservationInfo);
        
        add(summaryPanel);
        add(save);
        add(topPanel);
      
        setSize(360, 600);
        setLayout(null);
        getContentPane().setBackground(new Color(0x293478));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    private static void saveComponentAsImage(JPanel panel, String fileName, String format) throws IOException {
        BufferedImage img = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = img.createGraphics();
        panel.printAll(g2d);
        g2d.dispose();

        File file = new File(fileName);
        ImageIO.write(img, format, file);
    }
}
