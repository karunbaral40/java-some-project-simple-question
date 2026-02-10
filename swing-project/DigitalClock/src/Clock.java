import javax.swing.*;

public class Clock {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        Grphics panel=new Grphics();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
