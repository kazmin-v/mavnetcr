public class RepositPerson {
    private final Integer INIT_SIZE = 16;
    Person[] personMass = new Person[INIT_SIZE];
    Integer currentLength = 0;

    public Integer length(){
        return this.currentLength;
    }

    public void add(Person person ){
        if(personMass.length - 1 == currentLength ){
            resize(currentLength*2);
        }
        personMass[currentLength] = person;
        currentLength++;
    }

    public void deleteByIndex(int index){
        for(int i = index; i < currentLength ; i++ ){
            personMass[i]=personMass[i++];
        }
        currentLength--;
    }

    public void deleteById(String id_to_del){
        for(int i = 0; i < currentLength;i++ ){
            if(personMass[i].id.equals(id_to_del) ){
                for(int j = i; j < currentLength; j++ ){
                    personMass[i]=personMass[i++];
                }
            }
        }
    }
    private void resize(int newLength) {
        Person[] newArray = new Person[newLength];
        System.arraycopy(personMass, 0, newArray, 0, currentLength);
        personMass = newArray;
    }

    public Person getByNum(int num){
        return personMass[num];
    }

    public Person getById(String id) {
        for (int i = 0; i < currentLength; i++) {
            if (personMass[i].getId().equals(id) ) return personMass[i];
        }
        return null;
    }

    public RepositPerson getByLastName(String lastNameToFind) {
        RepositPerson tempRep = new RepositPerson();
        for(int i = 0; i< currentLength; i++){
            if(personMass[i].getLastName().equals(lastNameToFind)){
                tempRep.add(personMass[i]);
            }
        }
        return tempRep;
    }

    public RepositPerson getByAge(int ageToFind){
        RepositPerson tempRep = new RepositPerson();
        for(int i = 0; i< currentLength; i++){
            if(personMass[i].getAge() == ageToFind){
                tempRep.add(personMass[i]);
            }
        }
        return tempRep;
    }
}


