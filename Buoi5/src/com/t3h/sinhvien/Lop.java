package com.t3h.sinhvien;

import java.util.ArrayList;
import java.util.Comparator;

public class Lop {
    private ArrayList<SinhVien> arr = new ArrayList<>();



    public void add(SinhVien sv) {
        arr.add(sv);
    }

    public void set(int index, SinhVien sv) {
        arr.set(index, sv);
    }

    public void setDiem(int score) {
        for (SinhVien s : arr
        ) {
            if (s.getDiem() <= score) {
                s.setDiem(s.getDiem() + 3);
            }
            ;
        }
    }

    public void deleteDiem(int score) {
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (
                    arr.get(i).getDiem() < score
            ) {
                arr.remove(i);
            }
        }
    }

    public void remove(int index) {
        arr.remove(index);
    }

    public void inThongTin() {
        for (SinhVien s : arr) {
            s.inThongTin();
            System.out.println();
        }
    }

    public void sort() {
        arr.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getDiem() < o2.getDiem()) {
                    return -1;
                }
                return 0;
            }
        });
    }
}
