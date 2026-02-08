import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class DD extends JFrame {

    DragPanel dragPanel = new DragPanel();

    DD() {
        this.add(dragPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Drag Drop");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null); // center window
        this.setVisible(true);
    }
}

class DragPanel extends JPanel {

    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\java-swing\\src\\small (3).png");

    Point imageCorner;
    Point prevPt;

    DragPanel() {
        imageCorner = new Point(0, 0);

        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();

        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        imageIcon.paintIcon(this, g, imageCorner.x, imageCorner.y);
    }

    private class ClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint();
        }
    }

    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {

            Point currentPt = e.getPoint();

            imageCorner.translate(
                    currentPt.x - prevPt.x,
                    currentPt.y - prevPt.y
            );

            prevPt = currentPt;
            repaint();
        }
    }
}

public class DragAndDrop {
    public static void main(String[] args) {
        new DD();
    }
}
