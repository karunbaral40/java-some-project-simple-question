import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsAndLogic extends JPanel implements ActionListener {

    private Timer timer;
    private int hours;
    private int minute;
    private int second;

    private JButton startButton;
    private JButton restartButton;

    public GraphicsAndLogic() {

        // Panel setup
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(new BorderLayout());

        // Button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.DARK_GRAY);
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        // Timer
        timer = new Timer(1000, this);

        // Buttons
        startButton = new JButton("Start");
        restartButton = new JButton("Restart");

        startButton.setFocusable(false);
        restartButton.setFocusable(false);
        startButton.setBackground(Color.WHITE);

        // Add buttons to button panel
        buttonPanel.add(startButton);
        buttonPanel.add(restartButton);
        this.add(buttonPanel, BorderLayout.SOUTH);

        // Add action listeners
        startButton.addActionListener(this);
        restartButton.addActionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GREEN);
        g2d.setFont(new Font("Arial", Font.BOLD, 30));

        // Format time as HH:MM:SS
        String time = String.format("%02d:%02d:%02d", hours, minute, second);

        // Center the text
        FontMetrics fm = g2d.getFontMetrics();
        int x = (getWidth() - fm.stringWidth(time)) / 2;
        int y = getHeight() / 2;
        g2d.drawString(time, x, y);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == timer) {
            // Increment time
            second++;
            if (second == 60) {
                second = 0;
                minute++;
            }
            if (minute == 60) {
                minute = 0;
                hours++;
            }
            if (hours == 24) {
                hours = 0;
            }
            repaint();
        }

        if (e.getSource() == startButton) {
//
            if (timer.isRunning()) {
                timer.stop();
                startButton.setText("Start");
            } else {
                timer.start();
                startButton.setText("Pause");
            }
        }



        if (e.getSource() == restartButton) {
            // Reset timer
            timer.stop();
            hours = minute = second = 0;
            repaint();
            timer.start();
            startButton.setText("Pause");

        }
    }

    // Main method to run the clock
    public static void main(String[] args) {
        JFrame frame = new JFrame("Timer Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new GraphicsAndLogic());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
