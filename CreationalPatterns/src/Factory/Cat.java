package Factory;

public class Cat extends Animal{
    public Cat(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    void makeSound() {
        System.out.println("Cat named: " + super.getName() + " meows.");
    }
}
