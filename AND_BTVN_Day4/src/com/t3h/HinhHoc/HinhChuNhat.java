package com.t3h.HinhHoc;

import com.t3h.ButVe.ButVe;

public class HinhChuNhat extends HinhHoc {

    public HinhChuNhat(ButVe butVe, String ten) {
        super(butVe, ten);
    }

    @Override
    public void ve() {
        System.out.print(ten+" duoc ve bang ");
        butVe.ve();
    }
}
