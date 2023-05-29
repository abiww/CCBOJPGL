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

public class FeaturesFrame extends MainFrame implements ActionListener{
	JFrame featureFrame;
	JLabel featureLogoLabel;
	ImageIcon featureLogo;
	Image featureImage, featureResizedImage;
	JButton reservation, orderSlip;
	JPanel reservationPanel, orderSlipPanel;
	JLayeredPane featureLayeredPane;
	JPanel featureTopPanel, featureTopLeftPanel, featureTopRightPanel;
	
	FeaturesFrame(String title) {
		super(title);
		featureFrame = new JFrame();
		
		featureTopPanel = new JPanel();
		featureTopPanel.setBackground(new Color(0x293478));
		featureTopPanel.setBounds(0, 0, 1185, 80);
		featureTopPanel.setLayout(new BorderLayout());
		
		featureTopLeftPanel = new JPanel();
		featureTopLeftPanel.setBackground(new Color(0x293478));
		featureTopLeftPanel.setPreferredSize(new Dimension(450, 80));
		featureTopLeftPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 5));
		
		featureTopRightPanel = new JPanel();
		featureTopRightPanel.setBackground(new Color(0x293478));
		featureTopRightPanel.setPreferredSize(new Dimension(1000, 80));
		featureTopRightPanel.setLayout(new FlowLayout(FlowLayout.TRAILING, 5, 0));
		
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
		
		featureLogo = new ImageIcon("C:\\Users\\National University\\Desktop\\ALLADO_INF224\\NU BE Pics\\BulldogLogo.png");
		featureImage = featureLogo.getImage() ;
		featureResizedImage = featureImage.getScaledInstance(100, 70, java.awt.Image.SCALE_SMOOTH);
		featureLogo = new ImageIcon(featureResizedImage);
		 
		featureLogoLabel = new JLabel("<html> <font size=\"6\"> NU BULLDOG EXCHANGE </font> <br> <font size=\"5\"> QUEUEING MANAGEMENT </font> <html>");
		featureLogoLabel.setFont(new java.awt.Font("Tahoma", Font.BOLD, 20));
		featureLogoLabel.setIconTextGap(10);
		featureLogoLabel.setForeground(Color.WHITE);
		featureLogoLabel.setIcon(featureLogo);

		featureTopLeftPanel.add(featureLogoLabel);
		
		featureTopRightPanel.add(orderSlip);
		featureTopRightPanel.add(reservation);
		
		featureTopPanel.add(featureTopLeftPanel, BorderLayout.WEST);
		featureTopPanel.add(featureTopRightPanel, BorderLayout.EAST);
		
		featureLayeredPane = new JLayeredPane();
		featureLayeredPane.setBounds(0, 80, 1185,650);
		
		reservationPanel = new JPanel();
		reservationPanel.setBackground(Color.GREEN);
		reservationPanel.setBounds(0, 0, 1185, 630);
		
		orderSlipPanel = new JPanel();
		orderSlipPanel.setBackground(Color.PINK);
		orderSlipPanel.setBounds(0, 0, 1185, 630);
		
		featureLayeredPane.add(orderSlipPanel, Integer.valueOf(1));
		featureLayeredPane.add(reservationPanel, Integer.valueOf(0));
		
		featureFrame.add(featureTopPanel);
		featureFrame.add(featureLayeredPane);
		
		featureFrame.setSize(new Dimension(1200, 700));
		featureFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		featureFrame.setLocationRelativeTo(null);
		featureFrame.setLayout(null);
		featureFrame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource().equals(orderSlip)) {
			orderSlip.setForeground(Color.orange);
			reservation.setForeground(Color.white);

			orderSlipPanel.setVisible(true);
			reservationPanel.setVisible(false);
		
		} else if (e.getSource().equals(reservation)) {
			orderSlip.setForeground(Color.white);
			reservation.setForeground(Color.orange);	
		
			orderSlipPanel.setVisible(false);
			reservationPanel.setVisible(true);
		}
	}
}
