package utils;

import entities.Person;
import repositories.RepositPerson;

/**
 * Класс с сортировкой пузырьком
 *
 */
public class BubbleSorter implements PersonSorter {
    /**
     * Сортирует пузрьком по заданному компоратору(по фио, дате или id)
     * @param arr
     * @param comporator
     */
    public void sort(RepositPerson arr, PersonComporator comporator) {
        Person t = new Person();
        for (int i = arr.length() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                    if(comporator.comapare(arr.getByIndex(j), arr.getByIndex(j+1)) > 0) {
                    t = arr.getByIndex(j);
                    arr.setByIndex(j,arr.getByIndex(j+1));
                    arr.setByIndex(j+1, t);
                }
            }
        }
    }
}
