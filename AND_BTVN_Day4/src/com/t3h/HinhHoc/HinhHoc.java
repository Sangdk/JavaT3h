package com.t3h.HinhHoc;

import com.t3h.ButVe.ButVe;

public abstract class HinhHoc {
    ButVe  butVe;
    String ten;

    public HinhHoc(ButVe butVe, String ten) {
        this.butVe = butVe;
        this.ten = ten;
    }
    public abstract void ve();
}
