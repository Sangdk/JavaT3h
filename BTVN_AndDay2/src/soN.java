import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.*;

public class soN {
    int soN, x;

    public void nhapN() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so x: ");
        x = scan.nextInt();
        System.out.print("Nhap so N(3<n<50 ): ");
        soN = scan.nextInt();
        while (soN < 3 || soN > 50) {
            System.out.print("Moi ban nhap lai: ");
            soN = scan.nextInt();
        }
        System.out.println("Bai1 = " + bai1());
        System.out.println("Bai2 = " + bai2());
        System.out.println("Bai3 = " + bai3());
        System.out.println("Bai4 = " + bai4());
        System.out.println("Bai5 = " + bai5());
        System.out.println("Bai6 = " + bai6());
        System.out.println("Bai7 = " + bai7());
        System.out.println("Bai8 = " + bai8());
        System.out.println("Bai9 = " + bai9());
        System.out.println("Bai10 = " + bai10());
        System.out.println("Bai11 = " + bai11());
        System.out.println("Bai12 = " + bai12());
        System.out.println("Bai13 = " + bai13());
        System.out.println("Bai14 = " + bai14());
        System.out.println("Bai15 = " + bai15(soN));
        scan.close();
    }

    public int bai1() {
        int S = 0;
        for (int i = 1; i <= soN; i++) {
            S = S + i;
        }
        return S;
    }

    public double bai2() {
        double S = 0;
        for (double i = 1; i <= soN; i++) {
            S = S + Math.pow(i, 2);
        }
        return S;
    }

    public float bai3() {
        float S = 0;
        for (float i = 1; i <= soN; i++) {
            S = S + 1 / i;
        }
        return S;
    }

    public float bai4() {
        float S = 0;
        for (float i = 1; i <= soN; i++) {
            S = S + 1 / (2 * i);
        }
        return S;
    }

    public float bai5() {
        float S = 0;
        for (float i = 1; i <= soN; i++) {
            S = S + 1 / (2 * i + 1);
        }
        return S;
    }

    public float bai6() {
        float S = 0;
        for (float i = 1; i <= soN; i++) {
            S = S + 1 / (i * (i + 1));
        }
        return S;
    }

    public float bai7() {
        float S = 0;
        for (float i = 1; i <= soN; i++) {
            S = S + i / (i + 1);
        }
        return S;
    }

    public float bai8() {
        float S = 0;
        for (float i = 1; i <= soN; i++) {
            S = S + (2 * i + 1) / (2 * i + 2);
        }
        return S;
    }

    public long bai9() {
        long S = 1;
        for (int i = 1; i <= soN; i++) {
            S = S * i;
        }
        return S;
    }

    public long bai9_1(long i) {
        long S = 1;
        for (long j = 1; j <= i; j++) {
            S = S * j;
        }
        return S;
    }

    public long bai10() {
        long S = 1;
        for (int i = 1; i <= soN; i++) {
            S = S * x;
        }
        return S;
    }

    public long bai10_1(long i) {
        long S = 1;
        for (int j = 1; j <= i; j++) {
            S = S * x;
        }
        return S;
    }

    public long bai11() {
        long S = 0;
        for (long i = 1; i <= soN; i++) {
            S = S + bai9_1(i);
        }
        return S;
    }

    public long bai12() {
        long S = 0;
        for (long i = 1; i <= soN; i++) {
            S = S + bai10_1(i);
        }
        return S;
    }

    public long bai13() {
        long S = 0;
        for (long i = 1; i <= soN; i++) {
            S = S + bai10_1(i * 2);
        }
        return S;
    }

    public long bai14() {
        long S = 0;
        for (long i = 0; i <= soN; i++) {
            S = S + bai10_1((i * 2) + 1);
        }
        return S;
    }
    public long bai15(int n){
        if(n == 1 || n == 0){
            return 1;
        }else{
            return n*bai15(n -1);
        }
    }


}
