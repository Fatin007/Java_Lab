package com.fatin.swing;

import javax.swing.*;
import java.awt.*;

public class layeredPane extends JFrame{
    layeredPane(){
        setTitle("Layered Pane");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(500,500));
        setLayout(null);
        setVisible(true);

        JLabel label1 = new JLabel("Label 1");
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel("Label 2");
        label2.setOpaque(true);
        label2.setBackground(Color.BLUE);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel("Label 3");
        label3.setOpaque(true);
        label3.setBackground(Color.GREEN);
        label3.setBounds(150,150,200,200);

        JLayeredPane lp = new JLayeredPane();
        lp.setBounds(0,0,500,500);
        lp.add(label1, Integer.valueOf(0));
        lp.add(label2, Integer.valueOf(1));
        lp.add(label3, Integer.valueOf(0));
        add(lp);
    }
    public static void main(String[] args) {
        new layeredPane();
    }
}
