package com.fatin.swing;

import java.awt.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JOptionPane;

/**
 * button
 */
// public class button extends JFrame implements ActionListener{
public class button extends JFrame{

    JButton btn;
    button(){
        ImageIcon icon = new ImageIcon(getClass().getResource("FN.png"));
        icon.setImage(icon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));

        btn = new JButton("Click Me");
        btn.setBounds(100, 100, 150,100);
        btn.setFocusable(false);
        btn.setIcon(icon);
        btn.setHorizontalTextPosition(JButton.CENTER);
        btn.setVerticalTextPosition(JButton.BOTTOM);
        btn.setBackground(Color.green);
        btn.setForeground(Color.red);
        btn.setFont(new java.awt.Font("Comic Sans MS", Font.BOLD, 20));
        btn.setBorder(BorderFactory.createEtchedBorder());
        
        btn.addActionListener(e -> System.out.println("Yuck Fou"));
        
        this.setVisible(true);
        this.setBounds(100, 100, 400, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(btn);
    }
    
    // @Override
    // public void actionPerformed(ActionEvent e){
    //     if(e.getSource() == btn){
    //         System.out.println("Yuck Fou");
    //         JOptionPane.showMessageDialog(this, "Button Clicked");
    //     }
    // }
    public static void main(String[] args) {
        new button();

    }
}