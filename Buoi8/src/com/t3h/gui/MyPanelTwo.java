package com.t3h.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyPanelTwo extends JPanel {
    public MyPanelTwo() {
        setSize(200, 200);
        setBackground(Color.RED);

        addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked...");
                int exScr = e.getXOnScreen();
                int eyScr = e.getYOnScreen();
                System.out.println("exScr : "+exScr);
                System.out.println("eYScr : "+eyScr);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse Pressed...");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse Released...");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse Enter...");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
