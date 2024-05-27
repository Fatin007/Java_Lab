package com.fatin.quadrilateral;

/**
 *
 * @author MOHAMMAD FATIN NUR
 */
public class Square extends Quadrilateral{

    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }
    
    public float area(){
        float ab = getLength(getP1(),getP2());
        return ab*ab;
    }
}
