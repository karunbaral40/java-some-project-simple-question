import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class LunchPage implements ActionListener{
JFrame frame=new JFrame();
JButton button=new JButton("click me for roll👆");
LunchPage(){
button.setBounds(200,200,200,40);
button.setFocusable(false);
button.addActionListener(this);
frame.add(button);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setSize(500,500);
    frame.setVisible(true);
}
    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource()==button){
    new NewWindow();

}
    }
}
class NewWindow{
    ImageIcon[] diceImages = {
            new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\swing-project\\src\\dice1.png"),
            new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\swing-project\\src\\dice2.png"),
            new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\swing-project\\src\\dice3.png"),
            new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\swing-project\\src\\dice4.png"),
            new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\swing-project\\src\\dice5.png"),
            new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\swing-project\\src\\dice6.png")
    };


    Random random=new Random();
    int randomNumber = random.nextInt(6) ;
    JFrame frame=new JFrame();
    JLabel label=new JLabel();
    NewWindow(){
        frame.add(label);
label.setIcon(diceImages[randomNumber]);
        System.out.println("You rolled: " + (randomNumber + 1));
        frame.setSize(550, 550);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

}
    }

public class DiceRoll {
    public static void main(String[] args)
    {
        LunchPage lunchPage=new LunchPage();
    }
}
