package com.t3h.ConNguoi.ConNguoi;

public abstract class ConNguoi {
    protected String ten;
    protected int tuoi;
    protected String diaChi;
    protected String ngheNghiep;
    protected boolean gioiTinh;

    public ConNguoi(String ten, int tuoi, String diaChi, String ngheNghiep) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.ngheNghiep = ngheNghiep;
        this.gioiTinh = gioiTinh;
    }

    public abstract void datDongVatDiDao();
    public void inThongTin(){
        System.out.println("Ten : "+ten);
        System.out.println("Tuoi :"+tuoi);
        System.out.println("Gioi Tinh :"+(gioiTinh?"Nam":"Nu"));
        System.out.println("Dia Chi : "+diaChi);
        System.out.println("Nghe Nghiep : "+ngheNghiep);
    }
}
