package Polymorphism;

public class TestPolymorphism {
    public static void main(String[] args){
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        animal.emitSound();
        cat.emitSound();
        dog.emitSound();
    }
}
