package com.t3h.quanlycanbo;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
    ArrayList<CanBo> qlcb = new ArrayList<>();

    public void nhap() {
        int x = 0;
        do {
            System.out.println("Chon loai can bo muon nhap: ");
            System.out.println("1:Cong nhan");
            System.out.println("2:Ky su");
            System.out.println("3:Nhan vien phuc vu");
            System.out.println("4:Thoat");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();

            switch (x) {
                case 1: {
                    CanBo cn = new CongNhan();
                    cn.nhap();
                    qlcb.add(cn);
                    break;
                }
                case 2: {
                    CanBo ks = new KySu();
                    ks.nhap();
                    qlcb.add(ks);
                    break;
                }
                case 3: {
                    CanBo nvpv = new NhanVien();
                    nvpv.nhap();
                    qlcb.add(nvpv);
                }
                case 4: {
                    break;
                }
            }
        } while (x != 4);
    }

    public void inThongTin() {
        for (CanBo cb : qlcb
        ) {
            if (cb instanceof KySu) {
                KySu ks = (KySu) cb;
                ks.inThongTin();
                System.out.println();
            } else if (cb instanceof NhanVien) {
                NhanVien nv = (NhanVien) cb;
                cb.inThongTin();
                System.out.println();
            } else if (cb instanceof CongNhan) {
                CongNhan cn = (CongNhan) cb;
                cb.inThongTin();
                System.out.println();
            }
        }
    }

    public void findByName() {
        System.out.println("Nhap ten can tim:");
        Scanner sc = new Scanner(System.in);
        String hoten = sc.nextLine();
        for (CanBo cb : qlcb
        ) {
            if (cb.getHoTen().equalsIgnoreCase(hoten)) {
                if (cb instanceof KySu) {
                    KySu ks = (KySu) cb;
                    ks.inThongTin();
                    System.out.println();
                } else if (cb instanceof NhanVien) {
                    NhanVien nv = (NhanVien) cb;
                    cb.inThongTin();
                    System.out.println();
                } else if (cb instanceof CongNhan) {
                    CongNhan cn = (CongNhan) cb;
                    cb.inThongTin();
                    System.out.println();
                }
            }
        }
    }

}
