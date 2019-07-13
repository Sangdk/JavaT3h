package com.t3h.stdmnger;

import com.t3h.base.BaseFrame;
import com.t3h.base.BasePanel;

public class GUI extends BaseFrame {
    private MyPanel myPanel;
    @Override
    protected BasePanel getPanel() {
        myPanel = new MyPanel();
        return myPanel;
    }

    @Override
    protected String getFrameTitle() {
        return "Student Manager";
    }
}
