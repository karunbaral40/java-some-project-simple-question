import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Second {
    public static void main(String[] args) {
        //JLable=a GUI display area for a string of text , an image ,or both
        ImageIcon image=new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\java-swing\\img.jpg");

        Border border=BorderFactory.createLineBorder(Color.GREEN,3);
        JLabel label=new JLabel();//👉create a label
        label.setText("Bro, do you even code?");//👉create a label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//👉set text LEFT ,RIGHT,CENTER OF IMAGE ICON
        label.setVerticalTextPosition(JLabel.TOP);//👉SET TEXT TOP, BOTTOM,CENTER OF IMAGE ICON
        label.setForeground(new Color(0x00fff0));//👉set the color of text
label.setFont(new Font("MV BOLI",Font.PLAIN,50));//👉set font of text
        label.setIconTextGap(-1);//👉set gap of text and image icon
        label.setBackground(new Color(0x000000));
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//👉THIS IS SET THE VERTICAL ALIGNMENT OF TEXT AND ICON WITHIN LABEL
label.setHorizontalAlignment(JLabel.CENTER);//👉THIS IS SET THE HORIZONTAL ALIGNMENT OF TEXT AND ICON WITHIN LABEL
//label.setBounds(100,100,350,350);//👉SE X,Y POSITION WITHIN FRAME AND  DIMENSION
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(700,700);
//        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();


    }
}
