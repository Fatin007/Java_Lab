package com.fatin.quadrilateral;

/**
 *
 * @author MOHAMMAD FATIN NUR
 */
public class Trapezoid extends Quadrilateral {
    public Trapezoid(Point p1,Point p2,Point p3,Point p4){
        super(p1,p2,p3,p4);
    }

    public float perimeter(){
        float ab = getLength(getP1(),getP2());
        float bc = getLength(getP2(),getP3());
        float cd = getLength(getP3(),getP4());
        float da = getLength(getP4(),getP1());
        return ab+bc+cd+da;
    }
}
