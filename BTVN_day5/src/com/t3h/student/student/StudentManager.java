package com.t3h.student.student;



public class StudentManager {

    private Student[] std = new Student[5];

    public StudentManager() {
        Student std0 = new Student("123abc","Pham Van A",8.5f);
        std[0] = std0;
        Student std1 = new Student("123def","Pham Van B",9f);
        std[1] = std1;
        Student std2 = new Student("123jhk","Pham Van C",9.5f);
        std[2] = std2;
        Student std3 = new Student("456abc","Pham Van D",8);
        std[3] = std3;
        Student std4 = new Student("789abc","Pham Thi E",8);
        std[4] = std4;
    }

    public void printList(){
        for (int i = 0; i <5 ; i++) {
            System.out.println(std[i]);
        }
    }
    public void findStudentByScore(int score){
        for (int i = 0; i < 5; i++) {
            if(std[i].getScore() == score){
                System.out.println(std[i]);
            }
        }
        }

    }
