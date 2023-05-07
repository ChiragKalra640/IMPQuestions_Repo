import java.util.Scanner;

public class perfectNumberRange {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter start number");
        int start = s1.nextInt();

        System.out.println("Enter end number");
        int end = s1.nextInt();

        System.out.println("Perfect number between " +start+ " and " +end+ " are :");
        for(int i=start;i<=end;i++){
            int sum=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum=sum+j;
                }
            }
            if(i==sum)
            System.out.println(i + "\t");
        }
        
    }
    
}
