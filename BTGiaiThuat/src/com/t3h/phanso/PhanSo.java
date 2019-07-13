package com.t3h.phanso;

import java.util.Scanner;

public class PhanSo {
    private float tuso;
    private float mauso;

    public PhanSo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap tu so: ");
        tuso = scan.nextInt();
        System.out.println("Nhap mau so: ");
        mauso = scan.nextInt();
    }
    public float giatri(){
        float giatri= tuso/mauso;
        return  giatri;
    }
    public float cong(PhanSo a,PhanSo b){
        float cong = a.giatri()+b.giatri();
        return cong;
    }
    public float tru(PhanSo a,PhanSo b){
        float tru = a.giatri() - b.giatri();
        return tru;
    }
    public float nhan(PhanSo a,PhanSo b){
        float nhan = a.giatri() *b.giatri();
        return  nhan;
    }
    public float chia(PhanSo a,PhanSo b){
        float chia = a.giatri() /b.giatri();
        return chia;
    }

    public int kiemtra() {
        float min = 0;
        int dem = 0;
        int UCLN = 0;
        if (tuso >= mauso) {
            min = mauso;
        } else {
            min = tuso;
        }
        for (int i = 1; i <= min; i++) {
            if (tuso % i == 0 && mauso % i == 0) {
                dem++;
                UCLN = i;
            }
        }

        if (dem > 1) {
            System.out.println("Phan so " + tuso + "/" + mauso + " chua toi gian");
        } else {
            System.out.println("Phan so " + tuso + "/" + mauso + " da toi gian");
            UCLN =-1;
        }
        return UCLN;
    }

    public void convert() {
        int UCLN = kiemtra();
        if(UCLN!=-1)
        System.out.println("Dang toi gian cua phan so la: "+tuso/UCLN+"/"+mauso/UCLN);
    }
}
