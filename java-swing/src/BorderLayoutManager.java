import javax.swing.*;
import java.awt.*;

public class BorderLayoutManager {
    public static void main(String[] args) {
        //border layout :- a border layout places components in five area . NORTH ,SOUTH , EAST , WAST ,CENTER
        //                all extra spaces is placed in the center area.
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
       frame.setSize(460,460);
       frame.setLayout(new BorderLayout(0,10));
        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        JPanel panel4=new JPanel();
        JPanel panel5=new JPanel();
panel1.setBackground(Color.YELLOW);
panel2.setBackground(Color.RED);
panel3.setBackground(Color.CYAN);
panel4.setBackground(Color.blue);
panel5.setBackground(Color.GREEN);
panel1.setPreferredSize(new Dimension(100,50));
panel2.setPreferredSize(new Dimension(100,50));
panel3.setPreferredSize(new Dimension(50,100));
panel4.setPreferredSize(new Dimension(50,100));
panel5.setPreferredSize(new Dimension(100,100));

//--------------------SUB PANEL--------

        JPanel panel6=new JPanel();
        JPanel panel7=new JPanel();
        JPanel panel8=new JPanel();
        JPanel panel9=new JPanel();

        panel6.setBackground(Color.BLACK);
        panel7.setBackground(Color.gray);
        panel8.setBackground(Color.orange);
        panel9.setBackground(Color.magenta);

        panel5.setLayout(new BorderLayout());

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));

        panel5.add(panel6,BorderLayout.EAST);
        panel5.add(panel7,BorderLayout.WEST);
        panel5.add(panel8,BorderLayout.NORTH);
        panel5.add(panel9,BorderLayout.SOUTH);

        //----------------SUB PANEL ---------------

frame.add(panel1, BorderLayout.NORTH);
frame.add(panel2,BorderLayout.SOUTH);
frame.add(panel3,BorderLayout.EAST);
frame.add(panel4,BorderLayout.WEST);
frame.add(panel5,BorderLayout.CENTER);


    }
}
