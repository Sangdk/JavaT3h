package com.t3h.phanso;

public class Main {
    public static void main(String[] args) {
        System.out.println("Phan so a: ");
        PhanSo ps = new PhanSo();
        System.out.println("Phan so b: ");
        PhanSo ps1 = new PhanSo();
//        PhanSo ps2 = new PhanSo();
//        PhanSo ps3 = new PhanSo();
        System.out.println("a+b= "+ps.cong(ps,ps1));
        System.out.println("a-b= "+ps.tru(ps,ps1));
        System.out.println("a*b= "+ps.nhan(ps,ps1));
        System.out.println("a/b= "+ps.chia(ps,ps1));

//        ps.kiemtra();
        ps.convert();
        ps1.convert();
//        ps2.convert();
//        ps3.convert();
    }
}
