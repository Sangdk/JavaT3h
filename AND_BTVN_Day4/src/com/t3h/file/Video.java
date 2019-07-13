package com.t3h.file;

public class Video extends File {
    protected String album;

    public Video(String name, String singer, double capacity, double time) {
        super(name, singer, capacity, time);
        this.album = album;
    }
}
