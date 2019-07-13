package com.t3h.string;

public class Main {
    public static void main(String[] args) {
        String str = "Hello world, black, blue, hello";
//        int length= str.length();
//        System.out.println(length);
//        char c = str.charAt(10);
//        System.out.println(c);
//        int index = str.indexOf("l");
//        System.out.println(index);
//        int second =str.indexOf("l",index+29);
//        System.out.println(second);
//        int last = str.lastIndexOf("l");
//        System.out.println(last);
//        for (int i = 0; i < str.length() ; i++) {
//            if(str.charAt(i)== 'l'){
//                System.out.println(i);
//            }
//        }
//        System.out.println("=======================");
//        int i =str.indexOf("l");
//        while(i!=-1){
//            System.out.print(i+"\t");
//            i = str.indexOf("l",i+1);
//        }
        String str1 = "HELLO world, black, blue, hello";
        boolean check = str.equals("HELLO world, black, blue, hello");
        System.out.println(check);
        check = str.equalsIgnoreCase(str1);
        System.out.println(check);

        char a = 'a';
        int b = (int) a;
        System.out.println(b);
        int c = 65;
        char e = (char) c;
        System.out.println(e);

        int com = str.compareTo(str1);
        System.out.println(com);
        com = str.compareToIgnoreCase(str1);
        System.out.println(com);

        str = str.replace("l", "L");
        System.out.println(str);

        String sub = str.substring(6);
        System.out.println(sub);
        sub = str.substring(6, 11);
        System.out.println(sub);

        str = str.toUpperCase();
        System.out.println(str);
        str = str.toLowerCase();
        System.out.println(str);


        int i = str.indexOf(" ");
        String v = str.substring(0, 1);
        str = str.replaceFirst(v, v.toUpperCase());
        while (i != -1) {
            String tt = str.substring(i, i + 2);
            str = str.replace(tt, tt.toUpperCase());
            i = str.indexOf(" ", i + 1);
        }
        System.out.println(str);

        String[] arr = str.split(" ");
        for (String s : arr
        ) {
            System.out.println(s);
        }

        String str2 = "     sada asdas asdas      ";
        str2 = str2.trim();
        System.out.println(str2);

        String str3 = "Hello W";
        check = str.contains(str3);
        System.out.println(check);

        check = str.isEmpty(); // str.length ==0
        System.out.println(check);
        //=============================


    }
}
