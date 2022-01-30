package com.revature.services;

import com.revature.models.Person;
import com.revature.models.Type;

public class PersonService {

    //Services are what we use to do CRUD functionality, and use to link in between our data layers and our model layers

    public Person createPerson(int id, Type t, String first, String last, String password){
        String username = last.substring(0,3) + first.substring(0,3);
        username = username.toLowerCase();
        Person p = new Person(id, t, first, last, username, password);
        return p;
    }

}
