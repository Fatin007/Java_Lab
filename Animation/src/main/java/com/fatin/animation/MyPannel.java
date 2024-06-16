package com.fatin.animation;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class MyPannel extends JPanel implements ActionListener{
    final int WIDTH = 500;
    final int HEIGHT = 500;
    JLabel l;
    Timer t;
    int x = 0;
    int y = 0;
    int velX = 2;
    int velY = 2;
    MyPannel(){
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.black);
        l = new JLabel();
        t = new Timer(null);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(x < 0 || x > WIDTH - 50){
            velX = -velX;
        }
        if(y < 0 || y > HEIGHT - 50){
            velY = -velY;
        }
        x += velX;
        y += velY;
        l.setBounds(x, y, 50, 50);
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        
    }
}
