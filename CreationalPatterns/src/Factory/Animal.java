package Factory;

public abstract class Animal {
    private String name;
    private int age;
    private int weight;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void showInfo(){
        System.out.println("Animal information:");
        System.out.println("name:" + name);
        System.out.println("age: " + age);
        System.out.println("weight: " + weight);
    }

    abstract void makeSound();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
}
