import entities.Person;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import repositories.RepositPerson;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Person petrov = new Person("Petrov", new LocalDate(1995,5,5));
        Person turchinsky = new Person("Turchinsky", new LocalDate(1995,6,7));
        Person turchinsky1 = new Person("Turchinsky", new LocalDate(1995,6,7));
        RepositPerson personRepository = new RepositPerson();
        personRepository.add(petrov);
        personRepository.add(turchinsky);
        LocalDate date = new LocalDate(1995,5,5);
        System.out.println(personRepository.searchByBirthdate(date).getByIndex(0).getLastName());

    }
}
