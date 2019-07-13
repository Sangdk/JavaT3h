package com.t3h.quanlycanbo;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao;

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nganh dao tao: ");
        nganhDaoTao = sc.nextLine();
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Nganh dao tao: "+nganhDaoTao);
    }
    public void funcion(){

    }
}
