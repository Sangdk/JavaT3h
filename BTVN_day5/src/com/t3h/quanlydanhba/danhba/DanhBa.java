package com.t3h.quanlydanhba.danhba;

public class DanhBa {
    private String ten;
    private String sdt;

    public DanhBa(String ten, String sdt) {
        this.ten = ten;
        this.sdt = sdt;
    }


    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "Ten : " + ten + "\n"
                + "SDT : " + sdt;
    }
}
