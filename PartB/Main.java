/****************************************************************************************
 * @File: Main.java
 * @author: Shedrick Williams
 * @since: 11-14-2025
 * 
 * Description: Example that demonstrates up\down casting.
****************************************************************************************/

package PartB;

public class Main {

    public static void main(String[] args) {

        //Subclass reference → subclass object
        Circle circle = new Circle(5.0);
        circle.draw();              //Drawing a circle with radius 5.0
        System.out.println(circle.getRadius());

        Shape shape = circle;       //implicit up-casting Circle → Shape
        shape.draw();               //Still calls Circle.draw() (dynamic binding makes shape of type Circle, the type it was initialized as)
        //shape.getRadius();       //ERROR at compile time: getRadius() not in Shape although dynamically bound, the namespace was made to be of type Shape

        //This is successful because Shape shape was initialized as a Circle, so it can be down-casted to a Circle
        if (shape instanceof Circle) {
            Circle circle2 = (Circle) shape;      //explicit down-cast
            System.out.println(circle2.getRadius()); //successful
        }

        //Error on this down-cast
        Shape plainShape = new Shape();
        // Circle wrongCircle = (Circle) plainShape; //gives a runtime error because the namespace was made to be of type Shape and will not include Circle
    }
}
