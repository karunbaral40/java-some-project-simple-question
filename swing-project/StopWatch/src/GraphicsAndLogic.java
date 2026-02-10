import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsAndLogic extends JPanel implements ActionListener {
    Timer timer;
    int second;
    int minute;
    int hours;
    JButton startButton;
    JButton restartButton;
    JButton stopButton;
    GraphicsAndLogic(){
timer=new Timer(1000 ,this);

startButton=new JButton("start");
restartButton=new JButton("Restart");
stopButton=new JButton("stop");
startButton.setBackground(Color.WHITE);
        startButton.setFocusable(false);
        restartButton.setFocusable(false);
        stopButton.setFocusable(false);
this.add(startButton);
this.add(restartButton);
this.add(stopButton);
this.setPreferredSize(new Dimension(500,500));
this.setBackground(Color.DARK_GRAY);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        startButton.setVerticalAlignment(220);
        startButton.addActionListener(this);
        restartButton.addActionListener(this);
        stopButton.addActionListener(this);


    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d=(Graphics2D)g;
        g2d.setColor(Color.green);
        g2d.setFont(new Font("Arial",Font.BOLD,30));
        String time=String.format("%02d:%02d:%02d",hours,minute,second);
        g2d.drawString(time,200,200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource()==timer) {


            second++;
        if (second == 60) {
            second = 0;
            minute++;
        }
        if (minute == 60) {
            minute = 0;
            hours++;
        }
        if (hours == 13) {
            hours = 1;
        }
        repaint();
    }
if(e.getSource()==startButton){
    timer.start();
}
if(e.getSource()==restartButton){
    timer.stop();
    minute=second=hours=0;
    timer.start();
    repaint();
}
if (e.getSource()==stopButton){
    timer.stop();
    repaint();
}
}

}
