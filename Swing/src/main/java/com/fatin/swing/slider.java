package com.fatin.swing;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class slider extends JFrame implements ChangeListener{
    JSlider slider;
    JLabel label;

    slider(){
        label = new JLabel();
        label.setSize(new Dimension(200,200));
        label.setOpaque(true);
        
        
        slider = new JSlider(0,100,50);
        slider.setBounds(100,100,50,200);
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(25);
        slider.addChangeListener(this);
        label.setText("Celsius = "+slider.getValue());
        
        setTitle("Temperature Slider");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(500,500));
        setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 10));
        setVisible(true);
        add(slider);
        add(label);
        
        }        
        public static void main(String[] args) {
            new slider();
        }
        @Override
        public void stateChanged(ChangeEvent e) {
            label.setText("Celsius = "+slider.getValue());
        }
}
