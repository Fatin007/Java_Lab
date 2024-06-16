package com.fatin.swing;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyListener extends JFrame implements KeyListener{
    JLabel l;
    keyListener(){
        setSize(400,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
        
        l=new JLabel();
        l.setBounds(0,0,100,100);
        l.setBackground(Color.red);
        l.setOpaque(true);
        add(l);
        setVisible(true);
    } 
    public static void main(String[] args) {
        new keyListener();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()){
            case 'w':
                l.setLocation(l.getX(),l.getY()-10);
                break;
            case 'a':
                l.setLocation(l.getX()-10,l.getY());
                break;
            case 's':
                l.setLocation(l.getX(),l.getY()+10);
                break;
            case 'd':
                l.setLocation(l.getX()+10,l.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_UP:
                l.setLocation(l.getX(),l.getY()-10);
                break;
            case KeyEvent.VK_LEFT:
                l.setLocation(l.getX()-10,l.getY());
                break;
            case KeyEvent.VK_DOWN:
                l.setLocation(l.getX(),l.getY()+10);
                break;
            case KeyEvent.VK_RIGHT:
                l.setLocation(l.getX()+10,l.getY());
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // System.out.println("Key Released "+e.getKeyChar());
        System.out.println("Key Released "+e.getKeyCode());
    }
}
