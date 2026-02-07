import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class mouse extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon smile;
    ImageIcon nervious;
    ImageIcon pain;
    ImageIcon dizzy;
mouse(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLayout(new FlowLayout());
    label=new JLabel();
    label.setPreferredSize(new Dimension(100, 100));
    label.setBackground(Color.red);
    label.setOpaque(true);
    label.addMouseListener(this);
    smile=new ImageIcon("https://www.flaticon.com/free-icon/smile_3404134");
    nervious=new ImageIcon("https://cdn-icons-png.flaticon.com/128/10851/10851491.png");
    pain=new ImageIcon("https://www.flaticon.com/free-icon/pain_11005394");
   dizzy=new ImageIcon("https://cdn-icons-png.flaticon.com/128/10851/10851591.png");
   this.add(label);
    this.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
//        System.out.println("you clicked the mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        System.out.println("you pressed the mouse");
        label.setBackground(Color.yellow);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        System.out.println("you relesed the mouse");
        label.setBackground(Color.green);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        System.out.println("you entered the mouse");
        label.setBackground(Color.blue);
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        System.out.println("you exited the mouse");
        label.setBackground(Color.red);
    }
}
public class mouseLIstener {
    public static void main(String[] args) {
new mouse();
    }
}
