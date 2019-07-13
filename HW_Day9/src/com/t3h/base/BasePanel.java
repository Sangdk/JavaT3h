package com.t3h.base;

import javax.swing.*;
import java.awt.*;

public abstract class BasePanel extends JPanel {
    public BasePanel() {
        setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        initComponent();
    }

    protected abstract void initComponent();
}
