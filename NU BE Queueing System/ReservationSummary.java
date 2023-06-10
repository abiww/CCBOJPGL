import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.*;

public class ReservationSummaryFrame extends JFrame{
    private JLabel purposeLabel, dateLabel, timeLabel;
    private JLabel purpose, date, time;
    private JLabel headings, noteLabel;
    private JLabel logoLabel;
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
		
		headings = new JLabel("OFFICIAL SLOT RESERVATION");
		headings.setHorizontalAlignment(JLabel.CENTER);
		headings.setFont(new Font("Tahoma", Font.BOLD, 18));
		headings.setForeground(new Color(0x293476));
		headings.setBounds(10, 15, 280, 20);
		
		String note = ("This reservation is valid for the date and time selected only (1-time use ONLY). It is suggested to reschedule if you can't come.");
		noteLabel = new JLabel("<html><div style='text-align: summaryPanel;'>" + note + "</div></html>");
		noteLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		noteLabel.setBounds(15, 40, 265, 35);
				
		purposeLabel = new JLabel("PURPOSE:");
		purposeLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		purposeLabel.setForeground(Color.BLACK);
		purposeLabel.setFocusable(false);
		purposeLabel.setBounds(15, 90, 100, 20);
		
		purpose = new JLabel(purpose_);
		purpose.setFont(new Font("Tahoma", Font.BOLD, 15));
		purpose.setForeground(Color.BLACK);
		purpose.setFocusable(false);
		purpose.setBounds(100, 90, 100, 20);
		
		dateLabel = new JLabel("DATE:");
		dateLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		dateLabel.setForeground(Color.BLACK);
		dateLabel.setBounds(15, 120, 200, 20);
		
		date = new JLabel(date_);
		date.setFont(new Font("Tahoma", Font.BOLD, 15));
		date.setForeground(Color.BLACK);
		date.setBounds(70, 120, 200, 20);
		
		timeLabel = new JLabel("TIME:");
		timeLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		timeLabel.setForeground(Color.BLACK);
		timeLabel.setBounds(15, 150, 200, 20);
		
		time = new JLabel(time_);
		time.setFont(new Font("Tahoma", Font.BOLD, 15));
		time.setForeground(Color.BLACK);
		time.setBounds(70, 150, 200, 20);

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
                    saveComponentAsImage(summaryPanel, "image.png", "PNG");
                    JOptionPane.showMessageDialog(null, "Image saved successfully!");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error saving image: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
		summaryPanel.add(headings);
		summaryPanel.add(noteLabel);
        summaryPanel.add(purposeLabel);
        summaryPanel.add(dateLabel);
        summaryPanel.add(timeLabel);
        summaryPanel.add(purpose);
        summaryPanel.add(date);
        summaryPanel.add(time);
        
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
