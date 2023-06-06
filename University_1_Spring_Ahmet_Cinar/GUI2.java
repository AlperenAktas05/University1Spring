package Ders;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class GUI2 extends JFrame {
    
    public GUI2(){
        JPanel panel=new JPanel();
        getContentPane().add(panel);
        setSize(1280, 720);
    }
    
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(550, 100, 150, 150);
        try {
            Thread.sleep(600);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        g.setColor(Color.yellow);
        g.fillOval(550, 300, 150, 150);
        
        try {
            Thread.sleep(600);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        g.setColor(Color.green);
        g.fillOval(550, 500, 150, 150);     
    }
       
    public static void main(String[] args) {
        
        GUI2 gui2=new GUI2();
        gui2.setVisible(true);
    }
}
