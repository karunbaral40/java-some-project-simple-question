import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyClass extends JFrame implements ActionListener {

    MyClass(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        JButton button=new JButton("submit");

        JTextField textField =new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

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
