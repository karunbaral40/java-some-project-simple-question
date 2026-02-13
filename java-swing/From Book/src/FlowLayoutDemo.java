import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {

        JFrame frame=new JFrame("flow layout Demo");
        frame.setLayout(new FlowLayout());
        frame.add(new JButton("one"));
        frame.add(new JButton("two"));
        frame.add(new JButton("three"));
        frame.add(new JButton("four"));
        frame.add(new JButton("five"));
        frame.add(new JButton("six"));
        frame.add(new JButton("seven"));
        frame.add(new JButton("eight"));
        frame.add(new JButton("nine"));
        frame.add(new JButton("ten"));
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
