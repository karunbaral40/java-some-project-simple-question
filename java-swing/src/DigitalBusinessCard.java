import javax.swing.*;
import java.awt.*;

public class DigitalBusinessCard {
    public static void main(String[] args) {
        ImageIcon image=new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\java-swing\\img.jpg");
        JLabel label=new JLabel();
        label.setText("my profile");
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setFont(new Font("MV BOLI" ,Font.BOLD,20));
        label.setForeground(Color.DARK_GRAY);



        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.add(label);
        frame.setVisible(true);
//        frame.pack();

    }
}
