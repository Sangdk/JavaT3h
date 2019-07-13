package com.t3h.demo;

import javax.swing.*;
import java.awt.*;

import static com.t3h.gui.MyFrame.W_JFRAME;

public class LoginPanel extends JPanel {
    private JLabel lb_Title;
    private JLabel lb_Username;
    private JLabel lb_Password;
    private JTextField tf_Username;
    private JTextField tf_Password;
    private JButton btn;

    public LoginPanel() {
        setBackground(Color.BLUE);
        setLayout(null);
        initComponent();
    }

    private void initComponent() {
        lb_Title = new JLabel();
        lb_Title.setText("LOGIN");
        lb_Title.setBounds(0,0,W_JFRAME,100);
        lb_Title.setForeground(Color.white);
        lb_Title.setFont(new Font(null,Font.BOLD,20));
        lb_Title.setHorizontalAlignment(SwingConstants.CENTER);
        add(lb_Title);

        lb_Username = new JLabel();
        lb_Username.setText("User name");
        lb_Username.setBounds(250,110,W_JFRAME,50);
        lb_Username.setForeground(Color.white);
        lb_Username.setFont(new Font(null,Font.BOLD,10));
        add(lb_Username);

        tf_Username = new JTextField();
        tf_Username.setBounds(270,110,240,30);

    }
}
