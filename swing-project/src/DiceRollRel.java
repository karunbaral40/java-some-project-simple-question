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

        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());


        button = new JButton("click for roll");
        button.setSize(50,20);

this.add(button);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

    }
}