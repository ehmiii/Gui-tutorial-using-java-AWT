import java.awt.*;
import java.awt.event.*;

public class CheckBoxExample {
    CheckBoxExample(){
        Frame frame=new Frame("Check Box Test");
        Checkbox checkbox=new Checkbox("C++");
        Checkbox checkbox1=new Checkbox("Java",true);
        checkbox.setBounds(100, 100,  50, 50);
        checkbox1.setBounds(100, 150,  50, 50);

        final Label label=new Label();
//        label.setAlignment(Label.CENTER);
        label.setBounds(150,50,400,50);

        checkbox.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent f){
                label.setText("C++ Checkbox: "+(f.getStateChange()==1?"checked":"Unchecked"));
            }
        });
        checkbox1.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e){
//                label.setText("Java CheckBox: "+(e.getStateChange()==1?"Checked":"Unchecked"));
               label.setText("Java CheckBox: "+ (e.getStateChange()==1?"Checked":"Unchecked") );
            }

        });
        frame.add(label);
        frame.add(checkbox);
        frame.add(checkbox1);
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
        new CheckBoxExample();
    }
}
