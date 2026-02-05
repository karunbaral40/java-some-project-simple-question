import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

class Halku extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    JMenu editMenu;
    JMenu helpMenu;
    Halku(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);
         menuBar=new JMenuBar();


        JMenu fileMenu=new JMenu("file");
         loadItem=new JMenuItem("load");
         saveItem=new JMenuItem("Save");
        exitItem=new JMenuItem("Exit" );
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);
        
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);


        editMenu=new JMenu("Edit");
        helpMenu=new JMenu("Help");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        this.add(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource()==loadItem){
    System.out.println("beep beep beep");
}
if (e.getSource()==saveItem){
    System.out.println("saved suceffuly");
}
if(e.getSource()==exitItem){
    System.exit(0);
}
    }
}
public class MenuBars {
    public static void main(String[] args) {
        new Halku();
    }
}
