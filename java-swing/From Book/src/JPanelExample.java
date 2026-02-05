import javax.swing.*;
import java.awt.*;

public class JPanelExample {
    static JFrame frame;
    static JButton button, button1, button2;
    static JLabel label;

    public static void main(String[] args) {

        frame = new JFrame("Panel");

        label = new JLabel("Panel Label");
        button = new JButton("Button 1");
        button1 = new JButton("Button 2");
        button2 = new JButton("Button 3");

        JPanel panel = new JPanel();
        panel.setBackground(Color.RED);

        panel.add(label);
        panel.add(button);
        panel.add(button1);
        panel.add(button2);

        frame.add(panel);

        frame.setSize(460, 460);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
