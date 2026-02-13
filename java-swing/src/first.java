import javax.swing.*;
import java.awt.*; // 👉 Needed for Color

public class first {

  public static void main(String[] args) {
      //❌first way to use jframe❌
//        JFrame frame = new JFrame(); // 👉 create a frame
//        frame.setTitle("JFrame title goes here"); // 👉 set the title of jframe
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 👉 EXIT OUT OF APPLICATION
//        frame.setResizable(false); // 👉 prevent frame to resize
//        frame.setSize(420, 420); // 👉 sets x-dimension and y-dimension of frame
//        frame.setVisible(true); // 👉 make frame visible
//
//        ImageIcon image = new ImageIcon("C:\Users\Acer\OneDrive\Documents\Desktop\chatgptQustionForJava\java-swing\logo.png"); // 👉 import image in java
//        frame.setIconImage(image.getImage()); // 👉 change icon in frame
//        frame.getContentPane().setBackground(Color.GREEN); // 👉 set background color
//       frame.getContentPane().setBackground(new Color(150,155,255));//👉making custom color rgb
//        frame.getContentPane().setBackground(new Color(0X012345));//👉making custom color hexa

//      JFrame f=new JFrame();
//      f.setSize(300,300);
//      f.setVisible(true);

      new myframe();

  }

}