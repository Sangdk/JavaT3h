package com.t3h.mystring;

public class Main {
    public static void main(String[] args) {
        MyString mstr = new MyString("gLN83b4");
        //String for standardized
//        MyString mstr = new MyString("3+4-5-6+9+1--+4-+23-10");
        //String for deleteUnicode
//        MyString mstr = new MyString("Một bước yêu vạn dặm đau");
        MyString mstru = new MyString("wo ai ni, ni ai wo ma");
        mstr.sumAscii();
        mstr.sort();
        mstr.sort_1();
        mstr.findPrint();
        mstr.checkReverse();
        mstr.checkReverse();
        mstru.toUpCase();
        mstru.reverseWord();
//        mstru.reverseWord1();
        mstr.sumCharNumber();
        mstr.sumNumber();
        mstr.trimAndSplit();
//        mstr.standardized();
//        mstr.deleteUnicode();
    }
}