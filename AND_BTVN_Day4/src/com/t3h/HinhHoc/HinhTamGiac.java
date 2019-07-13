package com.t3h.HinhHoc;

import com.t3h.ButVe.ButDo;
import com.t3h.ButVe.ButVe;

public class HinhTamGiac extends HinhHoc {
    public HinhTamGiac(ButVe butVe, String ten) {
        super(butVe, ten);
    }

    @Override
    public void ve() {
        System.out.print(ten+" duoc ve bang ");
        butVe.ve();
    }
}
