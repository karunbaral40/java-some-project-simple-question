import javax.swing.*;
import java.awt.*;

class Body  extends JLabel {
    Body(){
       this.setPreferredSize(new Dimension(500,500));
    }
}
public class SnakeBody {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Body label=new Body();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setVisible(true);

    }
}
