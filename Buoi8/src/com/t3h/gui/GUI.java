package com.t3h.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI extends JFrame {
    private MyPanel myPanel = new MyPanel();
    private MyPanelTwo myPanelTwo = new MyPanelTwo();
    public GUI() {
        setSize(500, 500);
        setTitle("Demo first");
        setBackground(Color.BLACK);
        setResizable(false);
        setLocation(100, 100);
        setLocationRelativeTo(null);
//        setDefaultCloseOperation(
//                EXIT_ON_CLOSE
//        );

        //Catch event
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        WindowAdapter adapter = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                showConfirm();
            }
        };
        addWindowListener(adapter);

        //
        setLayout(null);
        add(myPanel);
        add(myPanelTwo);
    }

    public void showConfirm() {
        int result =
                JOptionPane.showConfirmDialog(
                        this, "Do you want to exits?", "Confirm", JOptionPane.YES_NO_OPTION

                );
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}
