package com.fatin.swing;

import javax.swing.*;

public class pregressbar extends JFrame{
    pregressbar(){
        JProgressBar pb = new JProgressBar();
        pb.setValue(0);
        pb.setStringPainted(true);
        pb.setBounds(40,40,320,30);
        pb.setValue(0);
        add(pb);
        setSize(500,300);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for(int i=0;i<=100;i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pb.setValue(i);
            if(i%4==0)pb.setString("Loading.");
            else if(i%4==1)pb.setString("Loading..");
            else if(i%4==2)pb.setString("Loading...");
            else pb.setString("Loading.... ");
        }   
        pb.setString("Done!");
    }
    public static void main(String[] args) {
        new pregressbar();
    }
}
