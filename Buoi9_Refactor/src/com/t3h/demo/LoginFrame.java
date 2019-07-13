package com.t3h.demo;

public class LoginFrame extends BaseFrame {
    @Override
    protected BasePanel getPanel() {
        return new LoginPanel();
    }

    @Override
    protected String getFrameTitle() {
        return "Login";
    }
}
