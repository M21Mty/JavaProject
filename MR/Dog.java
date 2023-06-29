package MR;
import java.time.LocalDate;


public class Dog {

    String name;
    LocalDate birthday;
    String breed;
   
   
    //Dog (String name, LocalDate birthday){
      //  this.name = name;
        //this.birthday = birthday;
    //}

    Dog (String name, int year, int mouth, int day, String breed){
        this.name = name;
        this.birthday = LocalDate.of(year,mouth,day);
        this.breed = breed;
    }

    static Dog of(String name, String breed) {
        return new Dog (name, LocalDate.now(), breed);
    }


    @Override
    public String toString() {
        return "dog: " + name + ";" + breed + ";" + birthday ;
    }
}

