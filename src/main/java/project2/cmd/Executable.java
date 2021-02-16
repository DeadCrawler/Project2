package project2.cmd;

import org.json.simple.parser.ParseException;
import project2.io.FileHelper;
import project2.model.Person;

import java.io.IOException;
import java.util.List;

public interface Executable {

    void create(List<Person> persons) throws IOException;

    List<Person> read() throws IOException, ParseException, ClassNotFoundException;

    void update(long id, String valueToBeUpdated, String valueToChange) throws IOException, ClassNotFoundException;

    void delete(long id) throws IOException, ClassNotFoundException;
}
