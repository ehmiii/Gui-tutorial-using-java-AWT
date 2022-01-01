import java.awt.*;
import java.awt.event.*;

// Creating Table Class
public class Table {
    // Creating instances of Components
    TextArea result=new TextArea();
    Label number=new Label("Enter your Number:");
    TextField table=new TextField();
    Button button=new Button("Calculation");
    Button button1=new Button("Clear");
    // Creating constructor
    Table(){
        // Creating instance of Frame
        Frame frame=new Frame("Table Software");

        // Setting bounds of Components
        number.setBounds(0,50,130,30);
        table.setBounds(135,50,80,30);
        button.setBounds(40,90,80,30);
        button.setBackground(Color.gray);
        button1.setBackground(Color.gray);
        button1.setBounds(125,90,50,30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long num3;
                String num1=table.getText();
                int num=Integer.parseInt(table.getText());

                for(int i=1; i<11;i++){
                    num3=num*i;
                    result.append(String.valueOf(i)+" * "+num1+" = "+String.valueOf(num3)+"\n");
                }


            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                table.setText("");
                result.setText("");
            }
        });

        result.setBounds(40,125,150,250);
        result.setEditable(false);

        // Adjustment of Frame and adding component to Frame
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

    // main methods
    public static void main(String[] args)
    {
        new Table();
    }
}
