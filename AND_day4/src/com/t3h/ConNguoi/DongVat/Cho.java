package com.t3h.ConNguoi.DongVat;

public class Cho extends DongVat{
    public Cho(String ten, int tuoi, boolean gioiTinh, String loai) {
        super(ten, tuoi, gioiTinh, loai);
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
    }

    public void coiNha(){
        System.out.println("Coi nha");
    }
}
