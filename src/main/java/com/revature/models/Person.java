package com.revature.models;

public class Person {

    private int personId;
    private Type type;
    private String first;
    private String last;
    private String username;

    public int getPersonId() {
        return personId;
    }

    public Person(int personId, Type type, String first, String last, String username, String password) {
        this.personId = personId;
        this.type = type;
        this.first = first;
        this.last = last;
        this.username = username;
        this.password = password;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", type=" + type +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
