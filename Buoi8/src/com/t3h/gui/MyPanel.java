package com.t3h.gui;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    MyButton myButton = new MyButton();
    public MyPanel(){
        setSize(500,400);
        setBackground(Color.cyan);
        setLocation(200,100);
        add(myButton);
        setLayout(null);
    }
}
