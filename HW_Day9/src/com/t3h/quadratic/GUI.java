package com.t3h.quadratic;


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
        return "Quadratic Equation";
    }
}
