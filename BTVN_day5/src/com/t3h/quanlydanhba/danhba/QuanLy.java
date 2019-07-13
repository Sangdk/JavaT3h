package com.t3h.quanlydanhba.danhba;


import java.util.ArrayList;

public class QuanLy {

    private ArrayList<DanhBa> listDB = new ArrayList<>();

    public void add(DanhBa db) {
        listDB.add(db);
    }

    public void printdb() {
        for (DanhBa d : listDB
        ) {
            System.out.println(d);
        }
    }

    public boolean check(String gtSDT) {
        for (DanhBa d : listDB
        ) {
            if (d.getSdt() == gtSDT)
                return true;
        }
        return false;
    }

    public void addDB(String gtTen, String gtSDT) {
        if (check(gtSDT) == true) {
            System.out.println("Danh ba nay da ton tai");
        } else {
            DanhBa db = new DanhBa(gtTen, gtSDT);
            listDB.add(db);
            System.out.println("Da them danh ba thanh cong");
        }
    }

    public void updateDB(String gtriSDT, String SDTmoi) {
        for (DanhBa d : listDB
        ) {
            if (d.getSdt() == gtriSDT) {
                d.setSdt(SDTmoi);
            }
        }
    }

}
