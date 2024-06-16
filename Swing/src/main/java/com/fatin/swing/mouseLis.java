package com.fatin.swing;

import javax.swing.*;
import java.awt.event.MouseListener;
import java.awt.event.*;


public class mouseLis extends JFrame implements MouseListener{
    mouseLis(){
        setSize(400,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);


        setVisible(true);
    }
    public static void main(String[] args) {
        new mouseLis();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }
}
