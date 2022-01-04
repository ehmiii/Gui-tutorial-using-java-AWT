import java.awt.*;
import java.awt.event.*;
public class ChoiceExample1 {
    ChoiceExample1(){
        // Creating instance of classes
        Frame frame=new Frame("Choice Example with actionListener");
        Label label=new Label();
        Button button=new Button("Show");
        Choice choice=new Choice();

        // Sitting boundaries of components
        label.setBounds(10,50,390,30);
        choice.setBounds(10,100,80,30);
        button.setBounds(100,100,80,30);

        // Adding item into choice menu
        choice.add("Java");
        choice.add("C++");
        choice.add("Python");
        choice.add("C");

        // Performing some action on button event
        button.addActionListener(e ->
                label.setText("Selected programming language is: "
                        +choice.getItem(choice.getSelectedIndex())));


        // Sitting frame and adding components into it
        frame.add(label);
        frame.add(choice);
        frame.add(button);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        // Closing frame window
        frame.addWindowListener(new WindowAdapter(){
           @Override
           public void windowClosing(WindowEvent e){
               frame.dispose();
           }
        });
    }
    // Main method of this class
    public static void main(String[] args) {
        new ChoiceExample1();
    }
}
