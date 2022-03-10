package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cat("Zeytin", 10,3);
        Animal a2 = new Dog("Paşa", 15,6);

        a1.showInfo();
        System.out.println();
        a2.showInfo();
        System.out.println();
        a1.makeSound();
        System.out.println();
        a2.makeSound();

    }
}
