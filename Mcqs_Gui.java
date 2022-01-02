import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Mcqs_Gui {
    Mcqs_Gui(){
        Frame frame=new Frame("Quiz");
        Label label=new Label("1. VM stand for ______.");
        Label label1=new Label();
        CheckboxGroup checkboxGroup=new CheckboxGroup();

        Checkbox checkbox=new Checkbox("Virtual Machine.",checkboxGroup,false);
        Checkbox checkbox1=new Checkbox("Virtual Motor.",checkboxGroup,false);
        Checkbox checkbox2=new Checkbox("Very Machine.",checkboxGroup,false);
        Checkbox checkbox3=new Checkbox("Virtual Motorcycle.",checkboxGroup,false);

        checkbox.addItemListener(e -> label1.setText("Correct Answer Congrats!!!."));
        checkbox1.addItemListener(e-> label1.setText("Wrong Answer."));
        checkbox2.addItemListener(e-> label1.setText("Wrong Answer."));
        checkbox3.addItemListener(e-> label1.setText("Wrong Answer."));

        label.setBounds(5,50,200,30);
        checkbox.setBounds(5,85,200,30);
        checkbox1.setBounds(210,85,200,30);
        checkbox2.setBounds(5,120,200,30);
        checkbox3.setBounds(210,120,200,30);
        label1.setBounds(150,155,400,30);


        frame.setSize(410,400);
        frame.add(label);
        frame.add(label1);
        frame.add(checkbox);
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(checkbox3);
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
        new Mcqs_Gui();
    }
}
