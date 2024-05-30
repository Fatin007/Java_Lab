package com.fatin.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class radioBtn extends JFrame implements ActionListener{
    private JRadioButton rb1, rb2, rb3;
    private ButtonGroup bg;
    private Container c;
    private JButton btn;
    public radioBtn(){
        Color color=new Color(37,67,54);

        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(color);

        rb1 = new JRadioButton("Fatin");
        rb1.setBounds(50,50,100,50);
        c.add(rb1);
        
        rb2 = new JRadioButton("Nur");
        rb2.setBounds(50,100,100,50);
        c.add(rb2);
        
        rb3 = new JRadioButton("Fatin Nur");
        rb3.setBounds(50,150,100,50);
        c.add(rb3);

        bg = new ButtonGroup();
        bg.add(rb1); bg.add(rb2); bg.add(rb3);

        btn = new JButton("Submit");
        btn.setBounds(50,200,100,50);
        c.add(btn);
        btn.addActionListener(this);
        add(rb1); add(rb2); add(rb3);
    }
    public void actionPerformed(ActionEvent e){
        if(rb1.isSelected()){
            JOptionPane.showMessageDialog(null, "Fatin is selected");
        }
        if(rb2.isSelected()){
            JOptionPane.showMessageDialog(null, "Nur is selected");
        }
        if(rb3.isSelected()){
            JOptionPane.showMessageDialog(null, "Fatin Nur is selected");
        }
    }
    public static void main(String[] args) {
        radioBtn frame = new radioBtn();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setTitle("Radio Button");
    }
}
