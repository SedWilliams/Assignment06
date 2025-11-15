/****************************************************************************************
 * @File: Dog.java
 * @author: Shedrick Williams
 * @since: 11-14-2025
 * 
 * Description: Dog class that extends Animal.
****************************************************************************************/

public class Dog extends Animal {

    public void makeSound() { // overrides Animal.makeSound
        System.out.println("Woof!");
    }

    public void fetch() {     // method only in Dog
        System.out.println("Dog is fetching a ball.");
    }
}