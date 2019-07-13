package com.t3h.ConNguoi.DongVat;

public class Meo extends DongVat {
    public Meo(String ten, int tuoi, boolean gioiTinh, String loai) {
        super(ten, tuoi, gioiTinh, loai);
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
    }

    public  void batChuot(){
        System.out.println("Bat chuot pha lua");
    }
}
