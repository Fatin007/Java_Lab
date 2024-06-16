package com.fatin.swing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MenuBar extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu file,edit,help;
    JMenuItem cut,copy,paste,selectAll,save,open,exit;
    MenuBar(){
        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        mb.add(file);
        mb.add(edit);
        mb.add(help);
        
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectAll = new JMenuItem("Select All");
        save = new JMenuItem("Save");
        open = new JMenuItem("Open");
        exit = new JMenuItem("Exit");

        file.add(cut);
        file.add(copy);
        file.add(paste);
        file.add(selectAll);
        file.add(save);
        file.add(open);
        file.add(exit);

        file.setMnemonic(KeyEvent.VK_F);
        edit.setMnemonic(KeyEvent.VK_E);
        help.setMnemonic(KeyEvent.VK_H);        

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
        save.addActionListener(this);
        open.addActionListener(this);
        exit.addActionListener(this);

        cut.setMnemonic(KeyEvent.VK_X);
        copy.setMnemonic(KeyEvent.VK_C);
        paste.setMnemonic(KeyEvent.VK_V);
        selectAll.setMnemonic(KeyEvent.VK_A);
        save.setMnemonic(KeyEvent.VK_S);
        open.setMnemonic(KeyEvent.VK_O);
        exit.setMnemonic(KeyEvent.VK_E);

        setJMenuBar(mb);
        setSize(500,300);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new MenuBar();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cut){
            JOptionPane.showMessageDialog(this,"Cut");
        }
        if(e.getSource()==copy){
            JOptionPane.showMessageDialog(this,"Copy");
        }
        if(e.getSource()==paste){
            JOptionPane.showMessageDialog(this,"Paste");
        }
        if(e.getSource()==selectAll){
            JOptionPane.showMessageDialog(this,"Select All");
        }
        if(e.getSource()==save){
            JOptionPane.showMessageDialog(this,"Save");
        }
        if(e.getSource()==open){
            JOptionPane.showMessageDialog(this,"Open");
        }
        if(e.getSource()==exit){
            System.exit(0);
        }
    }
}
