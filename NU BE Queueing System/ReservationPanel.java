import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReservationPanel extends ContentPanel implements ActionListener{
    private JPanel slotReservationPanel;
    private JLabel slotReservationLabel,slotReservationMessageLabel;
    private JLabel purposeLabel, selectDateLabel, monthLabel, dayLabel, yearLabel, amLabel, pmLabel, selectTimeLabel, calendarLabel;
    private ImageIcon calendar[];
    private Image image, resizedImage;
    private JComboBox monthsCB, purposeCB, daysCB;
    private JTextField yearTF;
    private JButton next, previous,confirm;
    private JRadioButton time_1, time_2, time_3, time_4, time_5;
    private ButtonGroup timeOptions;
    private ReservationSummaryFrame reservationSummary;
    int i;
    
    public ReservationPanel(int color) {
        super(color);
  
        slotReservationPanel = new JPanel();
        slotReservationPanel.setBackground(new Color(0xFFBD59));
        slotReservationPanel.setBounds(835, 0, 360, 585);
        slotReservationPanel.setLayout(null);
				
        //add components in slot reservation panel
		slotReservationLabel = new JLabel("SLOT RESERVATION");
		slotReservationLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		slotReservationLabel.setForeground(new Color(0x293476));
		slotReservationLabel.setBounds(50, 60, 280, 30);
						
		String text = "Before you fill out the information below please check the BE calender and schedule. Please fill out all the empty fields to complete your online slot reservation.";
		slotReservationMessageLabel = new JLabel("<html><div style='text-align: center;'>" + text + "</div></html>");
		slotReservationMessageLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		slotReservationMessageLabel.setBounds(35, 95, 280, 60);
						
		purposeLabel = new JLabel("PURPOSE:");
		purposeLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		purposeLabel.setForeground(Color.BLACK);
		purposeLabel.setFocusable(false);
		purposeLabel.setBounds(30, 170, 100, 20);
						
		String purposes[] = {"Buy Items", "Return Items"};
		
		purposeCB = new JComboBox(purposes);
		purposeCB.setForeground(Color.BLACK);
		purposeCB.setBackground(Color.WHITE);
		purposeCB.setBounds(130, 170, 190, 25);
						
		selectDateLabel = new JLabel("SELECT THE DATE:");
		selectDateLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		selectDateLabel.setForeground(Color.BLACK);
		selectDateLabel.setBounds(30, 215, 200, 20);
		
		monthLabel = new JLabel("MONTH");
		monthLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		monthLabel.setHorizontalAlignment(SwingConstants.LEFT);
		monthLabel.setForeground(Color.BLACK);
		monthLabel.setBounds(30, 245, 70, 20);
						
		String months[]={"January","Febraury","March","April","May", "June", "July", "August", "September", "October", "November", "December"};
						
		monthsCB = new JComboBox(months);
		monthsCB.setForeground(Color.BLACK);
		monthsCB.setBackground(Color.WHITE);
		((JLabel) monthsCB.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		monthsCB.setBounds(30, 270, 100, 25);
						
		dayLabel = new JLabel("DAY");
		dayLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		dayLabel.setHorizontalAlignment(SwingConstants.LEFT);
		dayLabel.setForeground(Color.BLACK);
		dayLabel.setBounds(145, 245, 60, 20);
						
		String[] daysOfMonth = new String[31];
		
		for (int i = 0; i < 31; i++) {
		daysOfMonth[i] = Integer.toString(i + 1);
		}
						
		daysCB = new JComboBox(daysOfMonth);
		daysCB.setForeground(Color.BLACK);
		daysCB.setBackground(Color.WHITE);
		((JLabel) daysCB.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		daysCB.setBounds(145, 270, 80, 25);
						
		yearLabel = new JLabel("YEAR");
		yearLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		yearLabel.setHorizontalAlignment(SwingConstants.LEFT);
		yearLabel.setForeground(Color.BLACK);
		yearLabel.setBounds(240, 245, 60, 20);
						
		yearTF = new JTextField("2023");
		yearTF.setForeground(Color.BLACK);
		yearTF.setBackground(Color.WHITE);
		yearTF.setFont(new Font(null, Font.BOLD, 12));
		yearTF.setHorizontalAlignment(SwingConstants.CENTER);
		yearTF.setEditable(false);   
		yearTF.setBounds(240, 270, 80, 25);
					
		selectTimeLabel = new JLabel("AVAILABLE SLOTS:");
		selectTimeLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		selectTimeLabel.setForeground(Color.BLACK);
		selectTimeLabel.setBounds(30, 320, 250, 20);
					
		amLabel = new JLabel("AM SCHEDULE");
		amLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		amLabel.setHorizontalAlignment(SwingConstants.LEFT);
		amLabel.setForeground(Color.BLACK);
		amLabel.setBounds(30, 350, 120, 20);
					
		pmLabel = new JLabel("PM SCHEDULE");
		pmLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		pmLabel.setHorizontalAlignment(SwingConstants.LEFT);
		pmLabel.setForeground(Color.BLACK);
		pmLabel.setBounds(180, 350, 150, 20);
					
		time_1 = new JRadioButton("08:30 AM to 09:30 AM");
		time_1.setBounds(25, 380, 150, 20);
		time_1.setFont(new Font(null, Font.BOLD, 12));
		time_1.setForeground(Color.BLACK);
		time_1.setBackground(new Color(0xFFBD59));
		time_1.setFocusable(false);
		time_1.addActionListener(this);
					
		time_2 = new JRadioButton("09:30 AM to 10:30 AM");
		time_2.setBounds(25, 410, 150, 20);
		time_2.setFont(new Font(null, Font.BOLD, 12));
		time_2.setForeground(Color.BLACK);
		time_2.setBackground(new Color(0xFFBD59));
		time_2.setFocusable(false);
		time_2.addActionListener(this);
					
		time_3 = new JRadioButton("10:30 AM to 11:30 AM");
		time_3.setBounds(25, 440, 150, 20);
		time_3.setFont(new Font(null, Font.BOLD, 12));
		time_3.setForeground(Color.BLACK);
		time_3.setBackground(new Color(0xFFBD59));
		time_3.setFocusable(false);
		time_3.addActionListener(this);
					
		time_4 = new JRadioButton("01:00 PM to 02:00 PM");
		time_4.setBounds(175, 380, 150, 20);
		time_4.setFont(new Font(null, Font.BOLD, 12));
		time_4.setForeground(Color.BLACK);
		time_4.setBackground(new Color(0xFFBD59));
		time_4.setFocusable(false);
		time_4.addActionListener(this);
					
		time_5 = new JRadioButton("02:00 PM to 03:30 PM");
		time_5.setBounds(175, 410, 150, 20);
		time_5.setFont(new Font(null, Font.BOLD, 12));
		time_5.setForeground(Color.BLACK);
		time_5.setBackground(new Color(0xFFBD59));
		time_5.setFocusable(false);
		time_5.addActionListener(this);
					
		ButtonGroup timeOptions = new ButtonGroup();
		timeOptions.add(time_1);
		timeOptions.add(time_2);
		timeOptions.add(time_3);
		timeOptions.add(time_4);
		timeOptions.add(time_5);
					
		confirm = new JButton("CONFIRM");
		confirm.setHorizontalAlignment(SwingConstants.CENTER);
		confirm.setFont(new Font("Tahoma", Font.BOLD, 15));
		confirm.setBackground(new Color(0x293478));
		confirm.setForeground(Color.WHITE);
		confirm.setBounds(120, 490, 115, 25);
		confirm.setFocusable(false);
		confirm.addActionListener(this);

        slotReservationPanel.add(confirm);
		slotReservationPanel.add(pmLabel);
		slotReservationPanel.add(amLabel);
		slotReservationPanel.add(time_1);
		slotReservationPanel.add(time_2);
		slotReservationPanel.add(time_3);
		slotReservationPanel.add(time_4);
		slotReservationPanel.add(time_5);
		slotReservationPanel.add(yearTF);
		slotReservationPanel.add(daysCB);
		slotReservationPanel.add(monthLabel);
		slotReservationPanel.add(dayLabel);
		slotReservationPanel.add(yearLabel);
		slotReservationPanel.add(purposeLabel);
		slotReservationPanel.add(purposeCB);
		slotReservationPanel.add(selectDateLabel);
		slotReservationPanel.add(selectTimeLabel);
		slotReservationPanel.add(monthsCB);
		slotReservationPanel.add(slotReservationMessageLabel);
		slotReservationPanel.add(slotReservationLabel);
            
		calendarLabel = new JLabel();
		calendarLabel.setBounds(18, 50, 800, 450);
			
		calendar = new ImageIcon[12];
		calendar [0] = new ImageIcon("C:\\Users\\National University\\Desktop\\ALLADO_INF224\\NU BE Pics\\JANUARY.png");
		calendar [1] = new ImageIcon("C:\\Users\\National University\\Desktop\\ALLADO_INF224\\NU BE Pics\\FEBRUARY.png");
		calendar [2] = new ImageIcon("C:\\Users\\National University\\Desktop\\ALLADO_INF224\\NU BE Pics\\MARCH.png");
		calendar [3] = new ImageIcon("C:\\Users\\National University\\Desktop\\ALLADO_INF224\\NU BE Pics\\APRIL.png");
		calendar [4] = new ImageIcon("C:\\Users\\National University\\Desktop\\ALLADO_INF224\\NU BE Pics\\MAY.png");
		calendar [5] = new ImageIcon("C:\\Users\\National University\\Desktop\\ALLADO_INF224\\NU BE Pics\\JUNE.png");
		calendar [6] = new ImageIcon("C:\\Users\\National University\\Desktop\\ALLADO_INF224\\NU BE Pics\\JULY.png");
		calendar [7] = new ImageIcon("C:\\Users\\National University\\Desktop\\ALLADO_INF224\\NU BE Pics\\AUGUST.png");
		calendar [8] = new ImageIcon("C:\\Users\\National University\\Desktop\\ALLADO_INF224\\NU BE Pics\\SEPTEMBER.png");
		calendar [9] = new ImageIcon("C:\\Users\\National University\\Desktop\\ALLADO_INF224\\NU BE Pics\\OCTOBER.png");
		calendar [10] = new ImageIcon("C:\\Users\\National University\\Desktop\\ALLADO_INF224\\NU BE Pics\\NOVEMBER.png");
		calendar [11] = new ImageIcon("C:\\Users\\National University\\Desktop\\ALLADO_INF224\\NU BE Pics\\DECEMBER.png");
			
		int desiredWidth = 800; //set the desired width
	    int desiredHeight = 450; //set the desired height

	    for (int i = 0; i < calendar.length; i++) {
	    	Image originalImage = calendar[i].getImage();
	        Image resizedImage = originalImage.getScaledInstance(desiredWidth, desiredHeight, Image.SCALE_SMOOTH);
	        calendar[i] = new ImageIcon(resizedImage); // Replace the original ImageIcon with the resized one
	    }

		calendarLabel.setIcon(calendar[0]);
			
		previous = new JButton("PREVIOUS");
		previous.setHorizontalAlignment(SwingConstants.CENTER);
		previous.setFont(new Font("Tahoma", Font.BOLD, 15));
		previous.setBackground(new Color(0x293478));
		previous.setForeground(Color.WHITE);
		previous.setBounds(18, 510, 115, 25);
		previous.setFocusable(false);
		previous.addActionListener(this);
			
		next = new JButton("NEXT");
		next.setHorizontalAlignment(SwingConstants.CENTER);
		next.setFont(new Font("Tahoma", Font.BOLD, 15));
		next.setBackground(new Color(0x293478));
		next.setForeground(Color.WHITE);
		next.setBounds(143, 510, 115, 25);
		next.setFocusable(false);
		next.addActionListener(this);
      
        addLabel(calendarLabel);
        addButton(next);
        addButton(previous);
        addPanel(slotReservationPanel);
    }
    
    private String getPurpose() {
    	String purpose = (String) purposeCB.getSelectedItem();
    	String purposeStr =  purpose;
    	
    	return purposeStr;
    }
    
    private String getDate() {
    	String month = (String) monthsCB.getSelectedItem();
        String day = (String) daysCB.getSelectedItem();
        String year = yearTF.getText();
        
        String date = month + " " + day + ", " + year;
    	
    	return date;
    }
    
    private String getTime() {
    	String time = "";

        if (time_1.isSelected()) {
            time = time_1.getText();
        } else if (time_2.isSelected()) {
            time = time_2.getText();
        } else if (time_3.isSelected()) {
            time = time_3.getText();
        } else if (time_4.isSelected()) {
            time = time_4.getText();
        } else if (time_5.isSelected()) {
            time = time_5.getText();
        }
        
        String timeStr = time;
    	
    	return timeStr;
    }

    private boolean reservationConfirmed = false; // Flag to track reservation confirmation
    
    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	if(e.getSource() == previous)
	    {
	        if(i==0)
	        {
	        	
	        }
	        else
	            {
	            i=i-1;
	            calendarLabel.setIcon(calendar[i]);
	        }
	    }
	    
		if(e.getSource() == next)
	    {
	        if(i==calendar.length-1)
	        {
	        	
	        }
	        else
	            {
	            i=i+1;
	            calendarLabel.setIcon(calendar[i]);
	            }
	        }
		
	    
	    if (e.getSource().equals(confirm)) {
	    	
	    	if (e.getSource() == confirm) {
	            if (!time_1.isSelected() && !time_2.isSelected() && !time_3.isSelected() && !time_4.isSelected() && !time_5.isSelected()) {
	                JOptionPane.showMessageDialog(null, "You need to select one time option!", "Error", JOptionPane.ERROR_MESSAGE);
	            }  else {
	            	int confirmation = JOptionPane.showConfirmDialog(null, "Do you want to confirm your reservation?", "Reservation Confirmation", JOptionPane.YES_NO_OPTION);
			        if (confirmation == JOptionPane.YES_OPTION) {
			            JOptionPane.showMessageDialog(null, "Reservation confirmed!");
			            reservationConfirmed = true;
			            
			            String purpose = getPurpose();
			        	String date = getDate();
			        	String time = getTime();
			        	
			        	reservationSummary = new ReservationSummaryFrame(purpose, date, time);
			            reservationSummary.setVisible(true);
			            
			        } else {
			            reservationConfirmed = false;
			        }
	            }
	    	}
	    }
    }
}
