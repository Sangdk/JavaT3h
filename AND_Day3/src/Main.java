public class Main {
    public static void main(String[] args) {
        HocSinh hs = new HocSinh();
        NhanVien nv = new NhanVien();
        hs.nhap("Nguyen Van A", 10, true, "Ha noi", 9, "Android");
        hs.inThongTin();
        hs.hoc();
        hs.lamBai();

        System.out.println("=========================================");

        nv.nhap("Nguyen Thi B", 28, false, "Ha noi", "Truong phong", 15000000);
        nv.inThongTin();
        nv.hop();
        nv.lamViec();
    }
}
