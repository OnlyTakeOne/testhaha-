package com.cast.pingan;

public class Person extends User {
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "sex='" + sex + '\'' +
                '}';
    }
}
