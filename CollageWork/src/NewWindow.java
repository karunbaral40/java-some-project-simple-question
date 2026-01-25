import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LunchPage implements ActionListener {
    JFrame frame=new JFrame();
    JButton myButton=new JButton("new button");
LunchPage(){
    myButton.setBounds(100,160,200,40);
    myButton.setFocusable(false);
    myButton.addActionListener(this);
    frame.add(myButton);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(460,460);
frame.setLayout(null);
frame.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource()==myButton){
        frame.dispose();
        window myWindow=new window();
    }

    }
}
class window{
    JFrame frame=new JFrame();
    JLabel label=new JLabel("hello!!");
window(){
    label.setBounds(0,0,100,50);
    label.setFont(new Font(null,Font .PLAIN,25));
    frame.add(label);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(460,460);
    frame.setLayout(null);
    frame.setVisible(true);

}
}
public class NewWindow {
    public static void main(String[] args) {
LunchPage lunchPage=new LunchPage();

    }
}
