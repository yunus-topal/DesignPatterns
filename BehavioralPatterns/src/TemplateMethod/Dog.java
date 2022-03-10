package TemplateMethod;

public class Dog extends Animal{
    public Dog(String name, int weight, int age) {
        super(name, weight, age);
    }

    @Override
    void makeSound() {
        System.out.println("Dog " + name + " barks.");
    }
}
