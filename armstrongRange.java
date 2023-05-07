import java.util.Scanner;

public class armstrongRange {
    static float armstrong(int num){
        int rem,n=0,temp;
        float sum=0.0f;
        temp=num;
        while(temp>0){
            temp=temp/10;
            n++;
        }
        while(num>0){
            rem=num%10;
            sum=(float)(sum+Math.pow(rem,n));
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int count,start,end,temp;

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter start value: ");
        start = s1.nextInt();

        System.out.println("Enter end value: ");
        end = s1.nextInt();

        if(start>end){
            temp=start;
            start=end;
            end=temp;
        }
        System.out.println("Armstrong numbers between " +start+ " and " +end);

        for(count=start;count<=end;count++){
            if(count==armstrong(count)){
                System.out.println(count+ " is an armstrong number ");
            }
        }
    }
}
