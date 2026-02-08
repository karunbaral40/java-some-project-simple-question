import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class D extends JFrame {
    MyPanel panel;
    D(){
panel=new MyPanel();
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.add(panel);
this.pack();
this.setLocationRelativeTo(null);
this.setVisible(true);


    }
}
class MyPanel extends JPanel implements ActionListener {
    final int pannel_width = 500;
    final int panel_height = 500;
    Image enemy;
    Image Background;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.BLACK);
        enemy = new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\java-swing\\src\\enemy.png").getImage();
        Background = new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\java-swing\\src\\images.jpg").getImage();
        timer = new Timer(10, this);
        timer.start();


    }

    public void paint(Graphics g) {
        super.paint(g);//paint background
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(Background, 0, 0, null);
        g2d.drawImage(enemy, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= pannel_width - enemy.getWidth(null) || x < 0) {
            xVelocity = xVelocity * -1;
}
            x = x + xVelocity;



        if (y >= panel_height - enemy.getHeight(null) || y < 0) {
            yVelocity = yVelocity * -1;
        }
            y = y + yVelocity;
            repaint();


    }
}
public class TwoDAnimation {
    public static void main(String[] args) {
        new D();
    }
}
