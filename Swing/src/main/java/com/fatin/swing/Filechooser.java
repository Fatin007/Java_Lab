package com.fatin.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Filechooser extends JFrame implements ActionListener{
    JButton b;
    Filechooser(){
        b=new JButton("click to select file");
        b.setBounds(100,100,200,40);
        add(b);
        b.addActionListener(this);

        setSize(400,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Filechooser();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            JFileChooser fc=new JFileChooser();
            fc.showOpenDialog(this);
        }
    }
}
