package com.t3h.quanlycanbo;

import java.util.Scanner;

public class CongNhan extends CanBo{
    private String bac;

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap bac: ");
        bac = sc.nextLine();
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Bac: "+bac);
    }
}
