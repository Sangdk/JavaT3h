package com.t3h.quanlycanbo;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String congViec;

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cong viec: ");
        congViec = sc.nextLine();
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Cong viec: "+congViec);
    }
}
