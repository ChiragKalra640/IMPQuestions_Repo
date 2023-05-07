import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int count=0,rem=0,sum=0;

        System.out.println("Enter a number:");
        int num1=s1.nextInt();

        int temp=num1;
        int temp1=num1;

        while(temp>0){
            temp=temp/10;
            count++;
        }
        while(temp1>0){
            rem = temp1%10;
            sum =(int)(sum+Math.pow(rem,count));
            temp1 = temp1/10;
        }
        if(sum==num1){
            System.out.println("Number is amrstrong " +num1);
        }else {
            System.out.println("Number is not armstrong " +num1);
        }
    }
}