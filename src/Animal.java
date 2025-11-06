public class Animal {
    void makeSound() {
        System.out.println("make a voice");
    }

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound();
        a2.makeSound();
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Hav Hav!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Miyav!");
    }
}
