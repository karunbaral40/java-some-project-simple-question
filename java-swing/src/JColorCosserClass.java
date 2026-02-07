import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Choose extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    Choose(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        button=new JButton("pick a color");
        label=new JLabel();

        button.addActionListener(this);

        label.setBackground(Color.WHITE);
        label.setText("this is some text");
        label.setFont(new Font("MV Boli",Font.PLAIN,100));
        label.setOpaque(true);

this.add(button);
this.add(label);
        this.pack();
        this.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource()==button){
    JColorChooser colorChooser=new JColorChooser();

    Color color=JColorChooser.showDialog(null,"pick a color",Color.BLACK);
//    label.setForeground(color);
    label.setBackground(color);
}

    }
}
public class JColorCosserClass {
    public static void main(String[] args) {
new Choose();
    }
}
