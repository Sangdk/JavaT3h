import java.util.Scanner;

public class Sothuc {
    double a, b;

    public void Nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        a = scan.nextDouble();
        System.out.print("Nhap so b: ");
        b = scan.nextDouble();
    }

    public void Tinh() {
        int x = 0;
        Scanner scan = new Scanner(System.in);
        double cong = a + b;
        double tru = a - b;
        double nhan = a * b;
        double chia = a / b;
        double lay_du = a % b;
        do {
            System.out.println("Moi ban chon phep tinh:");
            System.out.println("1: Cong");
            System.out.println("2: Tru");
            System.out.println("3: Nhan");
            System.out.println("4: Chia");
            System.out.println("5: Chia lay du");
            System.out.println("6: Thoat");
            x = scan.nextInt();
            switch (x) {
                case 1:
                    System.out.println(a + " + " + b + " = " + cong);
                    break;
                case 2:
                    System.out.println(a + " - " + b + " = " + tru);
                    break;
                case 3:
                    System.out.println(a + " * " + b + " = " + nhan);
                    break;
                case 4:
                    System.out.println(a + " / " + b + " = " + chia);
                    break;
                case 5:
                    System.out.println(a + " % " + b + " = " + lay_du);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Moi ban chon lai: ");
                    break;
            }
        }
        while (x != 6);
    }
}
