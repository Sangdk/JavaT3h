package com.t3h.manage_user_information;

public class User {
    private String userName;
    private String password;
    private String name;
    private String dateOfBirth;
    private int age;
    private String job;

    public User(String userName, String password, String name, String dateOfBirth, int age, String job) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.job = job;
    }
    public void showInfor(){
        System.out.println("Name: "+name);
        System.out.println("UserName: "+userName);
        System.out.println("Password: "+password);
        System.out.println("Date Of Birth: "+dateOfBirth);
        System.out.println("Age: "+age);
        System.out.println("Job: "+job);
        System.out.println("=========================");
    }
    public void changePassword(String newPassword){
        if(newPassword.equals(getPassword()))       {
            System.out.println("password khong hop le");
        }
        setPassword(newPassword);
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }
}
