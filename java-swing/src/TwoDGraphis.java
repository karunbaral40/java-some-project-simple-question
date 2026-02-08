import javax.swing.*;
import java.awt.*;

class two extends JFrame {
    MyPannel pannel;
    two(){
        pannel=new MyPannel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.add(pannel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
class MyPannel extends JPanel{
    MyPannel(){
this.setPreferredSize(new Dimension(500,500));
    }
    public void paint(Graphics g){
        Graphics2D g2d=(Graphics2D)g;
        g2d.setStroke(new BasicStroke(5));
//        g2d.setPaint(Color.BLUE);
//        g2d.drawLine(0,0,500,500);
//    g2d.fillRect(50,50,100,200);
//        g2d.setPaint(Color.GREEN);
//    g2d.fillRect(10,10,100,200);
//        g2d.setPaint(Color.ORANGE);
//        g2d.fillOval(0,0,100,100);
     /*   g2d.setPaint(Color.red);
        g2d.fillArc(0,0,100,100,0,180);
        g2d.setPaint(Color.WHITE);
        g2d.fillArc(0,0,100,100,180,180);*/


        /* int[] xPoints={150,250,350};
        int[] yPoints={300,150,300};
        g2d.setPaint(Color.yellow);
//        g2d.drawPolygon(xPoints,yPoints,3);
        g2d.fillPolygon(xPoints,yPoints,3);*/
//
//        g2d.setFont(new Font("Ink Free",Font.BOLD,55));
//        g2d.setPaint(Color.RED);
//        g2d.drawString("WIN TO NEPAL",50,50);
//




    }

}
public class TwoDGraphis {
    public static void main(String[] args) {
new two();
    }
}
