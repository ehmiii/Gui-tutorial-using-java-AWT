import java.awt.*;
import java.awt.event.*;

public class MenuItem_Menu {
    MenuItem_Menu(){
        Frame frame=new Frame("MenuItem & Menu & SubMenu");
        MenuBar menuBar=new MenuBar();
        Menu menu=new Menu("View");
        Menu subMenu=new Menu("Appearance");
        MenuItem item=new MenuItem("Quick Definition");
        MenuItem item1=new MenuItem("Recent File");
        MenuItem item2=new MenuItem("Show sibling");
        MenuItem item3=new MenuItem("Type info");
        MenuItem item4=new MenuItem("Enter Full Screen");
        MenuItem item5=new MenuItem("Enter Xa mara Mood");
        menu.add(item);
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(subMenu);
        subMenu.add(item4);
        subMenu.add(item5);
        menuBar.add(menu);


        frame.setMenuBar(menuBar);
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
        new MenuItem_Menu();
    }
}
