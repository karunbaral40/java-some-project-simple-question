import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Graphics  implements ActionListener {
    JPanel panel;

    JTextField textField;
    JTextField textField1;
    JButton button;
    JLabel label;
    JFrame frame;

    Graphics() {
        frame=new JFrame();
        // Frame setup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setTitle("Login Page");

        // Panel setup
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50)); // padding

        // Username field
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        textField.setText("UserName");

        // Password field
        textField1 = new JTextField();
        textField1.setPreferredSize(new Dimension(250, 40));
        textField1.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        textField1.setText("Password");
        textField.addActionListener(this);
        textField1.addActionListener(this);

        // Button
        button = new JButton("Submit");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener(this);

        // Label
        label = new JLabel("");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setFont(new Font("Arial",Font.BOLD,25));

        // Add components to panel with spacing
        panel.add(textField);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(textField1);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
panel.add(label);
        // Add panel to frame
        frame.add(panel);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

if(textField!=null &&textField1!=null) {
    if (e.getSource() == button) {
        textField.setVisible(false);
        textField1.setVisible(false);
        button.setVisible(false);
        label.setText("Welcome!");
        panel.revalidate();
        panel.repaint();
    }
}
    }
}

public class LoginPage {
    public static void main(String[] args) {
        new Graphics();
    }
}
