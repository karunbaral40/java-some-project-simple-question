
import javax.swing.*;
import java.awt.*;


public class FlowLayout1 {
    public static void main(String[] args) {

    //Flow layout :-
     //   places component in a row sized at their preferred size if the horizontal
     // space in the container is too small the flowlayout class uses the next available row
JFrame frame=new JFrame();
frame.setSize(500,500);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(new FlowLayout(FlowLayout.LEADING));



        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.setVisible(true);
    }
}
