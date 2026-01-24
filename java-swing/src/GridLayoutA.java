import javax.management.MBeanAttributeInfo;
import javax.swing.*;
import java.awt.*;

public class GridLayoutA {
    public static void main(String[] args) {


//Grid Layout:-
//             places components in a grid of cells.
//             Each components take all the available space with its cells,
//      and its cell in the same size
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,3,10,10));
        JButton button1=new JButton("1");
        frame.add(button1);
        JButton button2=new JButton("2");
        frame.add(button2);
        JButton button3=new JButton("3");
        frame.add(button3);
        JButton button4=new JButton("4");
        frame.add(button4);
        JButton button5=new JButton("5");
        frame.add(button5);
        JButton button6=new JButton("6");
        frame.add(button6);
        JButton button7=new JButton("7");
        frame.add(button7);
        JButton button8=new JButton("8");
        frame.add(button8);
        JButton button9=new JButton("9");
        frame.add(button9);
frame.setVisible(true);

    }

}


