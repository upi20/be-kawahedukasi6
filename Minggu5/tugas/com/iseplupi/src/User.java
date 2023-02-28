package com.iseplupi.src;

public class User extends Account{
    public String username;
    public String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
