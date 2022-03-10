package TemplateMethod;

public class Cat extends Animal{
    public Cat(String name, int weight, int age) {
        super(name, weight, age);
    }

    @Override
    void makeSound() {
        System.out.println("Cat " + name + " meows.");
    }
}
