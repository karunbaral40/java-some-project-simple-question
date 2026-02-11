import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import static java.awt.Color.*;

public class SnakeBody {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        frame.getContentPane().setBackground(new Color(30, 30, 30));
        frame.setLayout(new GridBagLayout());

        GamePanel gamePanel = new GamePanel();
        frame.add(gamePanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}

class GamePanel extends JPanel implements ActionListener {
    private final int SCREEN_WIDTH = 500;
    private final int SCREEN_HEIGHT = 500;
    private final int UNIT_SIZE = 20;
    private final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
    private final int DELAY = 150;
    private final int BORDER_WIDTH = 20;

    private final int[] x = new int[GAME_UNITS];
    private final int[] y = new int[GAME_UNITS];
    private int bodyParts = 4;
    private int foodX, foodY, score = 0;
    private char direction = 'R';
    private boolean running = false;
    private Timer timer;
    private Random random;
    private JButton restartButton;

    // --- Background Image Variable ---
    private Image backgroundImage;

    GamePanel() {
        random = new Random();
        // Load the image from your local path
        backgroundImage = new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\java-swing\\src\\Gemini_Generated_Image_in8lotin8lotin8l.png").getImage();

        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setFocusable(true);
        this.setLayout(null);
        this.addKeyListener(new MyKeyAdapter());

        restartButton = new JButton("Restart Game");
        restartButton.setBounds(SCREEN_WIDTH / 2 - 75, SCREEN_HEIGHT / 2 + 100, 150, 40);
        restartButton.setFocusable(false);
        restartButton.addActionListener(e -> {
            restartButton.setVisible(false);
            restartGame();
        });
        this.add(restartButton);
        restartButton.setVisible(false);

        startGame();
    }

    private void startGame() {
        for (int i = 0; i < bodyParts; i++) {
            x[i] = 100 - (i * UNIT_SIZE);
            y[i] = 100;
        }
        spawnFood();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // --- Draw the Background Image ---
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, SCREEN_WIDTH, SCREEN_HEIGHT, this);
        } else {
            // Fallback gradient if image fails to load
            Graphics2D g2d = (Graphics2D) g;
            GradientPaint gp = new GradientPaint(0, 0, new Color(10, 20, 40), 0, SCREEN_HEIGHT, black);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);
        }

        draw(g);
    }

    private void draw(Graphics g) {
        if (running) {
            // Draw Border
            g.setColor(new Color(144, 238, 144, 30)); // Added transparency (150) to see image through border
            g.fillRect(0, 0, SCREEN_WIDTH, BORDER_WIDTH);
            g.fillRect(0, SCREEN_HEIGHT - BORDER_WIDTH, SCREEN_WIDTH, BORDER_WIDTH);
            g.fillRect(0, 0, BORDER_WIDTH, SCREEN_HEIGHT);
            g.fillRect(SCREEN_WIDTH - BORDER_WIDTH, 0, BORDER_WIDTH, SCREEN_HEIGHT);

            // Draw Food
            g.setColor(red);
            g.fillOval(foodX, foodY, UNIT_SIZE, UNIT_SIZE);

            // Draw Snake
            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(new Color(0, 255, 255));
                    g.fillOval(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                    g.setColor(BLACK);
                    drawEyes(g, x[i], y[i]);
                } else {
                    g.setColor(new Color(0, 150, 100));
                    g.fillOval(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
            }

            g.setColor(white);
            g.setFont(new Font("Arial", Font.BOLD, 18));
            g.drawString("Score: " + score, BORDER_WIDTH + 10, BORDER_WIDTH + 20);
        } else {
            gameOver(g);
        }
    }

    // [The rest of your move, spawnFood, checkFood, checkCollision, gameOver, restartGame, and MyKeyAdapter methods remain the same]

    private void drawEyes(Graphics g, int headX, int headY) {
        int eyeSize = 4;
        switch (direction) {
            case 'R':
                g.fillOval(headX + 12, headY + 4, eyeSize, eyeSize);
                g.fillOval(headX + 12, headY + 12, eyeSize, eyeSize);
                break;
            case 'L':
                g.fillOval(headX + 4, headY + 4, eyeSize, eyeSize);
                g.fillOval(headX + 4, headY + 12, eyeSize, eyeSize);
                break;
            case 'U':
                g.fillOval(headX + 4, headY + 4, eyeSize, eyeSize);
                g.fillOval(headX + 12, headY + 4, eyeSize, eyeSize);
                break;
            case 'D':
                g.fillOval(headX + 4, headY + 12, eyeSize, eyeSize);
                g.fillOval(headX + 12, headY + 12, eyeSize, eyeSize);
                break;
        }
    }

    private void move() {
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        switch (direction) {
            case 'U': y[0] -= UNIT_SIZE; break;
            case 'D': y[0] += UNIT_SIZE; break;
            case 'L': x[0] -= UNIT_SIZE; break;
            case 'R': x[0] += UNIT_SIZE; break;
        }
    }

    private void spawnFood() {
        int playableWidth = SCREEN_WIDTH - (BORDER_WIDTH * 2);
        int playableHeight = SCREEN_HEIGHT - (BORDER_WIDTH * 2);
        foodX = (random.nextInt(playableWidth / UNIT_SIZE) * UNIT_SIZE) + UNIT_SIZE;
        foodY = (random.nextInt(playableHeight / UNIT_SIZE) * UNIT_SIZE) + UNIT_SIZE;
    }

    private void checkFood() {
        if (Math.abs(x[0] - foodX) < UNIT_SIZE && Math.abs(y[0] - foodY) < UNIT_SIZE) {
            bodyParts++;
            score++;
            spawnFood();
        }
    }

    private void checkCollision() {
        for (int i = bodyParts; i > 0; i--) {
            if ((x[0] == x[i]) && (y[0] == y[i])) running = false;
        }
        if (x[0] < BORDER_WIDTH || x[0] >= SCREEN_WIDTH - BORDER_WIDTH ||
                y[0] < BORDER_WIDTH || y[0] >= SCREEN_HEIGHT - BORDER_WIDTH) {
            running = false;
        }
        if (!running) timer.stop();
    }

    private void gameOver(Graphics g) {
        g.setColor(red);
        g.setFont(new Font("Arial", Font.BOLD, 50));
        FontMetrics m = getFontMetrics(g.getFont());
        g.drawString("GAME OVER", (SCREEN_WIDTH - m.stringWidth("GAME OVER")) / 2, SCREEN_HEIGHT / 2);
        g.setColor(white);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Press ENTER to Restart", (SCREEN_WIDTH - getFontMetrics(g.getFont()).stringWidth("Press ENTER to Restart")) / 2, SCREEN_HEIGHT / 2 + 50);
        restartButton.setVisible(true);
    }

    private void restartGame() {
        bodyParts = 4;
        score = 0;
        direction = 'R';
        restartButton.setVisible(false);
        if(timer != null) timer.stop();
        startGame();
        this.requestFocusInWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkFood();
            checkCollision();
        }
        repaint();
    }

    private class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT: if (direction != 'R') direction = 'L'; break;
                case KeyEvent.VK_RIGHT: if (direction != 'L') direction = 'R'; break;
                case KeyEvent.VK_UP: if (direction != 'D') direction = 'U'; break;
                case KeyEvent.VK_DOWN: if (direction != 'U') direction = 'D'; break;
                case KeyEvent.VK_ENTER: if (!running) restartGame(); break;
            }
        }
    }
}