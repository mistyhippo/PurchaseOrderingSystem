package com.revature.daos;

import com.revature.models.Person;
import com.revature.models.Type;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {

    ConnectionUtil conUtil = ConnectionUtil.getInstance();

    @Override
    public void createPerson(Person p) {

        try {

            Connection con = conUtil.getConnection();

            String sql = "INSERT INTO person VALUES (" + p.getPersonId() + "," + (p.getType().ordinal()) + ",'" + p.getFirst() + "','" + p.getLast() + "','" + p.getUsername() + "','" + p.getPassword() + "')";

            System.out.println(sql);

            Statement s = con.createStatement();

            s.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Person readPersonById(int id) {

        Person p = new Person();

        try {

            Connection con = conUtil.getConnection();

            String sql = "SELECT * FROM person WHERE id =" + id;

            Statement s = con.createStatement();

            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                p = new Person(rs.getInt(1), Type.values()[rs.getInt(2)], rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return p;
    }

    @Override
    public List<Person> readAllPeople() {
        List<Person> pList = new ArrayList<>();

        try{

            Connection con = conUtil.getConnection();

            String sql = "SELECT * FROM person";

            Statement s = con.createStatement();

            ResultSet rs = s.executeQuery(sql);

            while(rs.next()){
                Person p = new Person(rs.getInt(1), Type.values()[rs.getInt(2)], rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                pList.add(p);
            }

        } catch(SQLException e){
            e.printStackTrace();
        }

        return pList;
    }

    @Override
    public void updatePerson(Person p) {

        try{
            Connection con = conUtil.getConnection();

            String sql = "UPDATE person SET type=" + (p.getType().ordinal()) + ","+
                    "first_name='" + p.getFirst() +"'," +
                    "last_name='" + p.getLast() + "'," +
                    "email='" + p.getUsername() + "'," +
                    "password='" + p.getPassword() + "' " +
                    "WHERE id=" + p.getPersonId();

            Statement s = con.createStatement();

            s.executeUpdate(sql);

        } catch(SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public void deletePerson(Person p) {
        try{
            Connection con = conUtil.getConnection();

            String sql = "DELETE FROM person WHERE id=" + p.getPersonId();

            Statement s = con.createStatement();

            s.executeUpdate(sql);

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

}
