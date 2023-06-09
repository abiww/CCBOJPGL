
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ServiceFrame extends JFrame implements ActionListener{
	private JPanel topPanel, topLeftPanel, topRightPanel;
	private ImageIcon logo;
	private Image image, resizedImage;
	private JLabel logoLabel;
	private JButton orderSlip, reservation;
        private JLayeredPane layeredPane;
        
        private OrderSlipPanel orderslipPanel;
        private ReservationPanel reservationPanel;
	

	ServiceFrame(String title) {
		setTitle(title);
		
		topPanel = new JPanel();
		topPanel.setBackground(new Color(0x293478));
		topPanel.setBounds(0, 0, 1185, 80);
		topPanel.setLayout(new BorderLayout());
		
		topLeftPanel = new JPanel();
		topLeftPanel.setBackground(new Color(0x293478));
		topLeftPanel.setPreferredSize(new Dimension(450, 80));
		topLeftPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 5));
		
		logo = new ImageIcon("C:\\Users\\abiga\\OneDrive\\Desktop\\Project(NU BE Queueing Management System)\\logo.png");
		image = logo.getImage() ;
		resizedImage = image.getScaledInstance(100, 70, java.awt.Image.SCALE_SMOOTH);
		logo = new ImageIcon(resizedImage);
		 
		logoLabel = new JLabel("<html> <font size=\"6\"> NU BULLDOG EXCHANGE </font> <br> <font size=\"5\"> QUEUEING MANAGEMENT </font> <html>");
		logoLabel.setFont(new java.awt.Font("Tahoma", Font.BOLD, 20));
		logoLabel.setIconTextGap(10);
		logoLabel.setForeground(Color.WHITE);
		logoLabel.setIcon(logo);
		
		topLeftPanel.add(logoLabel);
		
		topRightPanel = new JPanel();
		topRightPanel.setBackground(new Color(0x293478));
		topRightPanel.setPreferredSize(new Dimension(1000, 80));
		topRightPanel.setLayout(new FlowLayout(FlowLayout.TRAILING, 10, 0));
	
//		service = new JButton("SERVICE");
//		service.setHorizontalAlignment(SwingConstants.CENTER);
//		service.setFont(new Font("Tahoma", Font.BOLD, 18));
//		service.setBackground(new Color(0x293478));
//		service.setForeground(Color.WHITE);
//		service.setPreferredSize(new Dimension(120,80));
//		service.setBorderPainted(false);
//		service.setFocusable(false);
//		service.addActionListener(this);
		
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
		
//		topRightPanel.add(service);
		topRightPanel.add(orderSlip);
		topRightPanel.add(reservation);
		
		topPanel.add(topLeftPanel, BorderLayout.WEST);
		topPanel.add(topRightPanel, BorderLayout.EAST);
                
                layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 80, 1185, 585);
                
                orderslipPanel = new OrderSlipPanel(0x29FF78);
                
                reservationPanel = new ReservationPanel(0xFFFF78);
                
                layeredPane.add(orderslipPanel.getPanel(), Integer.valueOf(1));
		layeredPane.add(reservationPanel.getPanel(), Integer.valueOf(0));
		
		add(topPanel);
                add(layeredPane);
		
		setSize(new Dimension(1200, 700));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource().equals(orderSlip)) {
//			service.setForeground(Color.white);
			orderSlip.setForeground(Color.orange);
			reservation.setForeground(Color.white);
                        
                        orderslipPanel.setVisible(true);
                        reservationPanel.setVisible(false);
		
		} else if (e.getSource().equals(reservation)) {
//			service.setForeground(Color.white);
			orderSlip.setForeground(Color.white);
			reservation.setForeground(Color.orange);
                        
                        orderslipPanel.setVisible(false);
                        reservationPanel.setVisible(true);
		
		}
		
	}

}
