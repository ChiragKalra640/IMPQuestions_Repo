import java.util.Scanner;

public class MenuDrivenPatterns {
    public static void main(String[] args) {
        for(;;){

        

       
        Scanner s1 = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.println("      MENU");
        System.out.println("1. print pattern 1");
        System.out.println("2. print pattern 2");
        System.out.println("3. print pattern 3");
        System.out.println("4. print pattern 4");
        System.out.println("5. print pattern 5");
        System.out.println("6. print pattern 6");
        System.out.println("--------------------");
        System.out.println("Enter your choice :");

        int ch = s1.nextInt();

   
    switch(ch)
    {
        case 1 :
        int n1 = 5;
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }
        break;

        case 2 :
        int n2 =5;
        for(int i=1;i<=n2;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
        break;

        case 3 :
        int n3 =5;
        for(int i=1;i<=n3;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
        break;

        case 4 :
        int n4 =5;
        for(int i=1;i<=n4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n4 +" ");
            }
            System.out.println();
        }
        break;

        case 5 :
        int n5 =1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n5++ +" ");
            }
            System.out.println();
        }
        break;

        case 6 :
        String str = "CHIRAG";
        int len = str.length();
        for(int i=1;i<=len;i++){
            for(int j=0;j<i;j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
        break;

        default :
        System.out.println("you have entered wrong choice . please choose between(1-6) ");
        

    }
}
}
}
