package com.t3h.login;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class LoginMgr {
    private String out;
    private ArrayList<Account> arrAccount;

    public LoginMgr() {
        arrAccount = new ArrayList<>();
        readFile();
        String[] arrStudents = out.split("\r\n");
        for (int i = 0; i < arrStudents.length; i++) {
            String[] arrAco = arrStudents[i].split("_");
            String userName = arrAco[0];
            String password = arrAco[1];
            arrAccount.add(new Account(userName, password));
        }
    }

    public String readFile() {
        try {
            File f = new File("C:/Users/Deki/Desktop/Account.txt");
            if (f.exists() == false) {
                return "";
            }
            FileInputStream in = new FileInputStream(f);
            byte[] b = new byte[1024];
            int count = in.read(b);
            out = "";
            while (count != -1) {
                out = new String(b, 0, count);
                count = in.read(b);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return out;
    }

    public boolean login(String userName, String pasword) {
        for (int i = 0; i < arrAccount.size(); i++) {
            if (userName.equals(arrAccount.get(i).getUserName())) {
                if (pasword.equals(arrAccount.get(i).getPassword())) {
                    return true;
                }
            }
        }
        return false;
    }

    public String convert(char[] a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
        }
        String result = sb.toString();
        return result;
    }
}
