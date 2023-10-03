package models;

// Abstract - Inheritance (arv)
public interface Animal {
    /* TODO -Give relevant names
            -Implement Inheritance
            -Private vis/mod
            -
     */
    void name();


    // As a standard, methods are 'Public'
    // Abstract method
    // Use keyword: implements
    void move();

    void eat();

    void sleep();

    void makeSound();


    // Default
    default void typeOfAnimal(String typeOfAnimal) {
        System.out.println(typeOfAnimal);

    }
}
