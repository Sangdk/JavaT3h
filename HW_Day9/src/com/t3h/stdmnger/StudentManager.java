package com.t3h.stdmnger;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class StudentManager {
    private String out;
    private ArrayList<Student> studentsList = new ArrayList<>();

    public String readFile() {
        StringBuilder sb = new StringBuilder();
        try {
            File f = new File("C:/Users/Deki/Desktop/Student.txt");
            if (f.exists() == false) {
            }
            FileInputStream in = new FileInputStream(f);
            byte[] b = new byte[1024];
            int count = in.read(b);
            String s = "";
            while (count != -1) {
                s = new String(b, 0, count);
                count = in.read(b);
            }
            sb.append(s + "\n");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        out = sb.toString();
        return out;
    }

    public void filter() {
        readFile();
        String[] arrStudents = out.split("\n");
        for (int i = 0; i < arrStudents.length; i++) {
            String[] stdarr = arrStudents[i].split("_");
            String name = stdarr[0];
            String stdClass = stdarr[1];
            float score = Float.parseFloat(stdarr[2]);
            Student std = new Student(name, stdClass, score);
            studentsList.add(std);
        }
    }

    public String findStudent(String stdName) {
        filter();
        for (Student s : studentsList
        ) {
            if (stdName.equalsIgnoreCase(s.getName())) {
                return "Name: " + s.getName() + "\n" +
                        "Class: "+s.getStdclass()+"\n"+
                        "Final Score: "+s.getFinalScore();
            }
        }
        return "Cant find";
    }
}
