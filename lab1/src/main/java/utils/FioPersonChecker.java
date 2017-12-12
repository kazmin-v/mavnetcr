package utils;

import entities.Person;

public class FioPersonChecker implements PersonChecker {
    public boolean check(Person p, Object v) {
        return p.getLastName().equals(v);
    }
}
