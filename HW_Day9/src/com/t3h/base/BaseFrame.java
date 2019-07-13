package com.t3h.base;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public abstract class BaseFrame extends JFrame {
    public static final int W_FRAME = 800;
    public static final int H_FRAME = 400;

    public BaseFrame() {
        setTitle(getFrameTitle());
        setSize(W_FRAME, H_FRAME);
        setResizable(false);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        WindowAdapter adapter = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                showConfirm();
            }
        };
        addWindowListener(adapter);
        setLocationRelativeTo(null);
        BasePanel panel = getPanel();
        add(panel);
    }

    private void showConfirm() {
        int result = JOptionPane.showConfirmDialog(
                this,
                "Do you want to exit?",
                "Confirm",
                JOptionPane.YES_NO_OPTION
        );
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    protected abstract BasePanel getPanel();

    protected abstract String getFrameTitle();
}
