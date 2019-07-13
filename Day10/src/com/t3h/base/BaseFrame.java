package com.t3h.base;

import javax.swing.*;

public class BaseFrame extends JFrame {
    public static final int W_FRAME = 500;
    public static final int H_FRAME = 525;
    BasePanel panel;
    public BaseFrame(){
        setTitle("Tank90");
        setSize(W_FRAME,H_FRAME);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel = new BasePanel();
        add(panel);
    }
}
