package com.revature.services;

import com.revature.daos.PersonDao;
import com.revature.models.Person;
import com.revature.models.Type;

import java.util.List;
import java.util.Locale;

public class PersonService {

    //Services are what we use to do CRUD functionality, and use to link in between our data layers and our model layers

    private PersonDao pd;
    public PersonService(PersonDao pd){
        this.pd = pd;
    }

    public Person createPerson(int id, Type t, String first, String last, String password){
        String username = last.substring(0,3) + first.substring(0,3);
        username = username.toLowerCase();
        Person p = new Person(id, t, first, last, username, password);

        pd.createPerson(p);

        return p;
    }

}
