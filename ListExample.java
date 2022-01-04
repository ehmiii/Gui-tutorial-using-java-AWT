import java.awt.*;
import java.awt.event.*;
public class ListExample {
    ListExample(){
        Frame frame=new Frame("List Example");
        List list=new List(5);
        list.setBounds(100,100,75,75);
        list.add("Item1");
        list.add("Item2");
        list.add("Item3");
        list.add("Item4");
        list.add("Item5");

        frame.add(list);
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
        new ListExample();
    }
}
