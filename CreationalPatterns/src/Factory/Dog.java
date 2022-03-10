package Factory;

public class Dog extends Animal{

    public Dog(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    void makeSound() {
        System.out.println("Dog named: " + super.getName() + " barks.");
    }
}
