import java.awt.*;
import java.awt.event.*;

public class CanvasExample {
    CanvasExample(){
        Frame frame=new Frame("Canvas Example");

        frame.add(new CanvasTest());
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
           @Override
           public void windowClosing(WindowEvent e){
               frame.dispose();
           }
        });
    }
    public static void main(String[] args) {
        new CanvasExample();
    }
}

class CanvasTest extends Canvas{
    CanvasTest(){
        setSize(300,200);
        setBackground(Color.gray);
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(75,75,150,75);
    }
}