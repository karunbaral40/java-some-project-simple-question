import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class neew extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    ImageIcon XIcon;
    ImageIcon icon;
neew(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());
    XIcon=new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\java-swing\\src\\wrong.png");
    icon=new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\java-swing\\src\\correct.png");
button=new JButton("submit");
    button.addActionListener(this);

checkBox=new JCheckBox();
    checkBox.setText("I'm not a robot");
    checkBox.setFocusable(false);
    checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
checkBox.setIcon(XIcon);
checkBox.setSelectedIcon(icon);
    this.add(checkBox);
    this.add(button);
     this.pack();
    this.setVisible(true);

}
    @Override
    public void actionPerformed(ActionEvent e) {

    if (e.getSource()==button){
        System.out.println(checkBox.isSelected());
    }
    }
}
public class CheckBoxInJava {
    public static void main(String[] args) {
        //JCheckBox=A GUI component that can be selected
        //           or deselect
        new neew();
    }
}
