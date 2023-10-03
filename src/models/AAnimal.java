package models;

// Abstract Class - marked by keyword: abstract
// Can inherit from both: Interface & Abstract classes

// TODO - Test visibility mod
public abstract class AAnimal {
  // Includes abstract, excludes body: {}
    public abstract void eat();

    // Ordinary body
    public void makeSound () {
        System.out.println("Some random animal noise");
    }
}
