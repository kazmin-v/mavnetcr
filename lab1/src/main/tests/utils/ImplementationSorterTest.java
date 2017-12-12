package utils;

import entities.Person;
import org.joda.time.LocalDate;
import org.junit.Test;
import repositories.RepositPerson;

import static org.junit.Assert.*;

public class ImplementationSorterTest {
    @Test
    public void implementationSort() throws Exception {
        Person v = new Person("v", new LocalDate(1995,5,5));
        Person a = new Person("a", new LocalDate(1995,6,7));
        Person c = new Person("c", new LocalDate(1995,6,7));
        Person b = new Person("b", new LocalDate(1995,6,7));
        RepositPerson personRepository = new RepositPerson();
        personRepository.add( v);
        personRepository.add(a);
        personRepository.add(c);
        personRepository.add(b);
        PersonByFioComporator comporator = new PersonByFioComporator();
        ImplementationSorter sorter = new ImplementationSorter();
        sorter.implementationSort(personRepository, comporator);
        assertEquals(personRepository.getByIndex(0), a );
        assertEquals(personRepository.getByIndex(1), b);
        assertEquals(personRepository.getByIndex(2), c );
        assertEquals(personRepository.getByIndex(3), v );
    }

}