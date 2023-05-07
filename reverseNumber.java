import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        int reversenum=0;
        int num=0;

        Scanner s1 = new Scanner(System.in);
        System.out.println("Input your number and press enter:");
        num = s1.nextInt();

        while(num != 0){
            reversenum = reversenum*10;
            reversenum = reversenum + num%10;
            num = num/10;
        }
        String reverse = String.valueOf(reversenum);

        System.out.println("Reverse of input number is :"+reverse);
    }
    
}
