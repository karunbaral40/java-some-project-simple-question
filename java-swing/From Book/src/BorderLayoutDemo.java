import javax.swing.*;
import java.awt.*;
//Container is divided into s areas:
//NORTH SOUTH
//EAST WEST
//CENTER
//Only ane component per region
//Center takes maximum space
//Border areas stretch only in one direction
//Page Layout (header, footer, sidebar, content)
// then to use
// Dashboards
//Main application window
//Menu content screens
public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setLayout(new BorderLayout());

        frame.add(new JButton("North"),BorderLayout.NORTH);
        frame.add(new JButton("South"),BorderLayout.SOUTH);
        frame.add(new JButton("East"),BorderLayout.EAST);
        frame.add(new JButton("West"),BorderLayout.WEST);
        frame.add(new JButton("Center"),BorderLayout.CENTER);

        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
