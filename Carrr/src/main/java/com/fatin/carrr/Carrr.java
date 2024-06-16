package com.fatin.carrr;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.*;

public class Carrr {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Carrr");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);

        // System.out.println();
        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        CarCompany c1 = new CarCompany();
        // c1.addCar("Toyota", "Axio", 2013);
        JLabel jl = new JLabel();
        jl.setText("Car added successfully!!");
        jl.setBounds(50, 20, 200, 30);
        c.add(jl);
        JLabel label1 = new JLabel();
        label1.setText(c1.addCar("Toyota", "Axio", 2013));
        label1.setBounds(50, 50, 400, 30);
        c.add(label1);


        CarCompany c2 = new CarCompany();
        // c2.addCar("Toyota", "Axio", 2013, "Black");
        JLabel jl2 = new JLabel();
        jl2.setText("Car added successfully!!");
        jl2.setBounds(50, 80, 200, 30);
        c.add(jl2);
        JLabel label2 = new JLabel();
        label2.setText(c2.addCar("Toyota", "Axio", 2013, "Black"));
        label2.setBounds(50, 110, 400, 30);
        c.add(label2);

        CarCompany c3 = new CarCompany();
        // c3.addCar("BMW", "i8", 2017, 1000000000);
        JLabel jl3 = new JLabel();
        jl3.setText("Car added successfully!!");
        jl3.setBounds(50, 140, 200, 30);
        c.add(jl3);
        JLabel label3 = new JLabel();
        label3.setText(c3.addCar("BMW", "i8", 2017, 1000000000));
        label3.setBounds(50, 170, 400, 30);
        c.add(label3);

        CarCompany c4 = new CarCompany();
        // c4.addCar("BMW", "i8", 2017, "White", 1000000000);
        JLabel jl4 = new JLabel();
        jl4.setText("Car added successfully!!");
        jl4.setBounds(50, 200, 200, 30);
        c.add(jl4);
        JLabel label4 = new JLabel();
        label4.setText(c4.addCar("BMW", "i8", 2017, "White", 1000000000));
        label4.setBounds(50, 230, 400, 30);
        c.add(label4);
    }
}
