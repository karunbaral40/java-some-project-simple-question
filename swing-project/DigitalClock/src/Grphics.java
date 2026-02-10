import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class Grphics extends JPanel implements ActionListener {

    Timer timer;
    LocalTime now=LocalTime.now();

    int hours=now.getHour();
    int minute=now.getMinute();
    int seconds = now.getSecond();

    Grphics() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.BLACK);

        timer = new Timer(1000, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("MV Boli", Font.BOLD, 25));
        String time=String.format("%02d:%02d:%02d",hours,minute,seconds);
        g2d.drawString(time,200,200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        now=LocalTime.now();

        hours=now.getHour();
        minute=now.getMinute();
        seconds = now.getSecond();


        repaint();
    }
}
