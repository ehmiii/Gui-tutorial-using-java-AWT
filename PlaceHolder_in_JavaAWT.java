import java.awt.*;
import java.awt.event.*;


public class PlaceHolder_in_JavaAWT {
    Frame frame=new Frame("Place Holder in java awt");
    TextField textField=new TextField("Enter your name");
    TextField textField1=new TextField();
    PlaceHolder_in_JavaAWT(){

        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(textField.getText().equals("Enter your name")){
                    textField.setText("");
                    textField.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(textField.getText().isEmpty()){
                    textField.setText("Enter your name");
                    textField.setForeground(Color.gray);

                }
            }
        });
        textField.setBounds(50,80,250,30);
        textField1.setBounds(50,120,250,30);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        frame.add(textField);
        frame.add(textField1);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new PlaceHolder_in_JavaAWT();
    }
}
