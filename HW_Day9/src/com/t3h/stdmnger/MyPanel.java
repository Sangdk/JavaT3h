package com.t3h.stdmnger;

import com.t3h.base.BasePanel;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.t3h.base.BaseFrame.W_FRAME;

public class MyPanel extends BasePanel implements ActionListener {
    private JLabel lb_Title;
    private JLabel lb_Namefind;
    private JLabel lb_Nameimport;
    private JLabel lb_Class;
    private JLabel lb_Finalscore;
    private JTextField tf_Namefind;
    private JTextField tf_Nameimport;
    private JTextField tf_Class;
    private JTextField tf_Finalscore;
    private JButton btn_Find;
    private JButton btn_Import;

    @Override
    protected void initComponent() {
        lb_Title = new JLabel();
        lb_Title.setText("Student Manager");
        lb_Title.setBounds(0, 0, W_FRAME, 100);
        lb_Title.setFont(new Font(null, Font.BOLD, 20));
        lb_Title.setHorizontalAlignment(SwingConstants.CENTER);
        add(lb_Title);

        lb_Namefind = new JLabel();
        lb_Namefind.setText("Import student name to find: ");
        lb_Namefind.setBounds(50, 90, W_FRAME, 30);
        lb_Namefind.setFont(new Font(null, Font.BOLD, 15));
        add(lb_Namefind);

        lb_Nameimport = new JLabel();
        lb_Nameimport.setText("Name: ");
        lb_Nameimport.setBounds(100, 140, W_FRAME, 30);
        lb_Nameimport.setFont(new Font(null, Font.BOLD, 15));
        add(lb_Nameimport);

        lb_Class = new JLabel();
        lb_Class.setText("Class: ");
        lb_Class.setBounds(100, 190, W_FRAME, 30);
        lb_Class.setFont(new Font(null, Font.BOLD, 15));
        add(lb_Class);

        lb_Finalscore = new JLabel();
        lb_Finalscore.setText("Final score: ");
        lb_Finalscore.setBounds(100, 240, W_FRAME, 30);
        lb_Finalscore.setFont(new Font(null, Font.BOLD, 15));
        add(lb_Finalscore);

        tf_Namefind = new JTextField();
        tf_Namefind.setBounds(260, 90, 300, 30);
        add(tf_Namefind);

        tf_Nameimport = new JTextField();
        tf_Nameimport.setBounds(260, 140, 300, 30);
        add(tf_Nameimport);

        tf_Class = new JTextField();
        tf_Class.setBounds(260, 190, 300, 30);
        add(tf_Class);

        tf_Finalscore = new JTextField();
        tf_Finalscore.setBounds(260, 240, 300, 30);
        add(tf_Finalscore);

        btn_Find = new JButton();
        btn_Find.setText("Find");
        btn_Find.setBounds(580, 90, 70, 30);
        btn_Find.addActionListener(this);
        add(btn_Find);

        btn_Import = new JButton();
        btn_Import.setText("Import student information");
        btn_Import.setBounds(260, 290, 200, 30);
        btn_Import.addActionListener(this);
        add(btn_Import);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn_Import)) {
            String name = tf_Nameimport.getText();
            String stdClass = tf_Class.getText();
            float score = Float.parseFloat(tf_Finalscore.getText());
            if (score < 0) {
                JOptionPane.showMessageDialog(
                        null,
                        "Data type incorrect"
                );
            } else {
                Student std = new Student(name, stdClass, score);
                JOptionPane.showMessageDialog(
                        null,
                        "Import complete"
                );
                std.importInforToFile(std.exportInfor() + "\n");
            }
        } else {
            String nameFind = tf_Namefind.getText();
            if (nameFind.isEmpty()) {
                StudentManager stdmng = new StudentManager();
                JOptionPane.showMessageDialog(
                        null,
                        stdmng.readFile(),
                        "Show All",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                StudentManager stdmng = new StudentManager();
                String name = tf_Namefind.getText();
                JOptionPane.showMessageDialog(
                        null,
                        stdmng.findStudent(name),
                        "Student Infor",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        }

    }
}
