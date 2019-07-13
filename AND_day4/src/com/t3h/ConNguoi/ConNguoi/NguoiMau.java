package com.t3h.ConNguoi.ConNguoi;


import com.t3h.ConNguoi.DongVat.Meo;

public class NguoiMau extends ConNguoi{
    private Meo meo;
    private String congTy;


    public NguoiMau(String ten, int tuoi, String diaChi, String ngheNghiep, Meo meo, String congTy) {
        super(ten, tuoi, diaChi, ngheNghiep);
        this.meo = meo;
        this.congTy = congTy;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Cong ty : "+congTy);
    }

    @Override
    public void datDongVatDiDao() {
        System.out.println("Dat meo di shopping");
    }
}
