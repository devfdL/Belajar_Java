import javax.swing.*;
import java.awt.*;

class gui{
      public static void main(String args[]){
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        frame.getContentPane().add(BorderLayout.NORTH, button1);
        frame.getContentPane().add(BorderLayout.SOUTH, button2);
        frame.setVisible(true);
     }
}