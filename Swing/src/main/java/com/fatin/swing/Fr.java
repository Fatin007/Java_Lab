package com.fatin.swing;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Container;

public class Fr extends JFrame{
    private ImageIcon icon;
    private Container c;
    public Fr(){
        this.setVisible(true);
        this.setBounds(50, 50, 420, 420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.icon = new ImageIcon(getClass().getResource("FN.png")); 
        this.setIconImage(icon.getImage());
        c = this.getContentPane();
        c.setBackground(Color.CYAN);
    }
}
