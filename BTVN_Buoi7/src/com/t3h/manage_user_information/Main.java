package com.t3h.manage_user_information;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("PHSang","123456","Sang","17/09/1997",22,"Sinh vien");
        User user2 = new User("VVDat","123456","Dat","1/1/1996",23,"Sinh vien");
        User user3 = new User("HMCanh","123456","Canh","2/2/1998",21,"Sinh vien");

        Manager mng = new Manager();
        mng.add(user1);
        mng.add(user2);
        mng.add(user3);

        mng.register(new User("PDAnh","123456","DAnh","1/1/1997",22,"Sinh Vien"));
        mng.login("PHSang","123456");
        System.out.println("==========================");
        //mng.changePassword("PHSang","1234256","xxxxx");
        //mng.deleteUser("PHSang","123456");
        mng.printList();
        mng.findInforByName("DANH");
    }
}
