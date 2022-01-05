import java.awt.*;
import java.awt.event.*;

public class FindIpAddress {
    FindIpAddress(){
        Frame frame=new Frame("Find IP Address");
        TextField textField=new TextField("Enter host name");
        Label label=new Label();
        Button button=new Button("Show IP");


        textField.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e){
                if(textField.getText().equals("Enter host name")){
                    textField.setText("");
                    textField.setForeground(Color.black);
                }
            }
            @Override
            public void focusLost(FocusEvent ex){
                if(textField.getText().isEmpty()){
                    textField.setText("Enter host name");
                    textField.setForeground(Color.gray);
                    textField.setBackground(Color.black);
                }
            }
        });


        textField.setBounds(0,50,400,47);
        label.setBounds(0,200,400,47);
        button.setBounds(141,124,118,49);
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });

        button.addActionListener(e->{
            try{
                String host=textField.getText();
                String ip=java.net.InetAddress.getByName(host).getHostAddress();
                label.setText("IP of: "+ host + " Is: "+ ip);
                textField.setText("");
            }catch(Exception exception){
                label.setText(String.valueOf(exception));
                textField.setText("");
            }
        });
    }
    public static void main(String[] args) {
        new FindIpAddress();
    }
}
