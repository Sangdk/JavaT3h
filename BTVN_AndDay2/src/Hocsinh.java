import java.util.Scanner;

public class Hocsinh {
    double toan,ly,hoa;
    int tuoi;
    String Ten,MHS;
    public void Nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten hoc sinh: ");
        Ten = scan.nextLine();
        System.out.println("NHap ma sinh vien :");
        MHS = scan.nextLine();
        do{
            System.out.println("Nhap nam sinh :");
            tuoi = scan.nextInt();}
        while(ly<0 ||ly>10);
        do{
        System.out.println("Nhap vao diem Toan :");
        toan = scan.nextDouble();}
        while(toan<0 ||toan>10);
        do{
            System.out.println("Nhap vao diem Ly :");
            ly = scan.nextDouble();}
        while(ly<0 ||ly>10);
        do{
            System.out.println("Nhap vao diem Hoa :");
            hoa = scan.nextDouble();}
        while(hoa<0 ||hoa>10);

    }
    public void diem(){
        double diem_tb = (toan +ly+hoa)/3;
        System.out.println("Hoc sinh: "+Ten);
        System.out.println("Ma Hoc Sinh: "+MHS);
        if(diem_tb<5){
            System.out.println("Diem trung binh la : "+diem_tb+"   Xep loai : Yeu");
        }else if(diem_tb>5&&diem_tb<8){
            System.out.println("Diem trung binh la : "+diem_tb+"   Xep loai : Kha");
        }else{
            System.out.println("Diem trung binh la : "+diem_tb+"   Xep loai : Gioi");
        }
    }
    public void tuoi(){
        int ttuoi=2019-tuoi;
        System.out.println("Tuoi : "+ttuoi);
    }
}
