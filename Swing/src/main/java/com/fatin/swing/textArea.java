package com.fatin.swing;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.Container;

public class textArea extends JFrame{
    private Container c;
    textArea(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        JTextArea ta = new JTextArea("Fuckkkk");
        ta.setBounds(50, 50, 300, 300);
        ta.setRows(69);
        ta.setColumns(69);
        ta.setLineWrap(true);
        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        ta.setCursor(cur);
        ta.scrollRectToVisible(getBounds());
        ta.setBackground(Color.YELLOW);
        ta.setForeground(Color.RED);
        ta.setFont(new Font("Cascadia Code", Font.BOLD+Font.ITALIC, 16));
        c.add(ta);

        JPasswordField pf = new JPasswordField();
        pf.setBounds(50,350,100,50);
        pf.setBackground(Color.GREEN);
        Border border=new Border() {

            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                throw new UnsupportedOperationException("Unimplemented method 'paintBorder'");
            }

            @Override
            public Insets getBorderInsets(Component c) {
                throw new UnsupportedOperationException("Unimplemented method 'getBorderInsets'");
            }

            @Override
            public boolean isBorderOpaque() {
                throw new UnsupportedOperationException("Unimplemented method 'isBorderOpaque'");
            }
        };
        border = BorderFactory.createLineBorder(Color.RED, 5);
        pf.setBorder(border);
        c.add(pf);

    }
    public static void main(String[] args) {
        textArea frame = new textArea();
        frame.setVisible(true);
        frame.setBounds(50, 50, 900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Bakchodi!!!!");
    }
}
