/****************************************************************************************
 * @File: Circle.java
 * @author: Shedrick Williams
 * @since: 11-14-2025
 * 
 * Description: Circle class that extends Shape.
****************************************************************************************/

package PartB;

public class Circle extends Shape {
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }

    public double getRadius() {
        return radius;
    }
}
