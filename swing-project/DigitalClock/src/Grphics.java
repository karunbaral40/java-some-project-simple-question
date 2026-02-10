import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grphics extends JPanel implements ActionListener {

    Timer timer;
    int hrs=0;
    int min=0;
    int seconds = 0;

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
        g2d.drawString(hrs+":"+min+":"+ seconds, 200, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        seconds++;
        if(seconds==60){
            min++;
            if (min==60){
                hrs++;
            }

        }
        repaint();
    }
}
