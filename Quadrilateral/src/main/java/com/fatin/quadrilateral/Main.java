package com.fatin.quadrilateral;

/**
 *
 * @author MOHAMMAD FATIN NUR
 */
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(0, 4);
        Point p4 = new Point(3, 4);
        
        Parallelogram m = new Parallelogram(p1, p2, p3, p4, 4);
        System.out.println("Area of Parallelogram: " + m.area());

        Rectangle n = new Rectangle(p1, p2, p3, p4);
        System.out.println("Area of Rectangle: " + n.area());

        Square o = new Square(p1, p3, new Point(0, 4), new Point(4, 4));
        System.out.println("Area of Square: " + o.area());

        Trapezoid p = new Trapezoid(p1, p2, p3, p4);
        System.out.println("Perimeter of Trapezoid: " + p.perimeter());
    }
}
