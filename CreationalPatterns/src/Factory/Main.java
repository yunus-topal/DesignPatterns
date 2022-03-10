package Factory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        Animal a1 = factory.createAnimal("Dog", "Karabaş", 5,15);
        Animal a2 = factory.createAnimal("Cat", "Zeytin", 3, 7);

        a1.showInfo();
        a2.showInfo();
        a1.makeSound();
        a2.makeSound();

    }
}
