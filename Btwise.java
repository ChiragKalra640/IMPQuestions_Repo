public class Btwise {
    public static void main(String[] args) {
        int x=1;
        System.out.println((~x-x>>1) + ","+ (~x-x<<1));
        System.out.println(-3>>1); 
    }
}
