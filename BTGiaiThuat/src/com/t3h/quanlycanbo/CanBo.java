package com.t3h.quanlycanbo;

import java.util.Scanner;

public class CanBo {
    private String hoTen;
    private int namSinh;
    private boolean gioiTinh;
    private String diaChi;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao gioiTinh(nam/nu): ");
        String gt = sc.nextLine();
        if (gt.equalsIgnoreCase("nam"))
            gioiTinh = false;
        else gioiTinh = true;
        System.out.println("Nhap vao dia chi: ");
        diaChi = sc.nextLine();
    }

    public String getHoTen() {
        return hoTen;
    }

    public  void inThongTin(){
        System.out.println("Ho Ten: "+hoTen);
        System.out.println("Nam sinh: "+namSinh);
        System.out.println("Gioi tinh: "+(gioiTinh?"Nu":"Nam"));
        System.out.println("Dia chi: "+diaChi);
    }
}
