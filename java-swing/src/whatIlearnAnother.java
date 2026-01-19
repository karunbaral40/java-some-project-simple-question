import javax.swing.*;
import java.awt.*;

public class whatIlearnAnother extends JFrame {
    JLabel label;
    JButton button;
ImageIcon icon=new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\java-swing\\img.jpg");
    public whatIlearnAnother() {
        label = new JLabel("Hello, Swing!");
    button=new JButton("fuck up!");

        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        this.setBackground(Color.DARK_GRAY);
button.setSize(50,100);
        this.setSize(460, 460);
        this.getControlPannel().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(button);
        this.setVisible(true);
        this.setVisible(true);
    }

}