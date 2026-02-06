import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class class2 extends JFrame implements ActionListener {
    JButton button;
    class2(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        button=new JButton("click me");
        button.addActionListener(this);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==button){
    JFileChooser fileChooser=new JFileChooser();
    fileChooser.setCurrentDirectory(new File("."));
//int responce=fileChooser.showOpenDialog(null);//select file to open
int responce=fileChooser.showSaveDialog(null);//select file to save
if (responce==JFileChooser.APPROVE_OPTION){
    File file=new File(fileChooser.getSelectedFile().getAbsoluteFile().toURI());
    System.out.println(file);
}
}
    }
}
public class JFileChooserClass {
    public static void main(String[] args) {
new class2();
    }
}
