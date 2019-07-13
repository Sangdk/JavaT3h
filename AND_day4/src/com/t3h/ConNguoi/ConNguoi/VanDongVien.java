package com.t3h.ConNguoi.ConNguoi;


import com.t3h.ConNguoi.DongVat.Cho;

public class VanDongVien extends ConNguoi {
    private Cho cho;
    private int soBanThang;
    private String cauLacBo;
    private int soAo;

    public VanDongVien(String ten, int tuoi, String diaChi, String ngheNghiep, Cho cho, int soBanThang, String cauLacBo, int soAo) {
        super(ten, tuoi, diaChi, ngheNghiep);
        this.cho = cho;
        this.soBanThang = soBanThang;
        this.cauLacBo = cauLacBo;
        this.soAo = soAo;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Cau lac bo : " + cauLacBo);
        System.out.println("So ao : " + soAo);
        System.out.println("SO ban thang : " + soBanThang);
    }

    @Override
    public void datDongVatDiDao() {
        System.out.println("Dat cho di dao cong vien");
    }
}
