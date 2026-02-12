import javax.swing.*;

public class JButtonDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Components");



        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel l= new JLabel("Enter your name");
        JTextField t = new JTextField(13);

        JButton b1=new JButton("Submit");


        f.setLayout(new java.awt.FlowLayout());
        f.add(l);
        f.add(t);
        f.add(b1);

        f.setVisible(true);

    }
}