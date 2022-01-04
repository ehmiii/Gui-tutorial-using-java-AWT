import java.awt.*;
import java.awt.event.*;

public class ListExample1 {
    ListExample1(){
        Frame frame=new Frame("List Example 1");
        Label label=new Label();
        Button button=new Button("Show");
        List list=new List(5,false);
        List list1=new List(5,true);

        list1.setBounds(239,161,91,114);
        label.setBounds(0,47,550,30);
        button.setBounds(137,94,124,50);
        list.setBounds(84,161,75,114);


        list1.add("Turbo_C++");
        list1.add("Spring");
        list1.add("Hibernate");
        list1.add("CodeIgniter");

        list.add("C++");
        list.add("JAVA");
        list.add("PYTHON");
        list.add("C#");

        button.addActionListener(e ->{
            StringBuilder data= new StringBuilder("Programming language Selected: " + list.getItem(list.getSelectedIndex()));
            data.append(" ,Framework Selected: ");
            for(String frame1:list1.getSelectedItems()){
                data.append(frame1).append(" ");
            }
        label.setText(data.toString());
        });


        frame.add(list);
        frame.add(list1);
        frame.add(button);
        frame.add(label);
        frame.setSize(550,400);
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
        new ListExample1();
    }
}
