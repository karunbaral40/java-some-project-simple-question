import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/* ===============================
   Main Class (Game Launcher)
   =============================== */
public class SnakeBody {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Snake Game");
        GamePanel gamePanel = new GamePanel();

        frame.add(gamePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


/* ===============================
   Game Panel (All Game Logic)
   =============================== */
class GamePanel extends JPanel implements ActionListener {

    // ===== Constants =====
    private final int SCREEN_WIDTH = 500;
    private final int SCREEN_HEIGHT = 500;
    private final int UNIT_SIZE = 20;
    private final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
    private final int DELAY = 80;

    // ===== Snake Data =====
    private final int[] x = new int[GAME_UNITS];
    private final int[] y = new int[GAME_UNITS];
    private int bodyParts = 4;

    // ===== Game Data =====
    private int foodX;
    private int foodY;
    private int score = 0;
    private char direction = 'R';
    private boolean running = false;

    private Timer timer;
    private Random random;

    /* ===== Constructor ===== */
    GamePanel() {

        random = new Random();

        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());

        startGame();
    }

    /* ===== Start Game ===== */
    private void startGame() {

        // Initial Snake Position
        for (int i = 0; i < bodyParts; i++) {
            x[i] = 100 - (i * UNIT_SIZE);
            y[i] = 100;
        }

        spawnFood();

        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    /* ===== Paint ===== */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    private void draw(Graphics g) {

        if (running) {

            // Draw Food
            g.setColor(Color.red);
            g.fillRect(foodX, foodY, UNIT_SIZE, UNIT_SIZE);

            // Draw Snake
            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.green); // head
                } else {
                    g.setColor(new Color(45, 180, 0));
                }
                g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
            }

            // Draw Score
            g.setColor(Color.white);
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString("Score: " + score, 20, 30);
        }
        else {
            gameOver(g);
        }
    }

    /* ===== Move Snake ===== */
    private void move() {

        // Move body
        for (int i = bodyParts - 1; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        // Move head
        switch (direction) {
            case 'R': x[0] += UNIT_SIZE; break;
            case 'L': x[0] -= UNIT_SIZE; break;
            case 'U': y[0] -= UNIT_SIZE; break;
            case 'D': y[0] += UNIT_SIZE; break;
        }
    }

    /* ===== Spawn Food ===== */
    private void spawnFood() {
        foodX = random.nextInt(SCREEN_WIDTH / UNIT_SIZE) * UNIT_SIZE;
        foodY = random.nextInt(SCREEN_HEIGHT / UNIT_SIZE) * UNIT_SIZE;
    }

    /* ===== Check Food ===== */
    private void checkFood() {
        if (x[0] == foodX && y[0] == foodY) {
            bodyParts++;
            score += bodyParts * 2;
            spawnFood();
        }
    }

    /* ===== Check Collision ===== */
    private void checkCollision() {

        // Self collision
        for (int i = 1; i < bodyParts; i++) {
            if (x[0] == x[i] && y[0] == y[i]) {
                running = false;
            }
        }

        // Wall collision
        if (x[0] < 0 || x[0] >= SCREEN_WIDTH ||
                y[0] < 0 || y[0] >= SCREEN_HEIGHT) {
            running = false;
        }

        if (!running) {
            timer.stop();
        }
    }

    /* ===== Game Over Screen ===== */
    private void gameOver(Graphics g) {

        g.setColor(Color.red);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("GAME OVER", SCREEN_WIDTH / 2 - 140, SCREEN_HEIGHT / 2);

        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Final Score: " + score,
                SCREEN_WIDTH / 2 - 80,
                SCREEN_HEIGHT / 2 + 40);

        g.drawString("Press ENTER to Restart",
                SCREEN_WIDTH / 2 - 110,
                SCREEN_HEIGHT / 2 + 80);
    }

    /* ===== Restart ===== */
    private void restartGame() {

        bodyParts = 4;
        score = 0;
        direction = 'R';

        startGame();
    }

    /* ===== Game Loop ===== */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (running) {
            move();
            checkFood();
            checkCollision();
        }

        repaint();
    }

    /* ===== Key Listener ===== */
    private class MyKeyAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            switch (e.getKeyCode()) {

                case KeyEvent.VK_LEFT:
                    if (direction != 'R') direction = 'L';
                    break;

                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') direction = 'R';
                    break;

                case KeyEvent.VK_UP:
                    if (direction != 'D') direction = 'U';
                    break;

                case KeyEvent.VK_DOWN:
                    if (direction != 'U') direction = 'D';
                    break;

                case KeyEvent.VK_ENTER:
                    if (!running) {
                        restartGame();
                    }
                    break;
            }
        }
    }
}
