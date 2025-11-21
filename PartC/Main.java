/****************************************************************************************
 * @File: Main.java
 * @author: Shedrick Williams
 * @since: 11-20-2025
 * 
 * Description: Main class that tests the CourseGrade class.
****************************************************************************************/

package PartC;

public class Main {

    public static void main(String[] args) {

        //test data
        CourseGrade g1 = new CourseGrade(90);
        CourseGrade g2 = new CourseGrade(90);
        CourseGrade g3 = new CourseGrade(75);

        // 1) Equality operator (same exact reference or not?)
        System.out.println((g1 == g2) ? "Same object" : "Different objects"); //Different objects

        CourseGrade g4 = g1;
        System.out.println((g1 == g4) ? "Same object" : "Different objects"); // Same object

        //2) equals(Object o) using our custom implementation
        System.out.println(g1.equals(g2));      //true (same score): true
        System.out.println(g1.equals(g3));      //false (different score): false
        System.out.println(g1.equals("Hello")); //false (incompatible types): false

        //3) compareTo(Object o) using our custom implementation
        System.out.println(g1.compareTo(g2));   // Same score so: 0
        System.out.println(g1.compareTo(g3));   // Score difference (this - other): 15
        System.out.println(g3.compareTo(g1));   // Score difference (this - other): -15
        System.out.println(g1.compareTo("Hi")); // WARNING: cannot compare different types: -999999
    }
}
