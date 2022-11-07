package com.example.test.demo.dto;

public class UserDTO {

    private String name;
    private String emailAddress;
    private Integer age;

    public UserDTO(String name, String emailAddress, Integer age) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
