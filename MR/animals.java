package MR;

import java.time.LocalDate;

public class animals {
    public static void main(String[] args) {
        
        Dog newDog = new Dog("Rex", 2020, 4, 16, "Retriver" );

        Person newPerson = new Person("Alex", "Jaison", "Rex", "Retriver" );
        
        System.out.print(newDog);
        System.out.print(newPerson);

    }

}
