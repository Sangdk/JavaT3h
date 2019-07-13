package com.t3h.login;

import com.t3h.base.BasePanel;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.t3h.base.BaseFrame.W_FRAME;

public class MyPanel extends BasePanel implements ActionListener {
    LoginMgr loginMgr;

    public MyPanel() {
        loginMgr = new LoginMgr();
    }

    private JLabel lb_Title;
    private JLabel lb_Username;
    private JLabel lb_Password;
    private JTextField tf_Username;
    private JPasswordField pf_Password;
    private JButton btn_Cancel;
    private JButton btn_Login;

    @Override
    protected void initComponent() {
        lb_Title = new JLabel();
        lb_Title.setText("LOGIN");
        lb_Title.setForeground(Color.BLUE);
        lb_Title.setBounds(0, 0, W_FRAME, 100);
        lb_Title.setFont(new Font("Tahoma", Font.BOLD, 24));
        lb_Title.setHorizontalAlignment(SwingConstants.CENTER);
        add(lb_Title);

        lb_Username = new JLabel();
        lb_Username.setText("User name: ");
        lb_Username.setBounds(120, 100, W_FRAME, 70);
        lb_Username.setFont(new Font("Tahoma", Font.BOLD, 17));
        add(lb_Username);

        lb_Password = new JLabel();
        lb_Password.setText("Password: ");
        lb_Password.setBounds(120, 160, W_FRAME, 70);
        lb_Password.setFont(new Font("Tahoma", Font.BOLD, 17));
        add(lb_Password);

        tf_Username = new JTextField();
        tf_Username.setToolTipText("Enter your user name");
        tf_Username.setBounds(250, 120, 300, 30);
        add(tf_Username);

        pf_Password = new JPasswordField();
        pf_Password.setBounds(250, 180, 300, 30);
        pf_Password.setEchoChar('$');
        add(pf_Password);

        btn_Cancel = new JButton();
        btn_Cancel.setBounds(380, 220, 80, 35);
        btn_Cancel.setText("Cancel");
        btn_Cancel.setFont(new Font("Tahoma", Font.BOLD, 12));
        btn_Cancel.setForeground(Color.RED);
        btn_Cancel.addActionListener(this);
        add(btn_Cancel);

        btn_Login = new JButton();
        btn_Login.setBounds(470, 220, 80, 35);
        btn_Login.setText("LOGIN");
        btn_Login.setFont(new Font("Tahoma", Font.BOLD, 12));
        btn_Login.setForeground(Color.BLUE);
        btn_Login.addActionListener(this);
        add(btn_Login);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn_Cancel)) {
            System.exit(0);
        } else {
            if (tf_Username.getText().isEmpty()) {
                JOptionPane.showMessageDialog(
                        null,
                        "Please enter your user name",
                        "Warning",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                String userName = tf_Username.getText();
                char a[] = pf_Password.getPassword();
                String password = loginMgr.convert(a);
                if (password.isEmpty()) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Please enter your password",
                            "Warning",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                } else {
                    boolean check = loginMgr.login(userName, password);
                    if (check == true) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Login success !"
                        );
                    } else {
                        JOptionPane.showMessageDialog(
                                null,
                                "user name or password incorrect !",
                                "Warning",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    }
                }
            }
        }
    }
}
