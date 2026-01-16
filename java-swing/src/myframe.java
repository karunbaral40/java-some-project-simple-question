import javax.swing.*;
import java.awt.*;
//❌second way to use jFrame❌
public class myframe extends JFrame {
    myframe(){
    this.setTitle("JFrame title goes here"); // 👉 set the title of JFrame
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 👉 EXIT OUT OF APPLICATION
    this.setResizable(false); // 👉 prevent this to resize
    this.setSize(420, 420); // 👉 sets x-dimension and y-dimension of this
    this.setVisible(true); // 👉 make this visible

    ImageIcon image = new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\java-swing\\logo.png"); // 👉 import image in java
    this.setIconImage(image.getImage()); // 👉 change icon in this
//    this.getContentPane().setBackground(Color.GREEN); // 👉 set background color
//   this.getContentPane().setBackground(new Color(150,155,255));//👉making custom color rgb
    this.getContentPane().setBackground(new Color(0X012345));//👉making custom color hexa

    }
}
