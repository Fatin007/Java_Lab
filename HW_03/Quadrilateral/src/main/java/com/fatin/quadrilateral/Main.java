package com.fatin.quadrilateral;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Point A = new Point(7, 14);
        Point B = new Point(12, 22);
        Point C = new Point(25, 14);
        Point D = new Point(21, 6);
        
        Rectangle n = new Rectangle(A, B, C, D);
        System.out.printf("Area of Rectangle: %.2f\n\n", n.area());

        Parallelogram m = new Parallelogram(A, B, C, D);
        System.out.printf("Area of Parallelogram: %.2f\n\n", m.area());

        Point E = new Point(7, 4);
        Point F = new Point(7, 26);
        Point G = new Point(29, 26);
        Point H = new Point(29, 4);

        Square o = new Square(E, F, G, H);
        System.out.printf("Area of Square: %.2f\n\n", o.area());

        Point I = new Point(11, 6);
        Point J = new Point(19, 18);
        Point K = new Point(32, 18);
        Point L = new Point(28, 6);

        Trapezoid p = new Trapezoid(I, J, K, L);
        System.out.printf("Area of Trapezoid: %.2f\n\n", p.area());
    }
}
