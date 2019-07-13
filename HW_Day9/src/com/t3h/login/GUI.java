package com.t3h.login;

import com.t3h.base.BaseFrame;
import com.t3h.base.BasePanel;

public class GUI extends BaseFrame {
    private MyPanel panel;

    @Override
    protected BasePanel getPanel() {
        panel = new MyPanel();
        return panel;
    }

    @Override
    protected String getFrameTitle() {
        return "Login";
    }
}
