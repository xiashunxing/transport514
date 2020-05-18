package com;

public class Person {
    String id;
    String p_Name;
    String p_sex;
    int p_age;

    public Person() {
    }

    public Person(String id, String p_Name, String p_sex, int p_age) {
        this.id = id;
        this.p_Name = p_Name;
        this.p_sex = p_sex;
        this.p_age = p_age;
    }

    public void driveTransport(Transport transport){};

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_Name() {
        return p_Name;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name;
    }

    public String getP_sex() {
        return p_sex;
    }

    public void setP_sex(String p_sex) {
        this.p_sex = p_sex;
    }

    public int getP_age() {
        return p_age;
    }

    public void setP_age(int p_age) {
        this.p_age = p_age;
    }
}
