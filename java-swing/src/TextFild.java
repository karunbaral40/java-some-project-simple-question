import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyClass extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    MyClass(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
      button=new JButton("submit");
      button.addActionListener(this);
         textField =new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.PLAIN,30));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.BLACK);
          textField.setCaretColor(Color.white);
          textField.setText("UserName");
//          textField.setEditable(false);

        this.add(textField);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource()==button){
    button.setEnabled(false);
    System.out.println( "Welcome"+textField.getText());
}

    }
}
public class TextFild {
    public static void main(String[] args) {
        //JTextField:-
        //          A GUI textbox component that can be used to
        //          add set and get text
        MyClass frame=new MyClass();
    }
}
