package com.t3h.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.t3h.demo.BaseFrame.W_FRAME;

public class LoginPanel extends BasePanel implements ActionListener {
    private JLabel lb_Title;
    private JLabel lb_Username;
    private JLabel lb_Password;
    private JTextField tf_Username;
    private JTextField tf_Password;
    private JButton btn_Login;

    @Override
    protected void initComponent() {
        lb_Title = new JLabel();
        lb_Title.setText("LOGIN");
        lb_Title.setBounds(0, 0, W_FRAME, 100);
        lb_Title.setForeground(Color.white);
        lb_Title.setFont(new Font(null, Font.BOLD, 20));
        lb_Title.setHorizontalAlignment(SwingConstants.CENTER);
        add(lb_Title);

        lb_Username = new JLabel();
        lb_Username.setText("User name");
        lb_Username.setBounds(100, 85, W_FRAME, 80);
        lb_Username.setForeground(Color.white);
        lb_Username.setFont(new Font(null, Font.BOLD, 15));
        add(lb_Username);

        lb_Password = new JLabel();
        lb_Password.setText("Password");
        lb_Password.setBounds(100, 130, W_FRAME, 80);
        lb_Password.setForeground(Color.white);
        lb_Password.setFont(new Font(null, Font.BOLD, 15));
        add(lb_Password);

        tf_Username = new JTextField();
        tf_Username.setBounds(180, 110, 240, 30);
        add(tf_Username);

        tf_Password = new JTextField();
        tf_Password.setBounds(180, 150, 240, 30);
        add(tf_Password);

        btn_Login = new JButton();
        btn_Login.setText("Login");
        btn_Login.setBounds(250, 200, 100, 30);
        btn_Login.addActionListener(this);
        add(btn_Login);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userName = tf_Username.getText();
        String password = tf_Password.getText();
        DashBoardFrame frame = new DashBoardFrame();
        frame.setText(userName,password);
        frame.setVisible(true);
        //close current frame
        SwingUtilities.getWindowAncestor(this).dispose();
    }
}
