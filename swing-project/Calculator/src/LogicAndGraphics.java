import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogicAndGraphics extends JPanel implements ActionListener {

    JTextField textField;

    JButton clearButton, percentageButton, cutButton, divisionButton;
    JButton button7, button8, button9, MultiButton;
    JButton button4, button5, button6, minusButton;
    JButton button1, button2, button3, plusButton;
    JButton button00, button0, dotButton, equalButton;

    JButton[] buttons;

    double num1 = 0;
    double num2 = 0;
    char op = ' ';
    boolean startNewNumber = true;

    public LogicAndGraphics() {
        this.setPreferredSize(new Dimension(400, 500));
        this.setLayout(new BorderLayout(5, 5));

        // --- Text field setup ---
        textField = new JTextField();
        textField.setEditable(false);
        textField.setBackground(Color.LIGHT_GRAY);
        textField.setFont(new Font("Arial", Font.BOLD, 40));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        this.add(textField, BorderLayout.NORTH);

        // --- Initialize buttons ---
        clearButton = new JButton("C");
        percentageButton = new JButton("%");
        cutButton = new JButton("←");
        divisionButton = new JButton("/");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        MultiButton = new JButton("*");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        minusButton = new JButton("-");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        plusButton = new JButton("+");
        button00 = new JButton("00");
        button0 = new JButton("0");
        dotButton = new JButton(".");
        equalButton = new JButton("=");

        // --- Put buttons in array ---
        buttons = new JButton[]{
                clearButton, percentageButton, cutButton, divisionButton,
                button7, button8, button9, MultiButton,
                button4, button5, button6, minusButton,
                button1, button2, button3, plusButton,
                button00, button0, dotButton, equalButton
        };

        // --- Style buttons ---
        for (JButton btn : buttons) {
            btn.setFocusable(false);
            btn.setBackground(new Color(50, 50, 50));
            btn.setForeground(Color.WHITE);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.setOpaque(true);
            btn.setBorderPainted(false);
            btn.addActionListener(this);
        }

        JButton[] operatorButtons = {divisionButton, MultiButton, minusButton, plusButton, equalButton};
        for (JButton btn : operatorButtons) {
            btn.setBackground(new Color(255, 140, 0));
            btn.setFont(new Font("Arial", Font.BOLD, 20));
        }

        // --- Panel for buttons ---
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));
        for (JButton btn : buttons) {
            buttonPanel.add(btn);
        }
        this.add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
try {
    for (JButton btn : buttons) {
        if (src == btn) {
            String text = btn.getText();

            if ("0123456789.".contains(text)) {
                // Number input
                if (startNewNumber) {
                    textField.setText(text);
                    startNewNumber = false;
                } else {
                    textField.setText(textField.getText() + text);
                }

            } else if ("+-*/%".contains(text)) {
                // Operator
                try{
if (!textField.getText().isEmpty()&&!textField.getText().matches(".*[+\\-*/%]$")){
    num1=Double.parseDouble(textField.getText());
}
                }catch (NumberFormatException ex) {
                    textField.setText("Error");
                    startNewNumber = true;
                    return;
                }
                textField.setText(textField.getText() + " " + text + " ");
                op = text.charAt(0);
                startNewNumber = true;


            } else if ("=".equals(text)) {
                // Equals
                num2 = Double.parseDouble(textField.getText());
                double result = 0;

                switch (op) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) result = num1 / num2;
                        else {
                            textField.setText("Error");
                            return;
                        }
                        break;
                    case '%':
                        if (num2 != 0) result = num1 % num2;
                        else {
                            textField.setText("Error");
                            return;
                        }
                        break;
                }

                textField.setText(String.valueOf(result));
                num1 = num2 = 0;
                startNewNumber = true;

            } else if ("←".equals(text)) {
                // Backspace
                String current = textField.getText();
                if (!current.isEmpty()) {
                    textField.setText(current.substring(0, current.length() - 1));
                }

            } else if ("C".equals(text)) {
                // Clear
                textField.setText("");
                num1 = num2 = 0;
                op = ' ';
                startNewNumber = true;
            }
        }
    }
}catch (NumberFormatException ex) {
    textField.setText("Invalid Number");
    startNewNumber = true;
} catch (ArithmeticException ex) {
    textField.setText("Error: " + ex.getMessage());
    startNewNumber = true;
} catch (Exception ex) {
    textField.setText("Error");
    startNewNumber = true;
}
    }
}
