package com.fatin.swing;

import javax.swing.*;
import java.awt.*;

public class frame {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setVisible(true);
        fr.setBounds(100, 100, 1000, 800);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(null);
        
        JPanel redPanel = new JPanel();
        redPanel.setBounds(0, 0, 200, 200);
        redPanel.setBackground(Color.red);
        redPanel.setLayout(null);
        fr.add(redPanel);

        JPanel bluePanel = new JPanel();
        bluePanel.setBounds(200, 0, 200, 200);
        bluePanel.setBackground(Color.blue);
        bluePanel.setLayout(null);
        fr.add(bluePanel);

        JPanel greenPanel = new JPanel();
        greenPanel.setBounds(400, 0, 200, 200);
        greenPanel.setBackground(Color.green);
        greenPanel.setLayout(null);
        fr.add(greenPanel);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBounds(600, 0, 200, 200);
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setLayout(null);
        fr.add(yellowPanel);

        Color clr1= new Color(0x006989);

        JPanel newPanel = new JPanel();
        newPanel.setBounds(0, 200, 800, 200);
        newPanel.setBackground(clr1);
        newPanel.setLayout(null);
        fr.add(newPanel);

        button btn = new button();
        newPanel.add(btn);

    }
}
