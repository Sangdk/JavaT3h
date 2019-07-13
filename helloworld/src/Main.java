public class Main {
    public static void main(String[] args) {
        int[] a = new int[100];
        for(int i=0;i<a.length;i++){
            a[i] =i;
        }
        int tong = 0;
        for(int j=0 ; j<a.length;j++){
            tong +=a[j];
        }
        System.out.println("hello world");
        System.out.println(tong);
    }
}
