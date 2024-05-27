package com.fatin.swing;

import java.awt.Container;
import java.awt.*;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class checkbox extends JFrame{
    private Container c;
    private JCheckBox cb1, cb2, cb3;
    checkbox(){
        Color clr1 = new Color(244, 238, 255);
        Color clr2 = new Color(66, 72, 116);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(clr1);
        
        Font f = new Font("Cascadia Code",Font.BOLD,18);

        cb1 = new JCheckBox("C++");
        cb1.setBounds(50, 50, 100, 50);
        cb1.setFont(f);
        c.add(cb1);
        
        cb2 = new JCheckBox("Java");
        cb2.setBounds(50, 100, 100, 50);
        cb2.setBackground(clr1);
        cb2.setForeground(clr2);
        cb2.setFont(f);
        c.add(cb2);
        
        cb3 = new JCheckBox("Python");
        cb3.setBounds(50, 150, 100, 50);
        cb3.setFont(f);
        c.add(cb3);
    }
    public static void main(String[] args) {
        checkbox frame = new checkbox();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 900, 600);
        frame.setVisible(true);

    }
}
