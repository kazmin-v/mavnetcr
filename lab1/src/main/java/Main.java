import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Person petrov = new Person("Petrov", new LocalDate(1995,5,5));
        Person turchinsky = new Person("Turchinsky", new LocalDate(1995,6,7));
        Person turchinsky1 = new Person("Turchinsky", new LocalDate(1995,6,7));
        RepositPerson personRepository = new RepositPerson();
        personRepository.add(petrov);
        personRepository.add(turchinsky);
        personRepository.add(turchinsky1);
        System.out.println(personRepository.getByAge(22).length());

        nhfhfhfhdafkdhfak



    }
}
