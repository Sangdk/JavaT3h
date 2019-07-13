package com.t3h.mangtinh;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.*;

public class MangTinh {
    private Integer[] arr = new Integer[5];

    public MangTinh() {
        arr[0] = 10;
        arr[1] = 2;
        arr[2] = 5;
        arr[3] = 0;
        arr[4] = 7;
    }

    //    public void sapXep() {
//        for (int i = 0; i < arr.length -1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//
//            }
//        }
//
//    }
    public void sapXep() {
        Arrays.sort(arr, comparator);
    }

    private Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 > o2) {
                return -1;
            }
            return 0;
        }
    };

    public void inMang() {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
