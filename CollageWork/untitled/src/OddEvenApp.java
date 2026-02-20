import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OddEvenApp extends JFrame implements ActionListener {
    JTextField inputField;
    JLabel resultLabel;
    JButton checkBtn;

    public OddEvenApp() {
        setTitle("Odd or Even");
        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("Enter Number:"));
        inputField = new JTextField();
        add(inputField);

        checkBtn = new JButton("Check");
        checkBtn.addActionListener(this);
        add(checkBtn);

        resultLabel = new JLabel("");
        add(resultLabel);

        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(inputField.getText());
        if (num % 2 == 0)
            resultLabel.setText(num + " is Even");
        else
            resultLabel.setText(num + " is Odd");
    }

    public static void main(String[] args) { new OddEvenApp(); }
}


