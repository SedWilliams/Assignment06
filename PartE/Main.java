/****************************************************************************************
 * @File: Main.java
 * @author: Shedrick Williams
 * @since: 11-14-2025
 * 
 * Description: Example that demonstrates the use of cross package inheritance.
****************************************************************************************/

//this is the namespace for Main.java
package PartE;
//all definitions within Package PartE are accessible to Main.java

//importing a class from a different package
import PartB.Shape;

public class Main {
    public static void main(String[] args) {

        //this is successful because SamePackage is in the same package as Main.java and does not need to be imported
        SamePackage samePackage = new SamePackage();
        samePackage.printMessage();

        //this is successful because Shape is in the PartB package and was imported into Main.java
        Shape shape = new Shape();
        shape.draw();

    }
}
