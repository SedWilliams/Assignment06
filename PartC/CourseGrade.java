/****************************************************************************************
 * @File: CourseGrade.java
 * @author: Shedrick Williams
 * @since: 11-20-2025
 * 
 * Description: CourseGrade class that implements Comparable. The comparable interface 
 * provides us access to the compare and equal methods which we override in this class.
****************************************************************************************/

package PartC;

public class CourseGrade implements Comparable<Object> {

    //immutable
    private final int SCORE;

    /*****************************************************************
     * Contructor(s)
     *****************************************************************/

    /***********************************************
     * @Constuctor for CourseGrade
     * @param score 
     * 
     * @description creates CourseGrade and initializes
     * an integer property that holds the score
     **********************************************/
    public CourseGrade(int score) {
        this.SCORE = score;
    }

    /******************************************
     * Methods
     ******************************************/

    /******************************************************
     * Custom implementation of pre-defined equals() method
     ******************************************************/
    @Override
    public boolean equals(Object o) {

        // early return if objects are different types, and givemeaningful print statement
        if (!(o instanceof CourseGrade)) {
            System.out.print("false (incompatible types): ");
            return false;
        }

        //implementation for checking the properties of the compared objects for equality

        //dynamically bind the object passed as parameter to the CourseGrade type
        CourseGrade objArgument = (CourseGrade) o;

        boolean sameScore = this.SCORE == objArgument.SCORE; // false if the score properties have different values

        //if objects have the same score value, return true
        if (sameScore) {
            System.out.print("true (same score): ");
            return true;
        } else {
            System.out.print("false (different score): ");
            return false;
        }
    }

    /******************************************************
     * Custom implementation of pre-defined compareTo() method
     ******************************************************/
    @Override
    public int compareTo(Object o) {

        // Early return if objects are different types, and give meaningful print statement
        if (!(o instanceof CourseGrade)) {
            System.out.print("WARNING: cannot compare different types: ");
            return -999999;   // special "error" code
        }

        //dynamically bind the object passed as parameter to the CourseGrade type
        CourseGrade objArgument = (CourseGrade) o;

        //implementation for checking the properties of the compared objects for equality
        boolean sameScore = this.SCORE == objArgument.SCORE; // false if the score properties have different values

        //if objects have the same score value, return 0 otherwise return the difference between the scores
        if (sameScore) {
            System.out.print("Same score so: ");
            return 0;
        } else {
            System.out.print("Score difference (this - other): ");
            return this.SCORE - objArgument.SCORE; // >0, <0
        }
    }
}