package Tuan04.buoi06.GiuakyHK2;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;


public class window {
    private JFrame jFrame;
    JButton jButton;
    

    public void show() {
        jButton = new JButton("Chơi mới");
        
        jFrame = new JFrame("Ngọc Rồng Blue");
        jFrame.setSize(400,400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(jButton);
        
        
        jFrame.setVisible(true);

    }
}
