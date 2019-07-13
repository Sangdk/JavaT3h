package com.t3h.quanlydanhba.main;

import com.t3h.quanlydanhba.danhba.DanhBa;
import com.t3h.quanlydanhba.danhba.QuanLy;

public class Main {
    public static void main(String[] args) {
        QuanLy ql = new QuanLy();
        DanhBa db1 = new DanhBa("Pham Van A", "0123456789");
        DanhBa db2 = new DanhBa("Pham Van B", "0961960897");
        DanhBa db3 = new DanhBa("Pham Thi C", "01689997145");

        ql.add(db1);
        ql.add(db2);
        ql.add(db3);

        ql.printdb();
        System.out.println("==========================");

        ql.addDB("Pham Thi D", "0983037116");
        System.out.println("============================");

        ql.updateDB("0123456789","0977170484");
        ql.printdb();
    }
}
