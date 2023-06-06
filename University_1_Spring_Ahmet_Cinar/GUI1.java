package Ders;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI1 {
    public static void main(String[] args) {
        
        JFrame frame=new JFrame();
        frame.setSize(1280, 720);
        
        JPanel panel=new JPanel();
        
        JButton buton=new JButton("=");
        panel.add(buton);
      
        frame.add(panel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
