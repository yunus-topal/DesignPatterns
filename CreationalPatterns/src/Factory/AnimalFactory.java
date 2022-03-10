package Factory;

public class AnimalFactory {

    public Animal createAnimal(String type, String name, int age, int weight){
        if(type.equals("Dog")){
            return new Dog(name, age, weight);
        }
        else if(type.equals("Cat")){
            return new Cat(name, age, weight);
        }
        else{
            return null;
        }
    }
}
