/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions_stokley_vance;

import java.util.Scanner;

/**
 *
 * @author roust
 */
public class IllegalTriangleException {}
    class Triangle implements Geo
{
   private double side1 = 1.0, side2 =1.0 , side3 =1.0;

    public Triangle(double side1, double side2, double side3)  {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double getArea()
    {
        double s = (side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    @Override
    public double getPerimeter()
    {
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle{" + "side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + '}';
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter three sides: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        Triangle triangle = new Triangle (side1, side2, side3);
        System.out.println("the area is " +triangle.getArea());
        System.out.println("the permiter is"
        +triangle.getPerimeter());
        System.out.println(triangle);

    }}
interface Geo {
    double getArea();
    public double getPerimeter();
            
}

