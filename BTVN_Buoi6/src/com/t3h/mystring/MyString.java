package com.t3h.mystring;

import java.util.ArrayList;
import java.util.Comparator;

public class MyString {
    private String strb = new String();

    public MyString(String strb) {
        this.strb = strb;
    }

    public String getStrb() {
        return strb;
    }

    public void sumAscii() {
        int sA = 0;
        for (int i = 0; i < strb.length(); i++) {
            int a = strb.charAt(i);
            sA += a;
        }
        System.out.println("Tong ma ASCII cua chuoi la : " + sA);
    }

    public void sort() {
        StringBuilder sb = new StringBuilder(strb);
        for (int i = 0; i < sb.length() - 1; i++) {
            for (int j = i + 1; j < sb.length(); j++) {
                if (sb.charAt(i) > sb.charAt(j)) {
                    char temp = sb.charAt(j);
                    sb.setCharAt(j, sb.charAt(i));
                    sb.setCharAt(i, temp);
                }
            }
        }
        System.out.println(sb.toString());
    }

    public void sort_1() {
        ArrayList<Character> arr = new ArrayList();
        for (int i = 0; i < strb.length(); i++) {
            char c = strb.charAt(i);
            arr.add(c);
        }
        arr.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                if (o1 < o2) {
                    return -1;
                }
                return 0;
            }
        }
        );
        String result = "";
        for (int i = 0; i < arr.size(); i++) {
            result += arr.get(i);
        }
        System.out.println(result);
    }

    public void findPrint() {
        for (int i = 0; i < strb.length(); i++) {
            if ('A' <= strb.charAt(i) && strb.charAt(i) <= 'Z') {
                System.out.print(strb.charAt(i) + "\t");
            }
        }
    }

    public void checkReverse() {
        StringBuilder sb = new StringBuilder(strb);
        String sbr = sb.reverse().toString();
        boolean check = strb.equals(sbr);
        System.out.println("\n" + check);
    }

    public void toUpCase() {
        StringBuilder sb = new StringBuilder(strb);
        int a = sb.indexOf(" ");
        while (a != -1) {
            int b = (int) sb.charAt(a + 1) - 32;
            char c = (char) b;
            sb.setCharAt(a + 1, c);
            a = sb.indexOf(" ", a + 2);
        }
        int first = (int) sb.charAt(0) - 32;
        char First = (char) first;
        sb.setCharAt(a + 1, First);
        System.out.println(sb);
    }

    public void reverseWord() {
        int i = strb.indexOf(" ");
        String v = strb.substring(0, i);
        StringBuilder vb = new StringBuilder(v);
        StringBuilder strbnew = new StringBuilder();
        strbnew.append(vb.reverse());

        System.out.println(i);
        while (i < strb.lastIndexOf(" ")) {
            String tt = strb.substring(i + 1, strb.indexOf(" ", i + 1));
            vb = new StringBuilder(tt);
            strbnew.append(" " + vb.reverse());
            i = strb.indexOf(" ", i + 1);
        }
        strbnew.append(" ");
        System.out.println(strbnew.append(new StringBuilder(strb.substring(i + 1, strb.length())).reverse()));
    }

    public void reverseWord1() {
        strb = strb.trim();
        String[] xx = strb.split(" ");
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < xx.length; i++) {
            result.append(new StringBuffer(xx[i]).reverse().toString()).append(" ");
        }
        System.out.println(result.toString());
    }

    public void sumCharNumber() {
        int S = 0;
        for (int i = 0; i < strb.length(); i++) {
            char a = strb.charAt(i);
            if ('0' <= a && a <= '9') {
                int b = (int) a - 48;
                S += b;
            }
        }
        System.out.println("SumChar = " + S);
    }

    public void sumNumber() {
        int S = 0;
        StringBuffer sb = new StringBuffer(strb);
        //chuyen ki tu khac so thanh dau ' '
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) < '0' || sb.charAt(i) > '9') {
                sb.setCharAt(i, ' ');
            }
        }
        //cat thanh 1 mang chua cac chuoi so
        String ss = sb.toString().trim();
        String[] ssub = ss.split(" ");
        //duyet lan luot cac phan tu cua mang cac so
        for (int i = 0; i < ssub.length; i++) {
            int a = ssub[i].length();
            int count = 0;
            int Ssub = 0;
            //Tinh tung phan tu cua mang
            while (a > 0) {
                char e = ssub[i].charAt(a - 1);
                double c = ((int) e - 48) * Math.pow(10, count);
                Ssub += c;
                count++;
                a--;
            }
            S += Ssub;
        }
        System.out.println("SumNumber = " + S);
    }

    public void trimAndSplit() {
        StringBuffer sb = new StringBuffer(strb);
        while (sb.charAt(0) == ' ') {
            sb.delete(0, 1);
        }
        while (sb.charAt(sb.length() - 1) == ' ') {
            sb.delete(sb.length() - 1, sb.length());
        }
        for (int i = sb.length() - 1; i > 0; i--) {
            if (sb.charAt(i) == ' ') {
                if (sb.charAt(i - 1) == ' ') {
                    sb.delete(i - 1, i);
                }
            }
        }
        System.out.println(sb);
    }

    public void deleteUnicode() {
        strb = strb.toLowerCase();
        char[] a = {'à', 'á', 'ạ', 'ả', 'ã', 'â', 'ầ', 'ấ', 'ậ', 'ẩ', 'ẫ', 'ă', 'ằ', 'ắ', 'ặ', 'ẳ', 'ẵ'};
        char[] e = {'è', 'é', 'ẹ', 'ẻ', 'ẽ', 'ê', 'ề', 'ế', 'ệ', 'ể', 'ễ'};
        char[] i = {'ì', 'í', 'ị', 'ỉ', 'ĩ'};
        char[] o = {'ò', 'ó', 'ọ', 'ỏ', 'õ', 'ô', 'ồ', 'ố', 'ộ', 'ổ', 'ỗ', 'ơ', 'ờ', 'ớ', 'ợ', 'ở', 'ỡ'};
        char[] u = {'ù', 'ú', 'ụ', 'ủ', 'ũ', 'ư', 'ừ', 'ứ', 'ự', 'ử', 'ữ'};
        char[] y = {'ỳ', 'ý', 'ỵ', 'ỷ', 'ỹ'};
        strb = strb.replace('đ', 'd');
        for (int j = 0; j < a.length; j++) {
            strb = strb.replace(a[j], 'a');
        }
        for (int j = 0; j < e.length; j++) {
            strb = strb.replace(e[j], 'e');
        }
        for (int j = 0; j < i.length; j++) {
            strb = strb.replace(i[j], 'i');
        }
        for (int j = 0; j < o.length; j++) {
            strb = strb.replace(o[j], 'o');
        }
        for (int j = 0; j < e.length; j++) {
            strb = strb.replace(u[j], 'u');
        }
        for (int j = 0; j < y.length; j++) {
            strb = strb.replace(y[j], 'y');
        }
        System.out.println(strb);
    }

    public void standardized() {
        strb = strb.replace("+-", "-");
        strb = strb.replace("-+", "-");
        strb = strb.replace("++", "+0+");
        strb = strb.replace("--", "-0-");
        System.out.println(strb);
    }
}