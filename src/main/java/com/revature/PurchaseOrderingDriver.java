package com.revature;
//import java.util.List;

//import com.revature.util.ConnectionUtil;
import com.revature.daos.PersonDao;
import com.revature.daos.PersonDaoImpl;
import com.revature.models.Person;
import com.revature.models.Type;

import java.sql.Connection;
import java.sql.SQLException;

public class PurchaseOrderingDriver {

    public static void main(String[] args){
        //Dont DELETE BECAUSE THIS SHIT WORKS
        PersonDao p1 = new PersonDaoImpl();
        p1.createPerson(new Person(31, Type.BUYERS, "sally", "walker", "salwal", "0123456"));


    }

}
