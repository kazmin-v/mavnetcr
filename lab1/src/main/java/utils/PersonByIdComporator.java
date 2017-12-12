package utils;

import entities.Person;

public class PersonByIdComporator implements PersonComporator {
    public int comapare(Person p1, Person p2) {
        return p1.getId().compareTo(p2.getId());
    }
}
