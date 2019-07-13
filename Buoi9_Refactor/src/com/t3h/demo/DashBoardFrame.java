package com.t3h.demo;

public class DashBoardFrame extends BaseFrame {
    private DashBoardPanel panel;


    @Override
    protected BasePanel getPanel() {
        panel = new DashBoardPanel();
        return panel;
    }

    @Override
    protected String getFrameTitle() {
        return "DashBoard";
    }

    public void setText(String userName, String password) {
        panel.setText(userName, password);
    }
}
