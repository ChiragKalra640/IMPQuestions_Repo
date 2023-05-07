
import java.util.Scanner;
public class patternsPractice {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s1.nextInt();
        

        for(int i=1;i<=n;i++){
            for(int  j=1;j<i;j++){
                // System.out.print("x ");
                // System.out.print(j +" ");
                // System.out.print(i +" ");
                System.out.print((char)('A' + (j-1))+" ");
                
                
            }
            System.out.println();
        }
    }
}

