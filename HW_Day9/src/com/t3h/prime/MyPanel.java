package com.t3h.prime;

import com.t3h.base.BasePanel;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.t3h.base.BaseFrame.W_FRAME;

public class MyPanel extends BasePanel implements ActionListener {
    private JLabel lb_Title;
    private JLabel lb_NumberCheck;
    private JLabel lb_NumberN;
    private JTextField tf_NumberCheck;
    private JTextField tf_NumberN;
    private JButton btn_Check;
    private JButton btn_Lísted;

    @Override
    protected void initComponent() {
        lb_Title = new JLabel();
        lb_Title.setText("PRIME TOOL");
        lb_Title.setBounds(0, 0, W_FRAME, 100);
        lb_Title.setHorizontalAlignment(SwingConstants.CENTER);
        lb_Title.setFont(new Font(null, Font.BOLD, 20));
        add(lb_Title);

        lb_NumberCheck = new JLabel();
        lb_NumberCheck.setText("Number Check");
        lb_NumberCheck.setBounds(120, 100, W_FRAME, 30);
        lb_NumberCheck.setFont(new Font(null, Font.BOLD, 16));
        add(lb_NumberCheck);

        lb_NumberN = new JLabel();
        lb_NumberN.setText("Import N");
        lb_NumberN.setBounds(120, 160, W_FRAME, 30);
        lb_NumberN.setFont(new Font(null, Font.BOLD, 16));
        add(lb_NumberN);

        tf_NumberCheck = new JTextField();
        tf_NumberCheck.setBounds(250, 100, 300, 40);
        add(tf_NumberCheck);

        tf_NumberN = new JTextField();
        tf_NumberN.setBounds(250, 150, 300, 40);
        add(tf_NumberN);

        btn_Check = new JButton();
        btn_Check.setText("Check");
        btn_Check.setBounds(560, 100, 120, 40);
        btn_Check.addActionListener(this);
        add(btn_Check);

        btn_Lísted = new JButton();
        btn_Lísted.setText("Listed");
        btn_Lísted.setBounds(560, 150, 120, 40);
        btn_Lísted.addActionListener(this);
        add(btn_Lísted);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn_Check)) {
            String nbCheck = tf_NumberCheck.getText();
            MyPrime myPrime = new MyPrime();
            if (nbCheck.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null,
                        "No Data import",
                        "Warning",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else if (!myPrime.check(nbCheck)) {
                JOptionPane.showMessageDialog(
                        null,
                        "Data not suitable",
                        "Warning",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                int nb = Integer.parseInt(nbCheck);
                if (myPrime.primeCheck(nb)) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Number " + nbCheck + " is a prime number!"
                    );
                } else JOptionPane.showMessageDialog(
                        null,
                        "Number " + nbCheck + " is not a prime number!"
                );
            }
        } else {
            String nCheck = tf_NumberN.getText();
            MyPrime myPrime = new MyPrime();
            if (nCheck.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null,
                        "No Data import",
                        "Warning",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else if (!myPrime.check(nCheck)) {
                JOptionPane.showMessageDialog(
                        null,
                        "Data not suitable",
                        "Warning",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                int nb = Integer.parseInt(nCheck);
                JOptionPane.showMessageDialog(
                        null,
                        "The prime numbers are less than " + nCheck + " is : " + myPrime.primerListed(nb)
                );
                String strToFile = "Number " + nCheck + "\n"
                        + "The prime numbers are less than " + nCheck + " is " + myPrime.primerListed(nb)+"\n";
                RandomAccessFile randomAccessFile = new RandomAccessFile();
                randomAccessFile.writeFile(strToFile);
            }

        }
    }
}
