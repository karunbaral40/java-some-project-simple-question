import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Grid Layout");
        frame.setLayout(new GridLayout(3,3));
        for (int i = 1; i <=9 ; i++) {
            frame.add(new JButton(String.valueOf(i)));

        }
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
