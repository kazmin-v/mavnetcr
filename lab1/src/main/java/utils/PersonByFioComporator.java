package utils;

import entities.Person;

public class PersonByFioComporator implements PersonComporator {
    public int comapare(Person p1, Person p2) {
        return p1.getLastName().compareTo(p2.getLastName());
    }
}
