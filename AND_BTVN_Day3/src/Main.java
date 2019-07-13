public class Main {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron("Hinh tron",5);
        HinhChuNhat hcn = new HinhChuNhat("Hinh vuong",5,5);
        ht.inThongTin();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.tamGiacVcNoiTiep();
        System.out.println("================================");
        hcn.inThongTin();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.canh_Dc();
    }
}
