import java.util.Scanner;

import static java.lang.Math.*;

public class soND {
    int soND;
    int n, m, h;
    double a, b, c;

    public void NhapND() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so ND: ");
        soND = scan.nextInt();
        //So ND
        while (soND < 0) {
            System.out.print("Moi ban nhap lai: ");
            soND = scan.nextInt();
        }
        //Tim UC
        do {
            System.out.print("Nhap so n: ");
            n = scan.nextInt();
            System.out.print("Nhap so m: ");
            m = scan.nextInt();
        } while (n < 0 && m < 0);
        //tinh phuong trinh
        do {
            System.out.print("Nhap so a(a#0): ");
            a = scan.nextInt();
            System.out.print("Nhap so b: ");
            b = scan.nextInt();
            System.out.print("Nhap so c: ");
            c = scan.nextInt();
        } while (a == 0);
        //Ve tam giac
        do {
            System.out.println("Nhap vao chieu cao h(>0) :");
            h = scan.nextInt();
        } while (h <= 0);
        System.out.println("Bai 17 : Tong va tich cac uoc cua " + soND + " la: " + bai17_1() + "  " + bai17_2());
    }

    public void bai16() {
        System.out.print("Bai 16: Cac uoc cua" + soND + " la: ");
        for (int i = 1; i <= soND; i++) {
            if (soND % i == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println(" ");
    }

    public int bai17_1() {
        int S = 0;
        for (int i = 1; i <= soND; i++) {
            if (soND % i == 0) {
                S += i;
            }
        }
        return S;
    }

    public int bai17_2() {
        int S = 1;
        for (int i = 1; i <= soND; i++) {
            if (soND % i == 0) {
                S *= i;
            }
        }
        return S;
    }

    public void bai18() {
        int dem_1 = 0;
        int dem_2 = 0;
        int dem_3 = 0;
        for (int i = 1; i <= soND; i++) {
            if (soND % i == 0) {
                dem_1++;
                if (i % 2 == 0) {
                    dem_2++;
                } else {
                    dem_3++;
                }
            }
        }
        System.out.println("Bai 18: Cac uoc cua " + soND + " la: " + dem_1);
        System.out.println("        Cac uoc chan la: " + dem_2);
        System.out.println("        Cac uoc le la: " + dem_3);
    }

    public void bai19() {
        System.out.print("Bai 19: ");
        int dem = 0;
        for (int i = 1; i <= soND; i++) {
            if (soND % i == 0) {
                dem++;
            }
        }
        if (dem == 2) {
            System.out.println(soND + " la so nguyen to");
        } else {
            System.out.println(soND + " khong phai la so nguyen to");
        }
    }

    public void bai20() {
        int n = (int) sqrt(soND);
        if (n * n == soND) {
            System.out.println("Bai 20: " + soND + " la so chinh phuong");
        } else {
            System.out.println("Bai 20: " + soND + " khong phai la so chinh phuong");
        }
    }

        public void bai21_22() {
        int UCLN = 0, BCNN = 0;
        int min = 0, max = 0;
        if (n - m > 0) {
            min = m;
            max = n;
        } else {
            min = n;
            max = m;
        }
        for (int i = 1; i <= min; i++) {
            if (min % i == 0 && max % i == 0) {
                UCLN = i;
            }
        }
        BCNN = m * n/UCLN;
        System.out.println("Bai 21_22 : Uoc chung lon nhat va Boi chung nho nhat cua m va n la: " + UCLN + " va " + BCNN);
    }
    public void bai23() {
        double x = -b / a;
        System.out.print("Bai 23 : ");
        System.out.println("phuong trinh " + a + "x + " + b + " = 0 co nghiem la x = " + x);
    }

    public void bai24() {
        double delta = b * b - 4 * a * c;
        System.out.print("Bai 24 : ");
        if (delta < 0) {
            System.out.println("phuong trinh " + a + "x^2 + " + b + "x + " + c + " = 0 vo nghiem ");
        } else if (delta == 0) {
            double x = -b / 2 * a;
            System.out.println("phuong trinh " + a + "x^2 + " + b + "x " + c + " = 0 co nghiem kep:  " + x);
        } else {
            double x1 = (-b - sqrt(delta)) / 2 * a;
            double x2 = (-b + sqrt(delta)) / 2 * a;
            System.out.println("phuong trinh " + a + "x^2 + " + b + "x" + c + " = 0 co 2 nghiem phan biet: " + "x1 = " + x1 + " x2 = " + x2);
        }
    }

        public void bai25() {
        Scanner scan = new Scanner(System.in);
        int year;
        System.out.println("Nhap so nam : ");
        year = scan.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Nam "+year+" la nam nhuan ");
        }else{
            System.out.println("Nam "+year+" khong phai la nam nhuan ");
        }

    }
    public void bai26(){
        System.out.print("Bai 26 : Cac so nguyen le nho hon n la : ");
        for(int i=1; i<n;i++){
            if(i%2 != 0){
                System.out.print(i+",");
            }
        }
    }
    public void bai27(){
        System.out.print("\n"+"Bai 27 : Cac so nguyen le nho hon n (tru 7,21,41) la : ");
        for(int i=1; i<n;i++){
            if(i==7 || i ==21 || i ==41){
                continue;
            }
            if(i%2 != 0){
                System.out.print(i+",");
            }
        }
    }
    public void bai28() {
        System.out.println("Bai 28 :");
        for (int j = 1; j <= h; j++) {
            for (int i = 1; i <= (h - j); i++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= j; k++) {
                System.out.print("*");
                System.out.print(" ");

            }
            System.out.println("");
        }
    }

    public void bai29() {
        System.out.println("Bai 29 :");
        for (int j = 1; j <= h; j++) {
            for (int i = 1; i <= (h - j); i++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= j; k++) {
                if (j == 1 || j == h) {
                    System.out.print("*");
                    System.out.print(" ");
                } else {
                    if (k == 1 || k == j) {
                        System.out.print("*");
                        System.out.print(" ");
                    } else if (k > 1 && k < j) {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }
    }

    public void bai30() {
        System.out.println("Bai 30 :");
        for (int j = 0; j < h; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

        public void bai31() {
        System.out.println("Bai 31 :");
        for (int j = 1; j <= h; j++) {
            for (int i = 1; i <= j; i++) {
                if (j == 1 || j == h) {
                    System.out.print("*");
                    System.out.print(" ");
                } else {
                    if (i == 1 || i == j) {
                        System.out.print("*");
                        System.out.print(" ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }
    }

    public void bai32() {
        System.out.println("Bai 32 :");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public void bai33() {
        System.out.println("Bai 33 :");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == m) {
                    System.out.print("*");
                    System.out.print(" ");
                }else{
                    if(j ==1||j==n){
                        System.out.print("*");
                        System.out.print(" ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }
    }


}
