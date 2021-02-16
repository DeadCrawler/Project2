package data_format_converter;

import project2.model.Person;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public interface IConverter {

    String getStrFromPersons(List<Person> persons) throws IOException;

    public List<Person> getPersonsFromString(String strPersons) throws IOException;

    public default String updateDataInPerson(long id, String fieldToBeUpdated, String valueToUpdate, String strPersons) throws IOException {
        List<Person> persons = getPersonsFromString(strPersons);
        Iterator<Person> iterator = persons.iterator();
        Person reqPerson;
        while (iterator.hasNext()) {
            Person item = iterator.next();
            if (item.getId() == id) {
                reqPerson = item;
                switch (fieldToBeUpdated) {
                    case "id":
                        reqPerson.setId(Long.parseLong(valueToUpdate));
                        break;
                    case "fname":
                        reqPerson.setFname(valueToUpdate);
                        break;
                    case "lname":
                        reqPerson.setLname(valueToUpdate);
                        break;
                    case "age":
                        reqPerson.setAge(Integer.parseInt(valueToUpdate));
                        break;
                    case "city":
                        reqPerson.setCity(valueToUpdate);
                        break;
                }
            }
        }
//        int count = 0;
//        if (count < 1) {
//            System.out.println("Вид списка персон после апдейта персоны " + getStrFromPersons(persons));
//        }
//        count++;

        return getStrFromPersons(persons);
    }

    public default String removePersonsFromList(long id, String strPersons) throws IOException {
        List<Person> persons = getPersonsFromString(strPersons);
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person item = iterator.next();
            if (item.getId() == id) {
                iterator.remove();
            }
        }
        return getStrFromPersons(persons);
    }
}
