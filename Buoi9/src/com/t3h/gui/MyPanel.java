package com.t3h.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.t3h.gui.MyFrame.W_JFRAME;

public class MyPanel extends JPanel implements ActionListener {
    private JLabel lb_Title;
    private JTextField tf_User;
    private JTextField tf_Password;
    private  JButton btn_Ok;

    public MyPanel() {
        setBackground(Color.BLUE);
        setLayout(null);
        initComponent();

    }

    private void initComponent() {
        lb_Title = new JLabel();
        lb_Title.setText("FACEBOOK");
        lb_Title.setBounds(0,0,W_JFRAME,100);
        lb_Title.setForeground(Color.white);
        lb_Title.setFont(new Font(null,Font.BOLD,20));
        lb_Title.setHorizontalAlignment(SwingConstants.CENTER);
        add(lb_Title);

        tf_User = new JTextField();
        tf_User.setBounds(270,110,240,30);
        add(tf_User);

        tf_Password = new JTextField();
        tf_Password.setBounds(270,150,240,30);
        add(tf_Password);

        btn_Ok = new JButton();
        btn_Ok.setText("Login");
        btn_Ok.setBounds(330,200,100,30);
        btn_Ok.addActionListener(this);
        add(btn_Ok);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String value = "Hello "+tf_User.getText();
        JOptionPane.showMessageDialog(
                null,
                value,
                "sign",
                JOptionPane.INFORMATION_MESSAGE
        );

    }
}
