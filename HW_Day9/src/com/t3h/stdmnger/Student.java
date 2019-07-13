package com.t3h.stdmnger;

import java.io.File;
import java.io.FileOutputStream;

public class Student {
    private String name;
    private String stdclass;
    private float finalScore;

    public String getName() {
        return name;
    }

    public String getStdclass() {
        return stdclass;
    }

    public float getFinalScore() {
        return finalScore;
    }

    public Student(String name, String stdclass, float finalScore) {
        this.name = name;
        this.stdclass = stdclass;
        this.finalScore = finalScore;
    }
    public String exportInfor(){
        return name+"_"+stdclass+"_"+finalScore;
    }
    public void importInforToFile(String str){
        try {
            File f = new File("C:/Users/Deki/Desktop/Student.txt");
            if(!f.exists()){
                f.getParentFile().mkdirs();
                f.createNewFile();
            }
            FileOutputStream out = new FileOutputStream(f,true);
            out.write(str.getBytes());
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
