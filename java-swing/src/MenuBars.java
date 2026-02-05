import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Halku extends JFrame implements ActionListener {
    Halku(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);
        JMenuBar menuBar=new JMenuBar();


        JMenu fileMenu=new JMenu("file");
        JMenuItem loadItem=new JMenuItem("load");
        JMenuItem saveItem=new JMenuItem("Save");
        JMenuItem exitItem=new JMenuItem("Exit" );
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);


        JMenu editMenu=new JMenu("Edit");
        JMenu helpMenu=new JMenu("Help");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        this.add(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
public class MenuBars {
    public static void main(String[] args) {
        new Halku();
    }
}
