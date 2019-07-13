package com.t3h.manage_user_information;

import java.util.ArrayList;

public class Manager {
    ArrayList<User> arrayUser = new ArrayList();

    public void add(User newUser) {
        arrayUser.add(newUser);
    }

    public void register(User newUser) {
        for (User user : arrayUser) {
            if (newUser.getUserName().equals(user.getUserName())) {
                System.out.println("Dang ky that bai");
                return;
            }
        }
        arrayUser.add(newUser);
        System.out.println("Dang ki thanh cong");
        newUser.showInfor();
    }

    public int login(String user, String password) {
        for (User u : arrayUser
        ) {
            if (user.equals(u.getUserName()) && password.equals(u.getPassword())) {
                System.out.println("Dang nhap thanh cong");
                return arrayUser.indexOf(u);

            }
        }
        System.out.println("Tai khoan hoac mat khau khong dung");
        return -1;
    }

    public  void changePassword(String user,String password,String newPassword){
        int index = login(user,password);
        if(index == -1){
            return;
        }
        arrayUser.get(index).changePassword(newPassword);
        arrayUser.get(index).showInfor();

        System.out.println("Mat khau da thay doi");
    }
    public  void deleteUser(String user,String password){
        int index = login(user,password);
        if(index == -1){
            return;
        }
        arrayUser.remove(arrayUser.get(index));
        System.out.println("Xoa tai khoan thanh cong");
    }
    public void findInforByName(String name){
        for (User u:arrayUser
             ) {
            if(name.equalsIgnoreCase(u.getName())){
                System.out.println("Infor of "+u.getName()+":");
                u.showInfor();
                return;
            }
        }
    }
    public  void printList(){
        for (User u:arrayUser
             ) {
            u.showInfor();
        }
    }
}
