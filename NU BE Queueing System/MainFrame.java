import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainPage implements ActionListener {
	private JFrame frame;
	private JPanel topPanel, topLeftPanel, topRightPanel;
	private JLayeredPane layeredPane;
	private JPanel homePanel, aboutPanel, registrationPanel, registerPanel, orderTP, reservationTP, reservationPanel, reservationLeftPanel, orderSlipPanel, orderSummaryPanel, inventoryPanel;
	private JButton home, about, registration, register, orderSlip, reservation, next, previous, submit;
	private ImageIcon logo, calendar[];
	private Image image, resizedImage;
	private JLabel logoLabel, fullname, studentID, department, program, calendarLabel, slotReservationLabel, slotReservationMessageLabel, purposeLabel, selectDateLabel, monthLabel, dayLabel, yearLabel, selectTimeLabel, amLabel, pmLabel;
	private JTextField fullnameTF, studentIDTF, departmentTF, programTF, yearTF;
	private JComboBox monthsCB, purposeCB, daysCB;
	private JRadioButton time_1, time_2, time_3, time_4, time_5;
	private ButtonGroup timeOptions;
	int i;
	
	MainPage () {
		frame = new JFrame("NU Bulldog Exchange Queueing Management System");
		
		topPanel = new JPanel();
		topPanel.setBackground(new Color(0x293478));
		topPanel.setBounds(0, 0, 1185, 80);
		topPanel.setLayout(new BorderLayout());
		
		topLeftPanel = new JPanel();
		topLeftPanel.setBackground(new Color(0x293478));
		topLeftPanel.setPreferredSize(new Dimension(450, 80));
		topLeftPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 5));
		
		topRightPanel = new JPanel();
		topRightPanel.setBackground(new Color(0x293478));
		topRightPanel.setPreferredSize(new Dimension(600, 80));
		topRightPanel.setLayout(new FlowLayout(FlowLayout.TRAILING, 10, 0));
		
		home = new JButton("HOME");
		home.setHorizontalAlignment(SwingConstants.CENTER);
		home.setFont(new Font("Tahoma", Font.BOLD, 18));
		home.setBackground(new Color(0x293478));
		home.setForeground(Color.WHITE);
		home.setPreferredSize(new Dimension(90,80));
		home.setBorderPainted(false);
		home.setFocusable(false);
		home.addActionListener(this);
		
		about = new JButton("ABOUT");
		about.setHorizontalAlignment(SwingConstants.CENTER);
		about.setFont(new Font("Tahoma", Font.BOLD, 18));
		about.setBackground(new Color(0x293478));
		about.setForeground(Color.WHITE);
		about.setPreferredSize(new Dimension(100,80));
		about.setBorderPainted(false);
		about.setFocusable(false);
		about.addActionListener(this);
		
		registration = new JButton("REGISTRATION");
		registration.setHorizontalAlignment(SwingConstants.CENTER);
		registration.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18));
		registration.setBackground(new Color(0x293478));
		registration.setForeground(Color.WHITE);
		registration.setPreferredSize(new Dimension(180, 80));
		registration.setBorderPainted(false);
		registration.setFocusable(false);
		registration.addActionListener(this);
		
		orderSlip = new JButton("ORDER SLIP");
		orderSlip.setHorizontalAlignment(SwingConstants.CENTER);
		orderSlip.setFont(new Font("Tahoma", Font.BOLD, 18));
		orderSlip.setBackground(new Color(0x293478));
		orderSlip.setForeground(Color.WHITE);
		orderSlip.setPreferredSize(new Dimension(150,80));
		orderSlip.setBorderPainted(false);
		orderSlip.setFocusable(false);
		orderSlip.addActionListener(this);
		
		reservation = new JButton("RESERVATION");
		reservation.setHorizontalAlignment(SwingConstants.CENTER);
		reservation.setFont(new Font("Tahoma", Font.BOLD, 18));
		reservation.setBackground(new Color(0x293478));
		reservation.setForeground(Color.WHITE);
		reservation.setPreferredSize(new Dimension(170,80));
		reservation.setBorderPainted(false);
		reservation.setFocusable(false);
		reservation.addActionListener(this);
		
		logo = new ImageIcon("C:\\Users\\63999\\Downloads\\download-removebg-preview.png");
		image = logo.getImage() ;
		resizedImage = image.getScaledInstance(100, 70, java.awt.Image.SCALE_SMOOTH);
		logo = new ImageIcon(resizedImage);
		 
		logoLabel = new JLabel("<html> <font size=\"6\"> NU BULLDOG EXCHANGE </font> <br> <font size=\"5\"> QUEUEING MANAGEMENT </font> <html>");
		logoLabel.setFont(new java.awt.Font("Tahoma", Font.BOLD, 20));
		logoLabel.setIconTextGap(10);
		logoLabel.setForeground(Color.WHITE);
		logoLabel.setIcon(logo);
	
		
		topLeftPanel.add(logoLabel);
		
		topRightPanel.add(home);
		topRightPanel.add(about); 
		topRightPanel.add(registration);
		
		topPanel.add(topLeftPanel, BorderLayout.WEST);
		topPanel.add(topRightPanel, BorderLayout.EAST);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 80, 1185,650);
		
		aboutPanel = new JPanel();
		aboutPanel.setBackground(Color.MAGENTA);
		aboutPanel.setBounds(0, 0, 1185,630);
		
		homePanel = new JPanel();
		homePanel.setBackground(Color.BLUE);
		homePanel.setBounds(0, 0, 1185, 630);
		
		registrationPanel = new JPanel();
		registrationPanel.setBackground(Color.ORANGE);
		registrationPanel.setBounds(0, 0, 1185, 630);
		registrationPanel.setLayout(null);
			
			//add details in registration panel
			registerPanel = new JPanel();
			registerPanel.setBounds(400, 65, 400, 450);
			registerPanel.setLayout(null);
				
			fullname = new JLabel("NAME:");
			fullname.setFont(new Font("Tahoma", Font.BOLD, 15));
			fullname.setForeground(Color.BLACK);
			fullname.setBounds(35, 50, 50, 25);
				
			studentID = new JLabel("STUDENT ID:");
			studentID.setFont(new Font("Tahoma", Font.BOLD, 15));
			studentID.setForeground(Color.BLACK);
			studentID.setBounds(35, 90, 100, 25);
				
			department = new JLabel("DEPARTMENT:");
			department.setFont(new Font("Tahoma", Font.BOLD, 15));
			department.setForeground(Color.BLACK);
			department.setBounds(35, 130, 110, 25);
				
			program = new JLabel("PROGRAM:");
			program.setFont(new Font("Tahoma", Font.BOLD, 15));
			program.setForeground(Color.BLACK);
			program.setBounds(35, 170, 100, 25);
				
			fullnameTF = new JTextField();
			fullnameTF.setBounds(165, 50, 200, 25);
				
			studentIDTF = new JTextField();
			studentIDTF.setBounds(165, 90, 200, 25);				
			departmentTF = new JTextField();
			departmentTF.setBounds(165, 130, 200, 25);
			
			programTF = new JTextField();
			programTF.setBounds(165, 170, 200, 25);
				
			register = new JButton("REGISTER");
			register.setHorizontalAlignment(SwingConstants.CENTER);
			register.setFont(new Font("Tahoma", Font.BOLD, 15));
			register.setBackground(new Color(0x00FF00));
			register.setForeground(Color.WHITE);
			register.setBounds(165, 210, 115, 25);
			register.setFocusable(false);
			register.addActionListener(this);

			registerPanel.add(fullname);
			registerPanel.add(studentID);
			registerPanel.add(department);
			registerPanel.add(program);
			registerPanel.add(fullnameTF);
			registerPanel.add(studentIDTF);
			registerPanel.add(departmentTF);
			registerPanel.add(programTF);
			registerPanel.add(register);
				
			registrationPanel.add(registerPanel);
			
		orderSlipPanel = new JPanel();
		orderSlipPanel.setBackground(Color.PINK);
		orderSlipPanel.setBounds(0, 0, 1185, 630);
		orderSlipPanel.setLayout(new BorderLayout());
		
			//add details in order slip
			orderSummaryPanel = new JPanel();
			orderSummaryPanel.setBackground(Color.BLACK);
			orderSummaryPanel.setBounds(0, 0, 400, 0);
				
				//add details in order summary
			
			inventoryPanel = new JPanel();
			inventoryPanel.setBackground(Color.CYAN);
			inventoryPanel.setBounds(0, 0, 800, 0);
			
				//add details in inventory panel
			
			orderSlipPanel.add(orderSummaryPanel, BorderLayout.EAST);
			orderSlipPanel.add(inventoryPanel, BorderLayout.WEST);
		
		reservationPanel = new JPanel();
		reservationPanel.setBackground(new Color(0x004C99));
		reservationPanel.setBounds(0, 0, 1185, 630);
		reservationPanel.setLayout(null);
		
			//add details in reservation 
			reservationLeftPanel = new JPanel();
			reservationLeftPanel.setBackground(new Color(0xFFBD59));
			reservationLeftPanel.setBounds(835, 0, 360, 585);
			reservationLeftPanel.setLayout(null);
			
				//add details in reservation left panel
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
				
					String purposes[]={"Buy Items", "Return Items"};
					
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
				
				selectTimeLabel = new JLabel("SELECT THE TIME:");
				selectTimeLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
				selectTimeLabel.setForeground(Color.BLACK);
				selectTimeLabel.setBounds(30, 320, 200, 20);
				
				amLabel = new JLabel("AM SCHEDULE");
				amLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
				amLabel.setHorizontalAlignment(SwingConstants.LEFT);
				amLabel.setForeground(Color.BLACK);
				amLabel.setBounds(30, 350, 150, 20);
				
				pmLabel = new JLabel("PM SCHEDULE");
				pmLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
				pmLabel.setHorizontalAlignment(SwingConstants.LEFT);
				pmLabel.setForeground(Color.BLACK);
				pmLabel.setBounds(200, 350, 150, 20);
//				pmLabel.setBounds(30, 365, 150, 20);
				
				time_1 = new JRadioButton("08:30 to 09:30");
				time_1.setBounds(30, 380, 150, 20);
				time_1.setFont(new Font(null, Font.BOLD, 13));
				time_1.setForeground(Color.BLACK);
				time_1.setBackground(new Color(0xFFBD59));
				time_1.setFocusable(false);
				time_1.addActionListener(this);
				
				time_2 = new JRadioButton("09:30 to 10:30");
				time_2.setBounds(30, 410, 150, 20);
				time_2.setFont(new Font(null, Font.BOLD, 13));
				time_2.setForeground(Color.BLACK);
				time_2.setBackground(new Color(0xFFBD59));
				time_2.setFocusable(false);
				time_2.addActionListener(this);
				
				time_3 = new JRadioButton("10:30 to 11:30");
				time_3.setBounds(30, 440, 150, 20);
				time_3.setFont(new Font(null, Font.BOLD, 13));
				time_3.setForeground(Color.BLACK);
				time_3.setBackground(new Color(0xFFBD59));
				time_3.setFocusable(false);
				time_3.addActionListener(this);
				
				time_4 = new JRadioButton("01:00 to 02:00");
				time_4.setBounds(200, 380, 150, 20);
//				time_4.setBounds(30, 390, 150, 20);
				time_4.setFont(new Font(null, Font.BOLD, 13));
				time_4.setForeground(Color.BLACK);
				time_4.setBackground(new Color(0xFFBD59));
				time_4.setFocusable(false);
				time_4.addActionListener(this);
				
				time_5 = new JRadioButton("02:00 to 03:30");
				time_5.setBounds(200, 410, 150, 20);
//				time_5.setBounds(30, 415, 150, 20);
				time_5.setFont(new Font(null, Font.BOLD, 13));
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
				
				submit = new JButton("SUBMIT");
				submit.setHorizontalAlignment(SwingConstants.CENTER);
				submit.setFont(new Font("Tahoma", Font.BOLD, 15));
				submit.setBackground(new Color(0x293478));
				submit.setForeground(Color.WHITE);
				submit.setBounds(120, 490, 115, 25);
				submit.setFocusable(false);
				submit.addActionListener(this);
				
				
				reservationLeftPanel.add(submit);
				reservationLeftPanel.add(pmLabel);
				reservationLeftPanel.add(amLabel);
				reservationLeftPanel.add(time_1);
				reservationLeftPanel.add(time_2);
				reservationLeftPanel.add(time_3);
				reservationLeftPanel.add(time_4);
				reservationLeftPanel.add(time_5);
				reservationLeftPanel.add(yearTF);
				reservationLeftPanel.add(daysCB);
				reservationLeftPanel.add(monthLabel);
				reservationLeftPanel.add(dayLabel);
				reservationLeftPanel.add(yearLabel);
				reservationLeftPanel.add(purposeLabel);
				reservationLeftPanel.add(purposeCB);
				reservationLeftPanel.add(selectDateLabel);
				reservationLeftPanel.add(selectTimeLabel);
				reservationLeftPanel.add(monthsCB);
				reservationLeftPanel.add(slotReservationMessageLabel);
				reservationLeftPanel.add(slotReservationLabel);
			
			calendarLabel = new JLabel();
			calendarLabel.setBounds(18, 50, 800, 450);
			
			calendar = new ImageIcon[12];
			calendar [0] = new ImageIcon("C:\\Users\\63999\\Downloads\\JANUARY.png");
			calendar [1] = new ImageIcon("C:\\Users\\63999\\Desktop\\BE Calendar\\FEBRAURY.jpg");
			calendar [2] = new ImageIcon("C:\\Users\\63999\\Desktop\\BE Calendar\\MARCH.jpg");
			calendar [3] = new ImageIcon("C:\\Users\\63999\\Desktop\\BE Calendar\\APRIL.jpg");
			calendar [4] = new ImageIcon("C:\\Users\\63999\\Desktop\\BE Calendar\\MAY.jpg");
			calendar [5] = new ImageIcon("C:\\Users\\63999\\Desktop\\BE Calendar\\JUNE.jpg");
			calendar [6] = new ImageIcon("C:\\Users\\63999\\Desktop\\BE Calendar\\JULY.jpg");
			calendar [7] = new ImageIcon("C:\\Users\\63999\\Desktop\\BE Calendar\\AUGUST.jpg");
			calendar [8] = new ImageIcon("C:\\Users\\63999\\Desktop\\BE Calendar\\SEPTEMBER.jpg");
			calendar [9] = new ImageIcon("C:\\Users\\63999\\Desktop\\BE Calendar\\OCTOBER.jpg");
			calendar [10] = new ImageIcon("C:\\Users\\63999\\Desktop\\BE Calendar\\NOVEMBER.jpg");
			calendar [11] = new ImageIcon("C:\\Users\\63999\\Desktop\\BE Calendar\\DECEMBER.jpg");
			
			int desiredWidth = 800; // Set the desired width
	        int desiredHeight = 450; // Set the desired height

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
			
			reservationPanel.add(calendarLabel);
			reservationPanel.add(next);
			reservationPanel.add(previous);
			reservationPanel.add(reservationLeftPanel);
		
		layeredPane.add(homePanel, Integer.valueOf(4));
		layeredPane.add(aboutPanel, Integer.valueOf(3));
		layeredPane.add(registrationPanel, Integer.valueOf(2));
		layeredPane.add(orderSlipPanel, Integer.valueOf(1));
		layeredPane.add(reservationPanel, Integer.valueOf(0));
		
		frame.add(topPanel);
		frame.add(layeredPane);
		
		frame.setSize(new Dimension(1200, 700));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	void getUsersInfo() {
		
	}
	
	void getReservationSummary() {
		
	}
	
	void getOrderSlipSummary() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource().equals(about)) {
			about.setForeground(Color.orange);
			home.setForeground(Color.white);
			registration.setForeground(Color.white);
			
			aboutPanel.setVisible(true);
			homePanel.setVisible(false);
			registrationPanel.setVisible(false);
			
		} else if (e.getSource().equals(home)) {
			about.setForeground(Color.white);
			home.setForeground(Color.orange);
			registration.setForeground(Color.white);
			
			aboutPanel.setVisible(false);
			homePanel.setVisible(true);
			registrationPanel.setVisible(false);
			
		} else if (e.getSource().equals(registration)) {
			about.setForeground(Color.white);
			home.setForeground(Color.white);
			registration.setForeground(Color.orange);
			
			aboutPanel.setVisible(false);
			homePanel.setVisible(false);
			registrationPanel.setVisible(true);
		}
		
		if (e.getSource().equals(register)) {
			about.setVisible(false);
			home.setVisible(false);
			registration.setVisible(false);

			topRightPanel.add(orderSlip); 
			topRightPanel.add(reservation);

			aboutPanel.setVisible(false);
			homePanel.setVisible(false);
			registrationPanel.setVisible(false);
			orderSlipPanel.setVisible(true);
			reservationPanel.setVisible(false);
		}
		
		
	 if (e.getSource().equals(orderSlip)) {
			orderSlip.setForeground(Color.orange);
			reservation.setForeground(Color.white);

			aboutPanel.setVisible(false);
			homePanel.setVisible(false);
			registrationPanel.setVisible(false);
			orderSlipPanel.setVisible(true);
			reservationPanel.setVisible(false);
		
		} else if (e.getSource().equals(reservation)) {
			orderSlip.setForeground(Color.white);
			reservation.setForeground(Color.orange);	
		
			aboutPanel.setVisible(false);
			homePanel.setVisible(false);
			registrationPanel.setVisible(false);
			orderSlipPanel.setVisible(false);
			reservationPanel.setVisible(true);
		}
		
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
		
		if (e.getSource().equals(submit)) {
//			 JOptionPane.showMessageDialog(null, "<html><div style='text-align: center;'>This reservation is valid for the date and time selected only (1-time use ONLY). <br> It is suggested to reschedule if you can't come on time. </div></html>");
			int result = JOptionPane.showConfirmDialog(frame,"Do you want to reserve?", "Slot Reservation Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			
			if (result == JOptionPane.YES_OPTION){
				
			} else if (result == JOptionPane.NO_OPTION){
				
	        }
		}
	}
	
	public static void main (String[] args) {
		MainPage mainPage = new MainPage ();	
	}
}
