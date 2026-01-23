import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DiceRollRel extends JFrame implements ActionListener {
    JLabel label;
    JButton button;
    ImageIcon[] diceImages;
Random random=new Random();
    DiceRollRel() {
        diceImages = new ImageIcon[]{
                new ImageIcon(new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\swing-project\\src\\dice1.png").getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH)),
                new ImageIcon(new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\swing-project\\src\\dice2.png").getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH)),
                new ImageIcon(new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\swing-project\\src\\dice3.png").getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH)),
                new ImageIcon(new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\swing-project\\src\\dice4.png").getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH)),
                new ImageIcon(new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\swing-project\\src\\dice5.png").getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH)),
                new ImageIcon(new ImageIcon("C:\\Users\\Acer\\OneDrive\\Documents\\Desktop\\chatgptQustionForJava\\swing-project\\src\\dice6.png").getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH))
        };

        button = new JButton("click for roll");
        button.addActionListener(this);
        label = new JLabel(diceImages[0], JLabel.CENTER);

        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(label, BorderLayout.CENTER);
        this.add(button, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        label.setIcon(diceImages[random.nextInt(6)]);
        button.setVisible(false); // hide after click
    }
}