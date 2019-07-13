package com.t3h.demo;

import javax.swing.*;

public abstract class BaseFrame extends JFrame {
    public static final int W_FRAME = 600;
    public static final int H_FRAME = 400;

    public BaseFrame() {
        setTitle(getFrameTitle());
        setSize(W_FRAME,H_FRAME);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        BasePanel panel =getPanel();
        add(panel);
    }

    protected abstract BasePanel getPanel();

    protected abstract String getFrameTitle();
}
