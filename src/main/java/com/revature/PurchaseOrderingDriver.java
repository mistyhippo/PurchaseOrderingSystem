package com.revature;
//import java.util.List;

import com.revature.daos.PersonDao;
import com.revature.daos.PersonDaoImpl;
import com.revature.models.Person;
import com.revature.models.Type;
import com.revature.util.ConnectionUtil;
import java.sql.Connection;
import java.sql.SQLException;

public class PurchaseOrderingDriver {

    public static void main(String[] args){

        PersonDao personDao = new PersonDaoImpl();

        Person person = new Person(Type.BUYERS, "Sally", "Jenkins", "saljen", "password");

        boolean success = personDao.createPerson(person);

        System.out.println(success);
    }

}
