package repositories;

import entities.Person;
import utils.PersonChecker;

public interface IRep<T> {
    public Integer length();
    public void add(T obj);
    public void deleteByIndex(int index);
    public void resize(int newLength);
    public Person getByIndex(int index);
    public void setByIndex(int index, T obj);
    public RepositPerson search(PersonChecker checker, Object v);
}
