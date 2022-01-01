import java.awt.*;
import java.awt.event.*;
public class MToKM {
    MToKM(){
        Frame frame=new Frame("Meter to Kilo Meter Converter");
        TextField mile=new TextField();
        Label mName=new Label("Mile:");
        mName.setBounds(90,100,30,30);
        mile.setBounds(120,100,150,30);

        Label kiloMeter=new Label();
        Label kmName=new Label("Kilo Meter:");
        kmName.setBounds(50,135,65,30);
        kiloMeter.setBounds(120,135,150,30);
        kiloMeter.setBackground(Color.white);

        Button button=new Button("Convert");
        Button button1=new Button("Clear");
        button1.setBounds(205,170,50,30);
        button.setBounds(120,170,80,30);
        button1.setBackground(Color.red);
        button1.setForeground(Color.white);
        button.setBackground(Color.red);
        button.setForeground(Color.white);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent f){
                String m,km1;
                Double km;
                m=mile.getText();
                if (m.length()==0){
                    kiloMeter.setText("Enter Kilo Meter");
                }
                else {
                    km = (Double.parseDouble(m)) * 1.609;
                    kiloMeter.setText(String.valueOf(km));
                }
            }
        });

        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent m){
                kiloMeter.setText("");
                mile.setText("");
            }
        });


        frame.setBackground(Color.CYAN);
        frame.add(mName);
        frame.add(kmName);
        frame.add(button);
        frame.add(button1);
        frame.add(mile);
        frame.add(kiloMeter);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new MToKM();
    }
}
