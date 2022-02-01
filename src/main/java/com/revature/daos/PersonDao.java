package com.revature.daos;
import com.revature.models.Person;
import java.util.List;

public interface PersonDao {

    public void createPerson(Person p);

    public Person readPersonById(int id);
    public List<Person> readAllPeople();

    public void updatePerson(Person p);

    public void deletePerson(Person p);


}
