import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;

public class ChoiceExample {
    ChoiceExample(){
        Frame frame=new Frame("Choice Box Example");
        Choice choice=new Choice();
        choice.setBounds(30,150,80,30);
        choice.add("Item");
        choice.add("Item2");
        choice.add("Item3");
        choice.add("Item4");
        choice.add("Item5");


        frame.add(choice);
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
        new ChoiceExample();
    }
}
