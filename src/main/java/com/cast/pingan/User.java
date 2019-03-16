package com.cast.pingan;

public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public void Test01(){
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        User user = new User();
        user.Test01();
        user.Test01();
        user.Test01();
        user.Test01();
    }
}
