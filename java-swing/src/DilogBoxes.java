import com.sun.jdi.IntegerValue;

import javax.swing.*;

public class DilogBoxes {
    public static void main(String[] args) {
// jOOptionPane :-
        //      Pop up a standard dialogue box that prompts user for
        //      value or information of something
//        JOptionPane.showMessageDialog(null,"this is some useless info","title",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"this is some useless info","title",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"this is some useless info","title",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"this is some useless info","title",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"this is some useless info","title",JOptionPane.ERROR_MESSAGE);

//     int ans= JOptionPane.showConfirmDialog(null,"bro do you even code","code please!!",JOptionPane.YES_NO_CANCEL_OPTION);
//if (ans==0){
//    JOptionPane.showMessageDialog(null,"you Liar","yes",JOptionPane.WARNING_MESSAGE);
//} else if (ans==1) {
//    JOptionPane.showMessageDialog(null,"You are not lying this time ","no",JOptionPane.INFORMATION_MESSAGE);
//}else {
//    JOptionPane.showMessageDialog(null,"How dare you to cancel my Question!!!","cancel",JOptionPane.ERROR_MESSAGE);
//}
//        String name=JOptionPane.showInputDialog("what is your name?");
//        System.out.println("Hello!"+name);
        String []responce={"no you are awesome!","thank you!","blush😊","hehe"};
        JOptionPane.showOptionDialog(null,
                "yor are awesome",
                "secret massage",JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                responce,0);
    }
}
