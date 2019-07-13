public class HinhTron extends HinhHoc {
    int r;

    public HinhTron(String ten, int r) {
        super(ten);
        this.r = r;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
    }

    @Override
    public void tinhChuVi() {
        double chuVi = 2*r*3.14;
        System.out.println("Chu vi hinh tron la : "+chuVi);

    }

    @Override
    public void tinhDienTich() {
        double dienTich = 3.14 * r * r;
        System.out.println("Dien tich hinh tron la : "+dienTich);
    }

    public void tamGiacVcNoiTiep() {
        int dt = r * r;
        System.out.println("Dien tich tam giac vuong can noi tiep duong tron la : " + dt);
    }
}
