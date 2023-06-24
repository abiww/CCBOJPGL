package integration;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class RoundedButton extends JButton{

        public RoundedButton(String text) {
            setText(text);
            setHorizontalAlignment(SwingConstants.CENTER);
    		setFont(new Font(null, Font.BOLD, 15));
    		setForeground(Color.WHITE);
            setOpaque(false);
            setBorderPainted(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D graphics2D = (Graphics2D) g.create();
            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int width = getWidth();
            int height = getHeight();

            // Paint the button background
            if (getModel().isPressed()) {
                graphics2D.setColor(getBackground().darker());
            } else {
                graphics2D.setColor(getBackground());
            }

            graphics2D.fill(new RoundRectangle2D.Double(0, 0, width - 1, height - 1, 10, 10));

            // Paint the button text
            graphics2D.setColor(getForeground());
            FontMetrics fontMetrics = graphics2D.getFontMetrics();
            String text = getText();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int x = (width - textWidth) / 2;
            int y = (height + textHeight) / 2 - fontMetrics.getDescent();
            graphics2D.drawString(text, x, y);

            graphics2D.dispose();
        }
    }
