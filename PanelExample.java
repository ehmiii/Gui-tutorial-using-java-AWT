import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PanelExample implements ActionListener{
    Button button=new Button("Click me");
    Button button1=new Button("Show");
    PanelExample(){
        Frame frame=new Frame("Panel Example");
        Panel panel=new Panel();


        panel.setBackground(Color.gray);
        panel.setBounds(40,50,300,250);
        button.setBounds(10,150,80,30);
        button1.setBounds(100,150,80,30);
        button.addActionListener(this);
        button1.addActionListener(this);
//        button.setActionCommand("click");
//        button1.setActionCommand("show");

        panel.add(button);
        panel.add(button1);

        frame.add(panel);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing( WindowEvent e){
                frame.dispose();
            }
        });
    }
    public static void main(String[] args) {
        new PanelExample();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(button, "I am click me");
        }
        else{
                JOptionPane.showMessageDialog(button1,"My name is Ahmad Khan");
        }
    }
}
