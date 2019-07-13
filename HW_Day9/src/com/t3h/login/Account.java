package com.t3h.login;

public class Account {
    private String userName;
    private String password;

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public void showInfor(){
        System.out.println("user: "+userName);
        System.out.println("pass: "+password);
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
