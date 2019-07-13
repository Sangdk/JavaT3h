package com.t3h.stringbuilder;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello world");
        System.out.println(builder);
        builder.append(" Android");
        System.out.println(builder);
        builder.insert(6,"Hi ");
        System.out.println(builder);
        builder.delete(6,9);
        System.out.println(builder);
        builder.reverse();
        String s = builder.toString();
        System.out.println(builder);
        String a = "abccba";
        StringBuilder ab = new StringBuilder(a);
        String b = "cba";
        StringBuilder bb = new StringBuilder(b);
        boolean check =a.equals(b);
        System.out.println(check);
        String ss = ab.reverse().toString();
         check = a.equals(ss);
        System.out.println(check);
    }
}
