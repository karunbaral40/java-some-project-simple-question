import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class
RDButton extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton HamBurgerButton;
    JRadioButton HotDogButton;
    JRadioButton MOMO;
    RDButton(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        pizzaButton=new JRadioButton("pizza");
        HamBurgerButton=new JRadioButton("HamBurger");
         HotDogButton=new JRadioButton("HotDog");
         MOMO=new JRadioButton("MOMO");
        ButtonGroup group=new ButtonGroup();
        group.add(pizzaButton);
        group.add(HamBurgerButton);
        group.add(HotDogButton);
        group.add(MOMO);
        pizzaButton.addActionListener(this);
        HamBurgerButton.addActionListener(this);
        HotDogButton.addActionListener(this);
        MOMO.addActionListener(this);
this.add(pizzaButton);
this.add(HamBurgerButton);
this.add(HotDogButton);
this.add(MOMO);
        this.pack();;
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==pizzaButton){
            System.out.println("your pizza is getting ready wait 10 min-----");
        } else if (e.getSource()==HamBurgerButton) {
            System.out.println("your HamBurger  is getting ready wait 7 min-----");
        }  else if (e.getSource()==MOMO) {
            System.out.println("your HamBurger  is getting ready wait 20 min-----");
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
