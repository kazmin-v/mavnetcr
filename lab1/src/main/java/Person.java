import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Years;

import java.util.UUID;


public class Person {
    String lastName;
    String id;
    LocalDate birthdate;
    Person (String lm, LocalDate bd){
        lastName = lm;
        id =  UUID.randomUUID().toString();
        birthdate = bd;
    }
    Person(String lm, String id, LocalDate bd){
        lastName = lm;
        this.id = id;
        birthdate = bd;
    }
    Person(Person p){
        lastName = p.lastName;
        id = p.id;
        birthdate = p.birthdate;
    }
    public String  getId(){
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthdate(){
        return birthdate;
    }

    public int getAge(){
        return Years.yearsBetween(this.birthdate, LocalDate.now()).getYears();

    }
}
