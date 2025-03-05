package overriding;

// Base Class
class Animal {
    void move() {
        System.out.println("Animal is moving");
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}

// Subclass
class Dog extends Animal {
    @Override
    void move() {
        System.out.println("Dog is running!");
    }

    void barking() {
        System.out.println("Dog is barking!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog poppy = new Dog();
        poppy.move();
        poppy.barking();
    }
}
