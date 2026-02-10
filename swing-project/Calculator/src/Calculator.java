import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        LogicAndGraphics panel=new LogicAndGraphics();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
