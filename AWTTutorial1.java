import java.awt.*;
import java.awt.event.*;
public class AWTTutorial1 {
    String name, hint="Enter your name";
    AWTTutorial1(){
        Frame frame=new Frame("This is new Frame");


        TextField textField=new TextField("");
        textField.setBounds(30,50,150,30);
        textField.setBackground(Color.gray);
        Label label=new Label();
        label.setText("Name");
        label.setBounds(30,85,150,30);
        label.setBackground(Color.black);
        label.setForeground(Color.white);

        Button button=new Button("Submit");
        button.setBounds(65,120,80,30);
        button.setForeground(Color.white);
        button.setBackground(Color.green);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                name=textField.getText();
                if(name.length()==0) {
                    label.setText("Name");
                }
                else{
                    label.setText(name);
                    textField.setText("");
                }
            }
        });

        frame.add(textField);
        frame.add(label);
        frame.add(button);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new AWTTutorial1();
    }
}
