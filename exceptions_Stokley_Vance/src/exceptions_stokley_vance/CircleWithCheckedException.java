/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions_stokley_vance;

/**
 *
 * @author roust
 */
public class CircleWithCheckedException {
    private double radius;

    public CircleWithCheckedException() throws Exception
    {
    this(1.0);    
    }

    public CircleWithCheckedException(double radius)throws Exception {
        if (radius < 0)
            throw new Exception("radius can not be negative!");
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
            throws Exception
    {
        if (radius< 0)
            throw new Exception("radius cannot be negative");
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "CircleWithCheckedException{" + "radius=" + radius + '}';
    }
    public static void main(String[] args) {
        try{
            System.out.println(new CircleWithCheckedException(5));
            System.out.println(new CircleWithCheckedException(-5));
            System.out.println(new CircleWithCheckedException(10));
        }
        catch (Exception e)
        {
            System.err.println("An Exception Occured " + e.getMessage());
        }
    }
}
