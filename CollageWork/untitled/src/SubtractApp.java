import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SubtractApp extends JFrame implements ActionListener {
    JTextField num1Field, num2Field, resultField;
    JButton subtractBtn;

    public SubtractApp() {
        setTitle("Subtraction App");
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Number 1:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Number 2:"));
        num2Field = new JTextField();
        add(num2Field);

        add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        subtractBtn = new JButton("Subtract");
        subtractBtn.addActionListener(this);
        add(subtractBtn);

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(num1Field.getText());
        double b = Double.parseDouble(num2Field.getText());
        resultField.setText(String.valueOf(a - b));
    }

    public static void main(String[] args) {
        new SubtractApp();
    }
}
