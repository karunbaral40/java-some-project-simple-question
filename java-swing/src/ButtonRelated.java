import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonRelated extends JFrame implements ActionListener {
    JButton button ;
    JLabel label;
ButtonRelated () {
    ImageIcon icon=new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\java-swing\\src\\icons8-anime-emoji-100.png");
    ImageIcon icon2=new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\java-swing\\src\\small (3).png");
    label=new JLabel();
    label.setIcon(icon2);
    label.setBounds(150,250,150,150);
    label.setVisible(false);
        button = new JButton();
    button.setBounds(100, 100, 250, 100);
    button.addActionListener(this);
//    button.addActionListener(e-> System.out.println("hello!!"));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 500);
    this.setLayout(null);
    this.setVisible(true);
    this.add(button);
    this.add(label);
    button.setText("click me👍");
    button.setFocusable(false);
button.setIcon(icon);
button.setHorizontalTextPosition(JButton.CENTER);
button.setVerticalTextPosition(JButton.CENTER);
button.setFont(new Font("Comic Sans",Font.BOLD,25));
button.setIconTextGap(-15);
button.setForeground(Color.CYAN);
button.setBorder(BorderFactory.createEtchedBorder());


}
    public void actionPerformed(ActionEvent e)  {
if (e.getSource()==button){
//    System.out.println("poo");
    
}
    }
}