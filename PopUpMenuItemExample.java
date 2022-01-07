import java.awt.*;
import java.awt.event.*;

public class PopUpMenuItemExample {
    // Creating constructor
    PopUpMenuItemExample(){
        // Creating instances of classes
        Frame frame=new Frame("Popup menu example");
        PopupMenu popupMenu=new PopupMenu();
        MenuItem item=new MenuItem("Cut");
        MenuItem item1=new MenuItem("Copy");
        MenuItem item2=new MenuItem("Paste");
        Label label=new Label();

        // Set boundaries of label instance
        label.setBounds(150,100,250,30);

        // calling setActionCommand method for performing some action
        item.setActionCommand("Cut");
        item1.setActionCommand("Copy");
        item2.setActionCommand("Paste");

        // Adding items into popup menu
        popupMenu.add(item);
        popupMenu.add(item1);
        popupMenu.add(item2);

        // For showing popup menu calling addMouseListener method
        frame.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                // Sitting display boundaries of popup menu
                popupMenu.show(frame,e.getX(),e.getY());
            }
        });

        // Performing some action of items of popup menu
        popupMenu.addActionListener(e->{
            switch (e.getActionCommand()) {
                case "Cut" -> {
                    label.setText("");
                    label.setText("Cut clicked");
                }
                case "Copy" -> {
                    label.setText("");
                    label.setText("Copy clicked");
                }
                case "Paste" -> {
                    label.setText("");
                    label.setText("Paste clicked");
                }
            }
        });
        // Adding & sitting some properties of frame instance
        frame.add(label);
        frame.add(popupMenu);
        frame.setSize(400,400);
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
        new PopUpMenuItemExample();
    }
}
