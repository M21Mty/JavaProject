package MR;

public class Person {

    String name;
    String surname;
    String nameDog;
    String breedDog;

    Person (String name, String surname, String nameDog, String breedDog){
        this.name = name;
        this.surname = surname;
        this.nameDog = nameDog;
        this.breedDog = breedDog;
    }

    static Person of(String name, String surname, String nameDog, String breedDog) {
        return new Person(name, surname, nameDog, breedDog);
    }


    @Override
    public String toString() {
        return "\nperson: " + name + " " + surname +"; Dog:"+ nameDog + ";" + breedDog ;
    }
    
}
