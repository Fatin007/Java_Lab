package com.fatin.swing;

import java.awt.*;
import javax.swing.*;

public class flowLayout extends JFrame{
    JPanel p1;
    flowLayout(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        p1 = new JPanel();
        p1.setBackground(Color.red);
        p1.setPreferredSize(new Dimension(250,250));
        p1.setLayout(new FlowLayout());
        this.add(p1);
        
        for (int i = 1; i <= 16; i++) {
            // String s = "Button ";
            // if(i<10) s = "Button 0";
            p1.add(new JButton(""+i));
        }
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new flowLayout();
    }
}
