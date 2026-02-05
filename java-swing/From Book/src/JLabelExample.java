import javax.swing.*;

public class JLabelExample {
    static JFrame frame;
    static JLabel label;
    public static void main(String[] args) {
        frame=new JFrame();
        label=new JLabel();
        label.setText("hello");
        JPanel panel=new JPanel();
        panel.add(label);
        frame.add(panel);
        frame.setSize(300,300);
        frame.setVisible(true);

    }
}
