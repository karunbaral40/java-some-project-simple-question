import javax.swing.*;

public class StopWatch {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        GraphicsAndLogic panel=new GraphicsAndLogic();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
