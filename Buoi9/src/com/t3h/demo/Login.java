package com.t3h.demo;

import javax.swing.*;

public class Login extends JFrame {
    public static final int W_JFAME = 800;
    public static final int H_JFAME = 600;
    private LoginPanel loginPanel = new LoginPanel();
    public Login() {
        setTitle("Login");
        setSize(W_JFAME,H_JFAME);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        add(loginPanel);
    }
}
