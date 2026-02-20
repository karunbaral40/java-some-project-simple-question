Button is Clicked.
import javax.swing.*;
import java.awt.event.*;

public class WelcomeApp extends JFrame implements ActionListener {
    JLabel label = new JLabel("Click the button");
    JButton btn = new JButton("Click Me");

    public WelcomeApp() {
        setTitle("Welcome App");
        setLayout(null);

        label.setBounds(50, 50, 200, 30);
        btn.setBounds(50, 100, 150, 30);
        btn.addActionListener(this);

        add(label); add(btn);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Welcome");
    }

    public static void main(String[] args) { new WelcomeApp(); }
}
