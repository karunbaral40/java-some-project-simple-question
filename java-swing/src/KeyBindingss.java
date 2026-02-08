import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class game{
    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    game(){
frame=new JFrame("key binding");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(420,420);
frame.setLayout(null);
label=new JLabel();
label.setBackground(Color.RED);
label.setBounds(100,100,100,100);
label.setOpaque(true);
upAction=new UpAction();
downAction=new DownAction();
leftAction=new LeftAction();
 rightAction=new RightAction();
label.getInputMap().put(KeyStroke.getKeyStroke("UP"),"upAction");
label.getActionMap().put("upAction",upAction);
label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"downAction");
label.getActionMap().put("downAction",downAction);
label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
label.getActionMap().put("leftAction",leftAction);
label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
label.getActionMap().put("rightAction",rightAction);

frame.add(label);
frame.setVisible(true);
    }
    class UpAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
label.setLocation(label.getX(),label.getY()-5);
        }
    }
    class DownAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()+5);
        }
    }

    class LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-5,label.getY());
        }
    }

    class RightAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+5,label.getY());
        }
    }

}
public class KeyBindingss {
    public static void main(String[] args) {
        game game = new game();
    }

}
