package utils;

import entities.Person;

public class PersonByBirthDateComporator  implements PersonComporator {
    public int comapare(Person p1, Person p2) {
        return p1.getBirthdate().compareTo(p2.getBirthdate());
    }
}
