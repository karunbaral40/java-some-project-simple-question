import javax.swing.*;
import java.awt.*;

public class Third {
    public static void main(String[] args) {
        //👉JPanel = A GUI component that function as a container to hold other components
        ImageIcon image= new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\java-swing\\PP Naruto Kawai.jpeg");
JLabel label=new JLabel();
label.setText("HI!");
label.setIcon(image);
label.setVerticalAlignment(JLabel.CENTER);
label.setHorizontalAlignment(JLabel.CENTER);
label.setBounds(0, 0,200,200);
        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,250,250);

        redPanel.setLayout(null);

        JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(null);
        JPanel greenPanel=new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,250,250,250);
        greenPanel.setLayout(null);
        JPanel yellowPanel=new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        yellowPanel.setBounds(250,250,250,250);
        yellowPanel.setLayout(null);




        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.add(redPanel);
        redPanel.add(label);
        frame.add(bluePanel);
                bluePanel.add(label);
        frame.add(greenPanel);
        greenPanel.add(label);
        frame.add(yellowPanel);
                yellowPanel.add(label);

    }
}
