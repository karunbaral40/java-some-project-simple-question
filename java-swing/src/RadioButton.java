import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class
RDButton extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton HamBurgerButton;
    JRadioButton HotDogButton;
    RDButton(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        pizzaButton=new JRadioButton("pizza");
        HamBurgerButton=new JRadioButton("HamBurger");
         HotDogButton=new JRadioButton("HotDog");
        ButtonGroup group=new ButtonGroup();
        group.add(pizzaButton);
        group.add(HamBurgerButton);
        group.add(HotDogButton);
        pizzaButton.addActionListener(this);
        HamBurgerButton.addActionListener(this);
        HotDogButton.addActionListener(this);
this.add(pizzaButton);
this.add(HamBurgerButton);
this.add(HotDogButton);
        this.pack();;
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==pizzaButton){
            System.out.println("your pizza is getting ready wait 10 min-----");
        } else if (e.getSource()==HamBurgerButton) {
            System.out.println("your HamBurger  is getting ready wait 7 min-----");
        }else {
            System.out.println("your HotDog  is getting ready wait 5 min-----");
        }
    }
}
public class RadioButton {
    public static void main(String[] args) {
        new RDButton();
        //JRadioButton :-
        //               one or more button in a grouping in
        // which only one may be selected per group

    }
}
