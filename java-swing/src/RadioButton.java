import javax.swing.*;
import java.awt.*;

class
RDButton extends JFrame {
    RDButton(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        JRadioButton pizzaButton=new JRadioButton("pizza");
        JRadioButton HamBurgerButton=new JRadioButton("HamBurger");
        JRadioButton HotDogButton=new JRadioButton("HotDog");
        ButtonGroup group=new ButtonGroup();
        group.add(pizzaButton);
        group.add(HamBurgerButton);
        group.add(HotDogButton);
this.add(pizzaButton);
this.add(HamBurgerButton);
this.add(HotDogButton);
        this.pack();;
        this.setVisible(true);
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
