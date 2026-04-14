package oop.Inheritance;
/*
We will have a parent class called LibraryItem and it will have attributes title, id and isAvaliable.
And will have a method called borrowItem(), returnItem() and displayInfo().

For the child class we will have a class named Book and will have extra attributes like author and numberOfPages. 
And will have an extra method called readSample(). This class will extend from the parent class.

We will have Another class named Magazine and it will have an extra attributes like issueNumber and publisher. 
And we will have an extra method like narrator and duration. This class will extend from the Parent class.
*/
class Animal {
    String Name;
    int Age;
    String Color;

    Animal(String Name, int Age, String Color){
        this.Name = Name;
        this.Age = Age;
        this.Color = Color;
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Roxy", 2, "Brown");

        System.out.println("The animal is: " + dog.Color);
        System.out.println("The animal is: " + dog.Name);
        System.out.println("The animal is: " + dog.Age);
    }
}
