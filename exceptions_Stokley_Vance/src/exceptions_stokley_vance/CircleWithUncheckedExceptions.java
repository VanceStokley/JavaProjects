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
public class CircleWithUncheckedExceptions {
    
    private double radius;

    public CircleWithUncheckedExceptions() {
        this(1.0);
    }

    public CircleWithUncheckedExceptions(double radius) {
        if (radius<0)
            throw new IllegalArgumentException("radius cannot be negative");
        this.radius = radius;
    }
    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
         if (radius<0)
            throw new IllegalArgumentException("radius cannot be negative");
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "CircleWithUncheckedExceptions{" + "radius=" + radius + '}';
    }
    public static void main(String[] args) {
      try {
          System.out.println(new CircleWithUncheckedExceptions(5));
          System.out.println(new CircleWithUncheckedExceptions(-5));
          System.out.println(new CircleWithUncheckedExceptions(10));
      }
      catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }

}
