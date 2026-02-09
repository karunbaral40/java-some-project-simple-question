import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SimpleGame {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        GamePanel panel = new GamePanel();
        panel.setPreferredSize(new Dimension(500, 500));
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class GamePanel extends JPanel implements ActionListener {

    int x = 100;
    int y = 100;
    int xVelocity = 5;
    int yVelocity = 5;
    int ballSize = 30;
    Image Background;
    Timer timer;
    Random random = new Random();
    GamePanel() {
       Background=new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\swing-project\\src\\game-background.jpg").getImage();

        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.drawImage(Background, 0, 0, null);
        g.fillOval(x, y, ballSize, ballSize);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x += xVelocity;
        y += yVelocity;



        // LEFT wall
        if (x <= 0) {
            x = 0;  // Fix position
            xVelocity = (random.nextInt(5) + 1);  // Move right
        }

        // RIGHT wall
        if (x >= getWidth() - ballSize) {
            x = getWidth() - ballSize;  // Fix position
            xVelocity = (random.nextInt(5) + 1) * -1; // Move left
        }

        // TOP wall
        if (y <= 0) {
            y = 0;  // Fix position
            yVelocity = (random.nextInt(5) + 1);  // Move down
        }

        // BOTTOM wall
        if (y >= getHeight() - ballSize) {
            y = getHeight() - ballSize;  // Fix position
            yVelocity = (random.nextInt(5) + 1) * -1; // Move up
        }
        repaint();
    }
}
