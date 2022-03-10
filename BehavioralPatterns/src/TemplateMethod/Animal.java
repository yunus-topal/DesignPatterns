package TemplateMethod;

public abstract class Animal {
    protected String name;
    protected int weight;
    protected int age;

    public Animal(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    abstract void makeSound();

    public void showInfo(){
        System.out.println("Animal name: " + name);
        System.out.println("Animal weight: " + weight);
        System.out.println("Animal age: " + age);
    }
}
