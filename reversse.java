import java.util.Scanner;

public class reversse {
    public static void main(String[] args) {

        int n=0;
        int rev=0;

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number");
        n = s1.nextInt();

        while(n!=0){
            int d=n%10;
            n=n/10;
            rev=rev*10+d;
            
        }

        System.out.println("reverse is " +rev);
        


    }
    
}
