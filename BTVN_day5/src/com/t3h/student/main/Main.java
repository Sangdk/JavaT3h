package com.t3h.student.main;

import com.t3h.student.student.StudentManager;

public class Main {
    public static void main(String[] args) {
        StudentManager stdm = new StudentManager();
        stdm.printList();
        System.out.println("=========================================");
        stdm.findStudentByScore(5);
    }
}
