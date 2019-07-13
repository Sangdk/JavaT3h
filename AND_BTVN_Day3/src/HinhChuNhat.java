import static java.lang.Math.sqrt;

public class HinhChuNhat extends HinhHoc {
    int a,b;

    public HinhChuNhat(String ten, int a, int b) {
        super(ten);
        this.a = a;
        this.b = b;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
    }

    @Override
    public void tinhChuVi() {
        double chuVi = (a+b)*2;
        System.out.println("Chu vi hinh chu nhat la : "+chuVi);
    }

    @Override
    public void tinhDienTich() {
        double dienTich = a * b;
        System.out.println("Dien tich hinh chu nhat la : "+dienTich);
    }

    public void canh_Dc() {
        double dc = sqrt(a*b)*sqrt(2);
        System.out.println("Chieu dai duong cheo hinh chu nhat la : " + dc);
        System.out.println("Tong chieu dai cac canh va duong cheo la :" + (dc +(a+b)*2));
    }
}
