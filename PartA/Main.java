/****************************************************************************************
 * @File: Main.java
 * @author: Shedrick Williams
 * @since: 11-14-2025
 * 
 * Description: Example that demonstrates super\sub class access.
****************************************************************************************/

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  //Woof!
        dog.fetch();      //Dog is fetching a ball.

        //Superclass reference → superclass object
        Animal animal = new Animal();
        animal.makeSound(); // Animal sound

        //up-cast type Dog and type Cat to type Animal
        Animal pet1 = new Dog();
        Animal pet2 = new Cat();

        pet1.makeSound();    // Woof!   dynamic bound and uses Dog version)
        pet2.makeSound();    // Meow!   dynamically bound and uses Cat version)

        //pet1.fetch();     // ERROR because pet1 is in the namespace of Animal and Animal does not have the method fetch
        //pet2.scratch();   // ERROR because pet2 is in the namespace of Animal and Animal does not have the method scratch

        //Dog badDog = new Animal();   // Exception: cannot up-cast Animal to Dog
        //Cat badCat = new Dog();      // Exception: cannot up-cast Dog to Cat (Cat & Dog are siblings)
    }
}