import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        int temp,rightDigit,reverse = 0;
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = s1.nextInt();

        temp = num;

        while(temp != 0){
            rightDigit= temp%10;
            reverse = reverse * 10 + rightDigit;
            temp = temp/10;
        }
        if(reverse == num){
            System.out.println(num+ " is palindrome");
        } else {
            System.out.println(num+ " is not palindrome");
        }

    }
    
}
