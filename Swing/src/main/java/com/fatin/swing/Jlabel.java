package com.fatin.swing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

public class Jlabel extends JFrame{
    private ImageIcon icon;
    private Container c;
    private JLabel jl,jl2;
    // private Jlabel imgLabel;
    private Font f;
    Jlabel(){
        this.icon = new ImageIcon(getClass().getResource("FN.png"));
        this.setIconImage(icon.getImage());
        
        c = this.getContentPane();
        c.setBackground(Color.CYAN);
        c.setLayout(null);

        f = new Font("Arial", Font.BOLD, 18);
        
        jl = new JLabel();
        jl.setText("Enter your name: ");
        jl.setBounds(50, 20, 200, 50);
        jl.setFont(f);
        jl.setForeground(Color.RED);
        jl.setOpaque(true); // for background color
        jl.setBackground(Color.GREEN);
        jl.setToolTipText("Enter your name here");
        c.add(jl);

        // System.out.println(jl.getToolTipText());

        jl2 = new JLabel("Enter your password: ");
        jl2.setBounds(50, 70, 200, 50);
        jl2.setFont(f);
        c.add(jl2);

        // imgLabel = new JLabel(icon);
        // imgLabel.setBounds(50, 150, icon.getIconWidth(), icon.getIconHeight());
        // c.add(imgLabel);

    }
    public static void main(String[] args) {
        Jlabel frame = new Jlabel();
        frame.setVisible(true);
        frame.setBounds(100, 100, 1000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}
