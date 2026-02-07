import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class asdf extends myframe implements KeyListener {
    JLabel label;

    asdf(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);
        label=new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        this.add(label);
   this.setVisible(true);


    }

    @Override
    public void keyTyped(KeyEvent e) {
//switch (e.getKeyChar()){
//    case 'a':
//        label.setLocation(label.getX()-1,label.getY());
//        break;
//
//    case 'w':
//        label.setLocation(label.getX(),label.getY()-1);
//        break;
//
//    case 's':
//        label.setLocation(label.getX(),label.getY()+1);
//        break;
//
//    case 'd':
//        label.setLocation(label.getX()+1,label.getY());
//        break;
//
//}
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case 37:
                label.setLocation(label.getX()-5,label.getY());
                break;

            case 38:
                label.setLocation(label.getX(),label.getY()-5);
                break;

            case 39:
                label.setLocation(label.getX()+5,label.getY());
                break;

            case 40:
                label.setLocation(label.getX(),label.getY()+5);
                break;

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

// System.out.println("yo ho ho ho "+e.getKeyChar());
// System.out.println("yo ho ho ho "+e.getKeyCode());


    }
}
public class KeyListtiner {
    public static void main(String[] args) {
new asdf();
    }
}
