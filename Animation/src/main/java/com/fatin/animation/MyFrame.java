package com.fatin.animation;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author MOHAMMAD FATIN NUR
 */
public class MyFrame extends JFrame{
    MyPannel panel;
    MyFrame(){
        panel = new MyPannel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
