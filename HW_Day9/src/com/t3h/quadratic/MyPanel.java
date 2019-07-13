package com.t3h.quadratic;

import com.t3h.base.BasePanel;
import com.t3h.prime.GUI;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import static com.t3h.base.BaseFrame.W_FRAME;

public class MyPanel extends BasePanel implements ActionListener {
    private JLabel lb_Title;
    private JLabel lb_A;
    private JLabel lb_B;
    private JLabel lb_C;
    private JLabel lb_ResultName;
    private JLabel lb_Result;
    private JTextField tf_A;
    private JTextField tf_B;
    private JTextField tf_C;
    private JButton btn_ok;
    private JButton btn_next;

    @Override
    protected void initComponent() {
        lb_Title = new JLabel();
        lb_Title.setText("Quadratic Equation");
        lb_Title.setBounds(0, 0, W_FRAME, 100);
        lb_Title.setHorizontalAlignment(SwingConstants.CENTER);
        lb_Title.setFont(new Font(null, Font.BOLD, 20));
        add(lb_Title);

        lb_A = new JLabel();
        lb_A.setText("A: ");
        lb_A.setBounds(280, 68, W_FRAME, 50);
        lb_A.setFont(new Font(null, Font.BOLD, 18));
        add(lb_A);

        tf_A = new JTextField();
        tf_A.setBounds(310, 80, 200, 30);
        add(tf_A);

        lb_B = new JLabel();
        lb_B.setText("B: ");
        lb_B.setBounds(280, 118, W_FRAME, 50);
        lb_B.setFont(new Font(null, Font.BOLD, 18));
        add(lb_B);

        tf_B = new JTextField();
        tf_B.setBounds(310, 130, 200, 30);
        add(tf_B);

        lb_C = new JLabel();
        lb_C.setText("C: ");
        lb_C.setBounds(280, 168, W_FRAME, 50);
        lb_C.setFont(new Font(null, Font.BOLD, 18));
        add(lb_C);

        tf_C = new JTextField();
        tf_C.setBounds(310, 180, 200, 30);
        add(tf_C);

        lb_ResultName = new JLabel();
        lb_ResultName.setText("Result: ");
        lb_ResultName.setBounds(235, 218, W_FRAME, 50);
        lb_ResultName.setFont(new Font(null, Font.BOLD, 18));
        add(lb_ResultName);

        lb_Result = new JLabel();
        lb_Result.setBounds(310, 230, 200, 30);
        lb_Result.setBackground(Color.WHITE);
        lb_Result.setOpaque(true);
        lb_Result.setForeground(Color.BLACK);
        lb_Result.setFont(new Font(null, Font.BOLD, 15));
        add(lb_Result);

        btn_ok = new JButton();
        btn_ok.setText("Solve");
        btn_ok.setBounds(515, 230, 80, 30);
        btn_ok.addActionListener(this);
        add(btn_ok);
        btn_next = new JButton();
        btn_next.setText("Next");
        btn_next.setBounds(515, 270, 80, 30);
        btn_next.addActionListener(this);
        add(btn_next);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn_ok)) {
            float a = Float.parseFloat(tf_A.getText());
            float b = Float.parseFloat(tf_B.getText());
            float c = Float.parseFloat(tf_C.getText());
            lb_Result.setText(quadratic(a, b, c));
        } else {
            GUI gui = new GUI();
            gui.setVisible(true);
            SwingUtilities.getWindowAncestor(this).dispose();
        }
    }


    public String quadratic(float a, float b, float c) {
        DecimalFormat dcf = new DecimalFormat("#.##");
        if (a == 0) {
            if (b == 0) {
                return "vo nghiem";
            } else {
                return "x = " + dcf.format((-c / b));
            }
        }
        float delta = b * b - 4 * a * c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            return "x1 = " + dcf.format(x1) + " x2 = " + dcf.format(x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            return "x1 = x2 = " + dcf.format(x1);
        } else {
            return "vo nghiem!";
        }

    }
}
