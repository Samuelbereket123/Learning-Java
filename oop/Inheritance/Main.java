package oop.Inheritance;
/*
We will have a parent class called LibraryItem and it will have attributes title, id and isAvaliable.
And will have a method called borrowItem(), returnItem() and displayInfo().

For the child class we will have a class named Book and will have extra attributes like author and numberOfPages. 
And will have an extra method called readSample(). This class will extend from the parent class.

We will have Another class named Magazine and it will have an extra attributes like issueNumber and publisher. 
And we will have an extra method like narrator and duration. This class will extend from the Parent class.
*/
class LibraryItem {
    String title;
    int id;
    boolean isAvaliable;
    
    LibraryItem(String title, int id) {
        this.title = title;
        this.id = id;
        this.isAvaliable = true;
    }

    void borrowItem() {
        if (isAvaliable) {
            isAvaliable = false;
            System.out.println(title + " has been borrowed");
        } else {
            System.out.println(title + " is not avaiblable");
        }
    }

    void returnItem(){
        isAvaliable = true;
        System.out.println(title + " is returned");
    }

    void DisplayInfo() {
        System.out.println("Title: " + title + " ID " + id);
    }
}


class Book extends LibraryItem {
    String author;
    int page;
}