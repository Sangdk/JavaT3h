public class NhanVien extends ConNguoi {
    String chucVu;
    int luong;

    void nhap(String ten, int tuoi,boolean gioiTinh, String diaChi, String chucVu, int luong) {
        super.nhap( ten, tuoi, gioiTinh,diaChi);
        this.chucVu = chucVu;
        this.luong = luong;
    }

    @Override
    void inThongTin() {
        super.inThongTin();
        System.out.println("Chuc Vu : " + chucVu);
        System.out.println("Luong : " + luong);
    }

    void hop() {
        System.out.println("Hop giai quyet cong viec");
    }

    void lamViec() {
        System.out.println("Lam viec kiem tien");
    }
}
