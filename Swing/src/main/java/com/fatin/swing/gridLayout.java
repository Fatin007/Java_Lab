package com.fatin.swing;

import java.awt.GridLayout;

import javax.swing.*;

public class gridLayout extends JFrame{
    gridLayout(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new GridLayout(3,3,10,10));

        for(int i = 0; i < 9; i++){
            this.add(new JButton(""+i));
            }
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new gridLayout();
    }
}
