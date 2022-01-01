import java.awt.*;
import java.awt.event.*;

public class Table {
    TextArea result=new TextArea();
    Table(){
        Frame frame=new Frame("Table Software");
        Label number=new Label("Enter your Number:");
        number.setBounds(0,50,130,30);
//        number.setBackground(Color.white);

        TextField table=new TextField();
        table.setBounds(135,50,80,30);

        Button button=new Button("Calculation");
        Button button1=new Button("Clear");
        button.setBounds(40,90,80,30);
        button.setBackground(Color.gray);
        button1.setBackground(Color.gray);
        button1.setBounds(125,90,50,30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num ="",num2;
                int num1;
                long num3;
                num1= Integer.parseInt(table.getText());
                for(int i=1; i<11;i++){
                    num3=Long.parseLong(num)*i;
                    result.setText(String.valueOf(i)+" * "+String.valueOf(num1)+" = "+String.valueOf(num3));
                }
            }
        });

        result.setBounds(0,125,200,150);

        frame.add(result);
        frame.add(button);
        frame.add(button1);
        frame.add(table);
        frame.add(number);
        frame.setSize(400,400);
        frame.setBackground(Color.CYAN);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent w){
                frame.dispose();
            }
        });
    }
    public static void main(String[] args) {
        new Table();
    }
}