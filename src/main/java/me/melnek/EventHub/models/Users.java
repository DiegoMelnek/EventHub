package me.melnek.EventHub.models;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @Column(nullable = false)
    private int age;

    @Enumerated(EnumType.STRING)
    private UsersType userType;

    @Column(nullable = false)
    private String password;

    @ManyToMany(mappedBy = "participants")
    private List<Event> eventList;


    //Construtores

    public Users(Long id, String username, String email, String phoneNumber, int age, UsersType userType, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.userType = userType;
        this.password = password;
    }

    //Getters and Setters

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UsersType getUserType() {
        return userType;
    }

    public void setUserType(UsersType userType) {
        this.userType = userType;
    }
}
