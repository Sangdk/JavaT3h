package com.t3h.ConNguoi.Main;

import com.t3h.ConNguoi.ConNguoi.NguoiMau;
import com.t3h.ConNguoi.ConNguoi.VanDongVien;
import com.t3h.ConNguoi.DongVat.Cho;
import com.t3h.ConNguoi.DongVat.Meo;

public class Main {
    public static void main(String[] args) {
        Cho cho = new Cho("Cucu",2,true,"tay tang");
        VanDongVien vdv = new VanDongVien("Nguyen Van A",30,"Ha noi","cau thu",cho,100,"Mu",7);
        vdv.inThongTin();
        vdv.datDongVatDiDao();
        System.out.println("================");
        Meo meo = new Meo("kiki",2,false,"Tam the");
        NguoiMau nm = new NguoiMau("Nguyen Thi B",21,"Ha noi","Nguoi mau"

                ,meo,"A");
        nm.inThongTin();
        nm.datDongVatDiDao();
    }
}
