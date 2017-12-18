package utils;

import entities.Person;

public class FioPersonChecker implements PersonChecker {
    /**
     * Возвращает равно или не равно поле персоны заданному фио
     * @param p персона
     * @param v сюда будет передаваться стринг
     * @return равно ли поле персоны заданному фио
     */
    public boolean check(Person p, Object v) {
        return p.getLastName().equals(v);
    }
}
