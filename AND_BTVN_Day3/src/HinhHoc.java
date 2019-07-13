public abstract class HinhHoc {
    protected String ten;

    public HinhHoc(String ten) {
        this.ten = ten;
    }

    public void inThongTin() {
        System.out.println(ten);
    }

    public abstract void tinhChuVi();

    public abstract void tinhDienTich();
}
