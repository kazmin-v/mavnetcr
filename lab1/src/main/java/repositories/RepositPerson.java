package repositories;
import entities.Person;
import org.joda.time.LocalDate;
import utils.BirthdatePersonChecker;
import utils.FioPersonChecker;
import utils.IdPersonChecker;
import utils.PersonChecker;

/**
 * class with massive of Persons
 */
public class RepositPerson {
    private final Integer INIT_SIZE = 16;
    Person[] personMass = new Person[INIT_SIZE];
    Integer currentLength = 0;

    public Integer length(){
        return this.currentLength;
    }

    /**
     * Add the Person object to the end of Repository
     * @param person to add
     */
    public void add(Person person ){
        if(personMass.length - 1 == currentLength ){
            resize(currentLength*2);
        }
        personMass[currentLength] = person;
        currentLength++;
    }

    /**
     * Delete person from repository by the index
     * @param index
     */
    public void deleteByIndex(int index){
        for(int i = index; i < currentLength ; i++ ){
            personMass[i]=personMass[++i];
        }
        currentLength--;
    }

    /**
     * resize the repository. We can't use the list, so we need to imitate dinamyc massive
     * @param newLength
     */
    private void resize(int newLength) {
        Person[] newArray = new Person[newLength];
        System.arraycopy(personMass, 0, newArray, 0, currentLength);
        personMass = newArray;
    }

    public Person getByIndex(int index){
        return personMass[index];
    }

    public void setByIndex(int index, Person newPerson){
        personMass[index] = newPerson;
    }

    /**
     * Search person in repository by the conditions
     * @param checker that will compare two persons
     * @param v this will be id or lastname or birthdate
     * @return repository with only persons that s
     */
    private RepositPerson search(PersonChecker checker, Object v){
        RepositPerson resoult = new RepositPerson();
        for(int i = 0; i< currentLength; i++){
            if(checker.check(personMass[i],v)){
             resoult.add(personMass[i]);
            }
        }
        return resoult;
    }


    public RepositPerson searchByFio(String fio){
        return search(new FioPersonChecker(), fio);
    }

    public RepositPerson searchById(String id){
        return search(new IdPersonChecker(), id);
    }

    public RepositPerson searchByBirthdate(LocalDate birthDate){
        return search(new BirthdatePersonChecker(), birthDate);
    }


//    public Person getById(String id) {
//        for (int i = 0; i < currentLength; i++) {
//            if (personMass[i].getId().equals(id) ) return personMass[i];
//        }
//        return null;
//    }

//    public RepositPerson getByLastName(String lastNameToFind) {
//        RepositPerson tempRep = new RepositPerson();
//        for(int i = 0; i< currentLength; i++){
//            if(personMass[i].getLastName().equals(lastNameToFind)){
//                tempRep.add(personMass[i]);
//            }
//        }
//        return tempRep;
//    }

//    public RepositPerson getByAge(int ageToFind){
//        RepositPerson tempRep = new RepositPerson();
//        for(int i = 0; i< currentLength; i++){
//            if(personMass[i].getAge() == ageToFind){
//                tempRep.add(personMass[i]);
//            }
//        }
//        return tempRep;
//    }
}


