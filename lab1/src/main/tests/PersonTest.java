import org.joda.time.LocalDate;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void getAge() throws Exception {
        Person petrov = new Person("Petrov", new LocalDate(1995,5,5));
        assertEquals(petrov.getAge(), 22 );
    }

}