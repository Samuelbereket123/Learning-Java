class Inheritance {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Inheritance {
    @Override
    void sound() {
        System.out.println("Woof Woof");
    }
}

class Main {
    void main() {
        Dog d1 = new Dog();
        d1.sound();
    }
}