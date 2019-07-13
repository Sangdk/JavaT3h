package com.t3h.sinhvien;

public class Main {
    public static void main(String[] args) {
        SinhVien sv =new SinhVien("Pham Van A",21,8.5);
        SinhVien sv1 =new SinhVien("Pham Van B",22,9);
        SinhVien sv2 =new SinhVien("Pham Thi B",20,9.5);
        SinhVien sv3 =new SinhVien("Pham Thi C",19,10);
        SinhVien sv4 =new SinhVien("Pham Van D",18,4);
        SinhVien sv5 =new SinhVien("Pham Van E",22,1);

        Lop lop = new Lop();

        lop.add(sv);
        lop.add(sv1);
        lop.add(sv2);
        lop.add(sv3);
        lop.add(sv4);
        lop.add(sv5);

        lop.set(2, sv2);
        lop.sort();

        lop.setDiem(5);
        lop.deleteDiem(5);
        lop.inThongTin();




    }
}
