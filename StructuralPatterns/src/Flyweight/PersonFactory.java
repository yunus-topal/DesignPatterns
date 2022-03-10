package Flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PersonFactory {
    static Map<Integer, PersonType> personTypes = new HashMap<>();

    public static PersonType getPersonType(int id,String sprite, int height, int weight ) {
        PersonType personType = personTypes.get(id);
        if (personType == null) {
            personType = new PersonType(id, sprite, height, weight);
            personTypes.put(id, personType);
        }
        return personType;
    }
}
