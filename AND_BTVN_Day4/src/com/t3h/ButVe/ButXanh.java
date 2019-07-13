package com.t3h.ButVe;

public class ButXanh extends ButVe {


    public ButXanh(String ten) {
        this.ten =ten;
    }

    @Override
    public void ve() {
        System.out.println("mau " + ten);
    }
}
