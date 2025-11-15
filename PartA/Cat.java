/****************************************************************************************
 * @File: Cat.java
 * @author: Shedrick Williams
 * @since: 11-14-2025
 * 
 * Description: Cat class that extends Animal.
****************************************************************************************/

public class Cat extends Animal {

    @Override
    public void makeSound() { // overrides Animal.makeSound
        System.out.println("Meow!");
    }

    public void scratch() {   // method only in type Cat
        System.out.println("Cat is scratching.");
    }
}