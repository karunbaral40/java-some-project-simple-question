import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class Body  extends JLabel implements ActionListener {
    int UnitSize=20;
int height=500;
int width=500;
    int[] x = new int[100];
    int[] y=new int[100];
    Timer timer;
    int body_Part=4;
    int foodX;
    int foodY;

    Random random;
    Body(){
       this.setPreferredSize(new Dimension(500,500));
       this.setBackground(Color.BLACK);
       random=new Random();
        for (int i = 0; i < body_Part; i++) {
x[i]=100-(i*UnitSize);
y[i]=100;
        }
        timer=new Timer(40,this);
        timer.start();
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.RED);
        g.fillRect(foodX, foodY, UnitSize, UnitSize);

        g.setColor(Color.GREEN);
        for (int i = 0; i <x.length ; i++) {

            g.fillRect(x[i],y[i],UnitSize,UnitSize);
        }
    }
    public void move(){
        for (int i = body_Part-1; i >0 ; i--) {
            x[i]=x[i-1];
            y[i]=y[i-1];
        }
        x[0]+=UnitSize;
    }
    public void food(){
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
public class SnakeBody {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Body label=new Body();
        frame.add(label);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
