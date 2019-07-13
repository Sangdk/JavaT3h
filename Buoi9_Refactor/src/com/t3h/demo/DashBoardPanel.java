package com.t3h.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.t3h.demo.BaseFrame.W_FRAME;

public class DashBoardPanel extends BasePanel implements ActionListener {


    private JLabel lb_Title;
    private JLabel lb_Content;
    private JButton btn_Back;
    private JButton btn_Exit;

    @Override
    protected void initComponent() {
        lb_Title = new JLabel();
        lb_Title.setText("DashBoard");
        lb_Title.setBounds(0, 0, W_FRAME, 100);
        lb_Title.setForeground(Color.white);
        lb_Title.setFont(new Font(null, Font.BOLD, 20));
        lb_Title.setHorizontalAlignment(SwingConstants.CENTER);
        add(lb_Title);

        lb_Content = new JLabel();
        lb_Content.setBounds(100, 70, W_FRAME, 100);
        lb_Content.setForeground(Color.white);
        lb_Content.setFont(new Font(null, Font.BOLD, 20));
//        lb_Content.setHorizontalAlignment(SwingConstants.CENTER);
        add(lb_Content);

        btn_Back = new JButton();
        btn_Back.setText("Back");
        btn_Back.setBounds(100, 150, 80, 30);
        btn_Back.addActionListener(this);
        add(btn_Back);

        btn_Exit = new JButton();
        btn_Exit.setText("Exit");
        btn_Exit.setBounds(200, 150, 80, 30);
        btn_Exit.addActionListener(this);
        add(btn_Exit);
    }

    public void setText(String userName, String password) {
        lb_Content.setText(userName + " And " + password);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn_Back)) {
            LoginFrame frame = new LoginFrame();
            frame.setVisible(true);
            SwingUtilities.getWindowAncestor(this).dispose();
        } else {
            System.exit(0);
        }
    }
}
