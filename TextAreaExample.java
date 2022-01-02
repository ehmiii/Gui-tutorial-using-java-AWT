import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextAreaExample {
//    TextAreaExample(){
//        Frame frame=new Frame("Text Area Test");
//        TextArea textArea=new TextArea("Welcome to Ak world");
//
//        textArea.setBounds(30,50,200,50);
//        textArea.setName("Hello");
//        frame.setSize(400,400);
//        frame.add(textArea);
//        frame.setLayout(null);
//        frame.setVisible(true);
//        frame.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                frame.dispose();
//            }
//        });
//    }


    TextAreaExample(){
        // Making word counter using text area
        Frame frame=new Frame("Text area test1");
        Label label=new Label();
        Label label1=new Label();
        TextArea textArea=new TextArea();
        Button button=new Button("Count words");


        label.setBounds(50, 50, 100, 30);
        label1.setBounds(160, 50, 100, 30);
        textArea.setBounds(20, 100, 300, 300);
        button.setBounds(100, 400, 100, 30);

        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent f){
                String text=textArea.getText();
                String words[]=text.split("\\s");
                label.setText("Words: "+words.length);
                label1.setText("Characters: "+text.length());
            }
        });

        frame.add(label);
        frame.add(label1);
        frame.add(textArea);
        frame.add(button);
        frame.setSize(400,450);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });
    }
    public static void main(String[] args) {
        new TextAreaExample();
    }
}


