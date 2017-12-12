package repositories;

import entities.Person;
import org.joda.time.LocalDate;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepositPersonTest {
    @Test
    public void length() throws Exception {
        Person petrov = new Person("Petrov", new LocalDate(1995,5,5));
        Person turchinsky = new Person("Turchinsky", new LocalDate(1995,6,7));
        Person turchinsky1 = new Person("Turchinsky", new LocalDate(1995,6,7));
        Person turchinsky2 = new Person("Turchinsky", new LocalDate(1995,6,7));
        RepositPerson personRepository = new RepositPerson();
        personRepository.add(petrov);
        personRepository.add(turchinsky);
        personRepository.add(turchinsky1);
        Integer len = 3;
        assertEquals(personRepository.length(), len );

    }

    @Test
    public void add() throws Exception {
        Person petrov = new Person("Petrov", new LocalDate(1995,5,5));
        Person turchinsky = new Person("Turchinsky", new LocalDate(1995,6,7));
        Person turchinsky1 = new Person("Turchinsky", new LocalDate(1995,6,7));
        RepositPerson personRepository = new RepositPerson();
        personRepository.add(petrov);
        assertEquals(personRepository.length(), (Integer) 1);
        assertEquals(petrov, personRepository.getByIndex(0));

        personRepository.add(turchinsky);
        assertEquals(personRepository.length(), (Integer) 2);
        assertEquals(petrov, personRepository.getByIndex(0));
        assertEquals(turchinsky, personRepository.getByIndex(1));

        personRepository.add(turchinsky1);
        assertEquals(personRepository.length(), (Integer)3);
        assertEquals(petrov, personRepository.getByIndex(0));
        assertEquals(turchinsky, personRepository.getByIndex(1));
        assertEquals(turchinsky1, personRepository.getByIndex(2));

    }

    @Test
    public void deleteByIndex() throws Exception {
        Person petrov = new Person("Petrov", new LocalDate(1995,5,5));
        Person turchinsky = new Person("Turchinsky", new LocalDate(1995,6,7));
        Person turchinsky1 = new Person("Turchinsky", new LocalDate(1995,6,7));
        RepositPerson personRepository = new RepositPerson();
        personRepository.add(petrov);
        personRepository.add(turchinsky);
        personRepository.add(turchinsky1);

        Integer len3 = 3;
        assertEquals(personRepository.length(), len3);
        assertEquals(petrov, personRepository.getByIndex(0));
        assertEquals(turchinsky, personRepository.getByIndex(1));
        assertEquals(turchinsky1, personRepository.getByIndex(2));

        personRepository.deleteByIndex(1);
        Integer len2 = 2;
        assertEquals(personRepository.length(), len2);
        assertEquals(petrov, personRepository.getByIndex(0));
        //assertEquals(turchinsky, personRepository.getByNum(0));
        assertEquals(turchinsky1, personRepository.getByIndex(1));

    }

    @Test
    public void searchByFio() throws Exception {
        Person petrov = new Person("Petrov", new LocalDate(1995,5,5));
        Person turchinsky = new Person("Turchinsky", new LocalDate(1995,6,7));
        Person turchinsky1 = new Person("Turchinsky", new LocalDate(1995,6,7));
        RepositPerson personRepository = new RepositPerson();
        personRepository.add(petrov);
        personRepository.add(turchinsky);
        personRepository.add(turchinsky1);
        assertEquals(personRepository.searchByFio("Petrov").getByIndex(0), petrov);

    }

    @Test
    public void searchByBirthdate() throws Exception {
        LocalDate dateToTest= new LocalDate(1995, 5,5);
        Person petrov = new Person("Petrov", dateToTest);
        Person turchinsky = new Person("Turchinsky", new LocalDate(1995,6,7));
        Person turchinsky1 = new Person("Turchinsky", new LocalDate(1995,6,7));
        RepositPerson personRepository = new RepositPerson();
        personRepository.add(petrov);
        personRepository.add(turchinsky);
        personRepository.add(turchinsky1);
        assertEquals(personRepository.searchByBirthdate(dateToTest).getByIndex(0), petrov);

    }

    @Test
    public void searchById() throws Exception{
        LocalDate dateToTest= new LocalDate(1995, 5,5);
        Person petrov = new Person("Petrov", dateToTest);
        Person turchinsky = new Person("Turchinsky", new LocalDate(1995,6,7));
        Person turchinsky1 = new Person("Turchinsky", new LocalDate(1995,6,7));
        RepositPerson personRepository = new RepositPerson();
        personRepository.add(petrov);
        personRepository.add(turchinsky);
        personRepository.add(turchinsky1);
        assertEquals(personRepository.searchById(petrov.getId()).getByIndex(0), petrov);
    }

}