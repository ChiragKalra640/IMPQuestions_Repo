import java.util.Scanner;

public class countNoDigits {
    public static void main(String[] args) {
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s1.nextInt();

        int d=0;

        while(n!=0){
            //How to extract digits from a number
            // int d=n%10;
            // n=n/10;
            // System.out.println(d);

            // how to count digits of a number
            n=n/10;
            d++;
            
        }
        System.out.println(d);
        
    }
}
