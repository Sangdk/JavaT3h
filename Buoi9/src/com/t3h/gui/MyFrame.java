package com.t3h.gui;

import javax.swing.*;

public class MyFrame extends JFrame {
    MyPanel panelName = new MyPanel();
    String title;
    public static final int W_JFRAME = 800;
    public static final int H_JFRAME = 600;

    public MyFrame(String title){
        setTitle(title);
        setSize(W_JFRAME,H_JFRAME);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        add(panelName);
//        setLayout(null);

    }
}
