package utils;

import entities.Person;
import repositories.RepositPerson;

public class ImplementationSorter {
public static void implementationSort(RepositPerson rep,PersonComporator comporator) {
    Person copyPerson = new Person();
    for (int i = 0; i < rep.length(); i++) {
        copyPerson = rep.getByIndex(i);
        int j = i;
         while (j > 0 && comporator.comapare(copyPerson, rep.getByIndex(j-1)) < 0) {
            rep.setByIndex(j,rep.getByIndex(j-1));
            j--;
            }
            rep.setByIndex(j, copyPerson);
//        numbers[j] = copyNumber;
        }
     }
}
