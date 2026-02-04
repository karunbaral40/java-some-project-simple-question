import javax.swing.*;
import java.awt.*;

class PGBar  {
    JFrame frame=new JFrame();
    JProgressBar bar=new JProgressBar();

    PGBar(){

        bar.setValue(0);
        bar.setBounds(0,0,424,50);
bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setForeground(Color.RED);
        bar.setBackground(Color.BLACK);


        frame.add(bar);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(420,420);
frame.setLayout(null);
frame.setVisible(true);
fill();
    }
    void fill() {
        int counter=0;
        while (counter<=100){
bar.setValue(counter);
try {
    Thread.sleep(50);
} catch (InterruptedException e) {
    System.out.println(e);
}
counter+=1;
        }
        bar.setString("Done");

    }
}
public class ProgressBar {
    public static void main(String[] args) {
        //Progress Bar:
        //              visual aid to let you know that an operation is processing .
        PGBar demo =new PGBar();
    }
}
