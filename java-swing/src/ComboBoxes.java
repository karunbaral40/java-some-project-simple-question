import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Class1 extends JFrame implements ActionListener {
    JComboBox comboBox;

    Class1() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        String[] animals = {"dog", "cat", "bird", "goat", "cow"};

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        comboBox.setEditable(true);
        System.out.println( comboBox.getItemCount());
//        comboBox.addItem("horse");
//        comboBox.insertItemAt("pig",2);
//        comboBox.setSelectedIndex(0);
//        comboBox.removeItem("pig");
//        comboBox.removeItemAt(0);
//        comboBox.removeAll();
        this.add(comboBox);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
        }
//        System.out.println(comboBox.getSelectedItem());
        System.out.println(comboBox.getSelectedIndex());
    }
}
public class ComboBoxes {
    public static void main(String[] args) {
        //JComboBox = A component that combines a button or editable field and a drop-down list
new Class1();
    }
}
