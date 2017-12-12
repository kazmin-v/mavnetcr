package entities;

import org.joda.time.LocalDate;
import org.joda.time.Years;

import java.util.UUID;

/**
 * Class with only one person
*/
public class Person {
  private String lastName;
  private String id;
  private LocalDate birthdate;

    /**
     * Constructors
     */
    public Person(){}
    public Person (String lm, LocalDate bd){
        lastName = lm;
        id =  UUID.randomUUID().toString();
        birthdate = bd;
    }
    public Person(String lm, String id, LocalDate bd){
        lastName = lm;
        this.id = id;
        birthdate = bd;
    }
    public Person(Person p){
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

    /**
     *
     * @return count of ears betwenn Person's birthdate and today
     */
    public int getAge(){
        return Years.yearsBetween(this.birthdate, LocalDate.now()).getYears();

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
