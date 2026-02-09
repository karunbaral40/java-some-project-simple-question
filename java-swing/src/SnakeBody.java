import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

class Body  extends JPanel implements ActionListener {
    int UnitSize=20;
int height=500;
int width=500;
    int[] x = new int[100];
    int[] y=new int[100];
    Timer timer;
    int body_Part=4;
    int foodX;
    int foodY;
    char direction ='R';
    boolean running=true;
int score=0;
    Random random;
    Body(){
       this.setPreferredSize(new Dimension(500,500));
       this.setBackground(Color.BLACK);
       random=new Random();
       swanFood();
        for (int i = 0; i < body_Part; i++) {
x[i]=100-(i*UnitSize);
y[i]=100;
        }
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.addKeyListener(new MyKeyAdapter());

                timer=new Timer(100,this);
        timer.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
      if(running){
          g.setColor(Color.RED);
          g.fillRect(foodX, foodY, UnitSize, UnitSize);

          g.setColor(Color.GREEN);
          for (int i = 0; i <body_Part ; i++) {

              g.fillRect(x[i],y[i],UnitSize,UnitSize);
          }
          g.setColor(Color.white);
          g.setFont(new Font("MV Boli",Font.BOLD,20));
          g.drawString("Score :-"+score,20,20);

      }else{
          g.setColor(Color.RED);
          g.setFont(new Font("Arial", Font.BOLD, 40));
          g.drawString("GAME OVER", width / 2 - 120, height / 2);

          g.setFont(new Font("Arial", Font.BOLD, 20));
          g.drawString("Score : " + score, width / 2 - 60, height / 2 + 40);

          g.setFont(new Font("Arial", Font.BOLD, 15));
          g.drawString("Press ENTER to restart", width / 2 - 90, height / 2 + 70);
      }
    }
    public void move() {
        for (int i = body_Part - 1; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
            switch (direction) {
                case 'R':
                    x[0] += UnitSize;
                    break;
                case 'L':
                    x[0] -= UnitSize;
                    break;
                case 'U':
                    y[0] -= UnitSize;
                    break;
                case 'D':
                    y[0] += UnitSize;
                    break;
            }
        }
        public void swanFood () {
            foodX = random.nextInt(width / UnitSize) * UnitSize;
            foodY = random.nextInt(height / UnitSize) * UnitSize;
        }
        public void checkFood () {
            if (x[0] == foodX && y[0] == foodY) {
                body_Part++;
                score ++ ;
                swanFood();
            }
        }
        public void checkCollision () {
            if (x[0] < 0) {
                running = false;
            }
            if (x[0] > width) {
                running = false;
            }
            if (y[0] < 0) {
                running = false;
            }
            if (y[0] > height) {
                running = false;
            }
            if (!running) {
              timer.stop();
            }


        }
        @Override
        public void actionPerformed (ActionEvent e){
            if (running) {
                move();
                checkFood();
                checkCollision();
            }
            repaint();
        }
        public void restartGame(){
        body_Part=4;
        score=0;
        direction='R';

            for (int i = 0; i < body_Part; i++) {
                x[i]=100-(i*UnitSize);
                y[i]=100;
            }
            swanFood();
            running=true;
            timer.start();
            repaint();

    }
    class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e){
            switch (e.getKeyCode()){
                case KeyEvent.VK_LEFT:
                    if(direction != 'R') direction = 'L';
                    break;
                case KeyEvent.VK_RIGHT:
                    if(direction != 'L') direction = 'R';
                    break;
                case KeyEvent.VK_UP:
                    if(direction != 'D') direction = 'U';
                    break;
                case KeyEvent.VK_DOWN:
                    if(direction != 'U') direction = 'D';
                    break;
                case KeyEvent.VK_ENTER:
                    if(!running){
                        restartGame();
                    }
                    break;
            }
        }
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
