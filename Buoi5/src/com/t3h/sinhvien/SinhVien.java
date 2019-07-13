package com.t3h.sinhvien;


public class SinhVien {
    private String ten;
    private int tuoi;
    private double diem;

    public SinhVien(String ten, int tuoi, double diem) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void inThongTin() {
        System.out.println("Ten :" + ten);
        System.out.println("Tuoi :" + tuoi);
        System.out.println("Diem :" + diem);
    }
}
