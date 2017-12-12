package utils;

import entities.Person;

/**
 * Возвращает 
 */

public class BirthdatePersonChecker implements PersonChecker {
    public boolean check(Person p, Object v) {
        return p.getBirthdate().equals(v);
    }
}