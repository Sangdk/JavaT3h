package com.t3h.student.student;

public class Student {
    private String id;
    private String name;
    private float score;

    public Student(String id, String name, float score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return id+"_"+name+"_"+score;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getScore() {
        return score;
    }
}
