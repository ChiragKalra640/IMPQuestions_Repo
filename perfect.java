import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        long sum=0;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any integer you want to check : ");
        long n = s1.nextLong();

        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum = sum+i;
            }
        }
        if(sum==n){
            System.out.println("Given number is perfect");
        } else {
            System.out.println("Given number is not perfect");
        }

    }
    
}












