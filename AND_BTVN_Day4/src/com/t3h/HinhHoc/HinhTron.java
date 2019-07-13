package com.t3h.HinhHoc;

import com.t3h.ButVe.ButVe;

public class HinhTron extends HinhHoc {
    public HinhTron(ButVe butVe, String ten) {
        super(butVe, ten);
    }

    @Override
    public void ve() {
        System.out.print(ten + " duoc ve bang ");
        butVe.ve();

    }
}
