package com.fatin.swing;

import java.awt.*;
import javax.swing.*;

public class borderLayout extends JFrame {
    JPanel p1,p2,p3,p4,p5;
    borderLayout(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLayout(new BorderLayout(10,5));

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();

        p1.setBackground(Color.red);
        p2.setBackground(Color.green);
        p3.setBackground(Color.blue);
        p4.setBackground(Color.yellow);
        p5.setBackground(Color.orange);

        p1.setPreferredSize(new Dimension(100, 50));
        p2.setPreferredSize(new Dimension(100, 50));
        p3.setPreferredSize(new Dimension(100, 100));
        p4.setPreferredSize(new Dimension(100, 100));
        p5.setPreferredSize(new Dimension(100, 100));

        this.add(p1, BorderLayout.NORTH);
        this.add(p2, BorderLayout.SOUTH);
        this.add(p3, BorderLayout.WEST);
        this.add(p4, BorderLayout.EAST);
        this.add(p5, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new borderLayout();
    }
}
