public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        int thu = 3;
        //ifelse
//        if(thu == 3){
//            System.out.println("Hom nay la thu 3");
//        }else if(thu == 2){
//            System.out.println("hom nay la thu 2");
//        }else if(thu == 4){
//            System.out.println("hom nay la thu 4");
//        }else if(thu == 5){
//            System.out.println("hom nay la thu 5");
//        }else if(thu == 6){
//            System.out.println("hom nay la thu 6");
//        }else if(thu == 7){
//            System.out.println("hom nay la thu 7");
//        }else{
//            System.out.println("khong xac dinh ngay hien tai");
//        }
        //switchcase
//        switch (thu) {
//            case 1:
//                System.out.println("khong xac dinh");
//                break;
//            case 2:
//                System.out.println("hom nay la thu 2");
//                break;
//            case 3:
//                System.out.println("hom nay la thu 3");
//                break;
//            case 4:
//                System.out.println("hom nay la thu 4");
//                break;
//            default:
//                System.out.println("khong xac dinh");
//        }
        //for
//        int S = 0;
//        for (int i = 1; i < 11; i++) {
//            S = S + i;
//        }
//        System.out.println("Tong = " + S);
//        for (int i = 1; i <= 10; i++) {
//            if (i == 3) {
//                continue;
//            }
//            if (i > 5) {
//                break;
//            }
//            System.out.print(" " + i);
//        }
        //while
        //   int i = 0;
        int S = 0;
//        while (i<=10) {
//            System.out.println(i);
//            i++;
//        }
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<11);
//        while (i <= 10) {
//            if (i % 2 != 0) {
//                System.out.print(" " + i);
//
//            }
//            i++;
//        }
//        while (i <= 10) {
//            if (i % 2 == 0) {
//                S=S+i;
//
//            }
//            i++;
//        }
//        System.out.println("Tong = "+S);
        //Songuyento
//        int n=7;
//        int dem =0;
//        if(n==0||n==1){
//            System.out.println("n khong phai la so nguyen to");
//        }else {
//            for(int i=2;i<n;i++){
//                if(n%i==0){
//                    dem=dem +1;
//                }
//            }
//            if(dem > 0){
//                System.out.println("n khong phai la so nguyen to");
//            }else{
//                System.out.println("n la so nguyen to");
//            }
        public void nhapN ( int soN ){
            this.n = soN;
        }
        public boolean kiemtrasnt (int soN) {
            int dem = 0;
            if (n == 0 || n == 1) {
                return false;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        dem = dem + 1;
                    }
                }
                if (dem > 0) {
                    return true;
                } else {
                    return false;
                }
            }

        }
        public void timkiemsont(){
            for(int i=0;i<=n;i++){
                if(kiemtrasnt(i)==true){
                    System.out.println();
                }
            }
    }
    sont.nhapN
}
    }
