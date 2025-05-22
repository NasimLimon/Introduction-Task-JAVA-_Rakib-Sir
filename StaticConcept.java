public class StaticConcept { // Parent class
    static class Animal {
        void eat() {
            System.out.println("This animal eats food.");
        }
    }

    // Child class
    static class Dog extends Animal {
        void bark() {
            System.out.println("The dog barks.");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); // inherited from Animal
        d.bark(); // own method
    }
}

// OR

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class StaticConcept {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); // inherited from Animal
        d.bark(); // own method
    }
}