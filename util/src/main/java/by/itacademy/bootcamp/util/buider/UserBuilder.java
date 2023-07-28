package by.itacademy.bootcamp.util.buider;

import by.itacademy.bootcamp.entity.User;

import java.util.UUID;

public class UserBuilder {
    
    private String id;
    private String name;
    private String surname;
    private String patronymic;
    private String email;
    private String role;
    private UserBuilder(){
    }
    public static UserBuilder create(){
        return new UserBuilder();
    }

    public UserBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public UserBuilder setPatronymic(String patronymic) {
        this.patronymic = patronymic;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder setRole(String role) {
        this.role = role;
        return this;
    }
    public User build(){
        return new User(id,name,surname,patronymic,email,role);
    }
}
