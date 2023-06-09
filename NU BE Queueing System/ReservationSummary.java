import javax.swing.JFrame;
import javax.swing.JLabel;

public class ReservationSummary extends JFrame {
    private JLabel summaryLabel;

    public ReservationSummary(String summary) {
        setTitle("Reservation Summary");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        summaryLabel = new JLabel(summary);
        summaryLabel.setHorizontalAlignment(JLabel.CENTER);
        add(summaryLabel);
    }
}
