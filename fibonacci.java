import java.util.*;

class fibonacci{
    public static void main(String[] args) {
       
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter a number to generate fibonacci series for first n terms");
        int n = s1.nextInt();

        int a=0;
        int b=1;

        System.out.println("Fibonacci series of first " +n+ " terms:");
        for(int i=0;i<n;i++){
            System.out.println(a);
            int c = a+b;
            a=b;
            b=c;
           
        }
        
    }
}