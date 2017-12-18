package utils;

import entities.Person;

/**
 * Возвращает равно или не равно поле персоны заданной дате
 */

public class BirthdatePersonChecker implements PersonChecker {
    public boolean check(Person p, Object v) {
        return p.getBirthdate().equals(v);
    }
}