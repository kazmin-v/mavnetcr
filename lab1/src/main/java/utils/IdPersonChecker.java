package utils;

import entities.Person;

public class IdPersonChecker implements PersonChecker {
    public boolean check(Person p, Object v) {
        return p.getId().equals(v);
    }
}