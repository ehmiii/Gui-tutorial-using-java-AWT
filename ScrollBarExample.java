import java.awt.*;
import java.awt.event.*;

public class ScrollBarExample {
    ScrollBarExample(){
        Frame frame=new Frame("Scroll Bar Example");
        Scrollbar scrollbar=new Scrollbar();

        scrollbar.setBounds(370,0,30,400);

        frame.add(scrollbar);
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
        new ScrollBarExample();
    }
}
