package com.fatin.swing;

import java.awt.*;
import java.awt.Container;
import javax.swing.*;

public class textfield extends JFrame {
    private Container c;
    private JTextField tf1, tf2;
    private Font f;

    textfield(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        f = new Font("Cascadia Code", Font.BOLD+Font.ITALIC, 16);

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 200, 50);
        tf1.setFont(f);
        tf1.setBackground(Color.YELLOW);
        tf1.setForeground(Color.RED);
        c.add(tf1);

        tf2 = new JTextField();
        // tf2.setText("Hello, World!");
        tf2.setBounds(50, 120, 200, 50);
        tf2.setFont(f);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf2);

    }

    public static void main(String[] args) {
        textfield frame = new textfield();
        frame.setVisible(true);
        frame.setBounds(50, 50, 900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
