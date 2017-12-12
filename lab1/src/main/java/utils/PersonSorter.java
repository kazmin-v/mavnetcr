package utils;

import entities.Person;
import repositories.RepositPerson;

public interface PersonSorter {
    public void sort(RepositPerson arr, PersonComporator comporator);
}
