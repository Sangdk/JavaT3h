package com.t3h.main;

import com.t3h.ButVe.ButDo;
import com.t3h.ButVe.ButXanh;
import com.t3h.HinhHoc.HinhChuNhat;
import com.t3h.HinhHoc.HinhTamGiac;
import com.t3h.HinhHoc.HinhTron;

public class Main {
    public static void main(String[] args) {


        ButDo bd = new ButDo("do");
        HinhChuNhat hcn =new HinhChuNhat(bd,"Hinh chu nhat");
        ButXanh bx = new ButXanh("xanh");
        HinhTron ht = new HinhTron(bx,"Hinh tron");
        HinhTamGiac htg = new HinhTamGiac(bd,"Hinh tam giac");

        hcn.ve();
        ht.ve();
        htg.ve();
    }
}
