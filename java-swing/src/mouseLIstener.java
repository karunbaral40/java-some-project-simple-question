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
    smile=new ImageIcon("https://www.flaticon.com/free-icon/smile_3404134");
    nervious=new ImageIcon("https://cdn-icons-png.flaticon.com/128/10851/10851491.png");
    pain=new ImageIcon("https://www.flaticon.com/free-icon/pain_11005394");
   dizzy=new ImageIcon("https://cdn-icons-png.flaticon.com/128/10851/10851591.png");
    this.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
public class mouseLIstener {
    public static void main(String[] args) {

    }
}
