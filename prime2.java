import java.util.Scanner;

public class prime2 {
    public static void main(String[] args) {
        int i=0,num=0;
        String primeNumbers = "";
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter the value of n : ");
        int n = s1.nextInt();

        for(i=1;i<=n;i++){
            int counter=0;
            for(num=i;num>=1;num--){
                if(i%num==0){
                    counter = counter + 1;
                }
            }
            if(counter==2){
                primeNumbers = primeNumbers + i +"," ;
            }
        }
        System.out.println("prime number from 1 to "+n+" are:");
        System.out.println(primeNumbers);

    }
    
}
