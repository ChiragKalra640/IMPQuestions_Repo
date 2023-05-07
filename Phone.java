//parameterized constructor

import java.util.Scanner;
public class Phone{
    
    String brand;
    String modelNum;
    String color;
    int price;

    
//parametrized constructor
    Phone(){
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter brand name :");
        brand = s1.nextLine();
        System.out.println("Enter model number is :");
        modelNum = s1.nextLine();
        System.out.println("Enter color :");
        color = s1.nextLine();
        System.out.println("Enter price :");
        price = s1.nextInt();


        displayPhone_details();
    }

    void displayPhone_details(){
       
        System.out.println("Brand name is :"    +brand);
        System.out.println("Model number is :" +modelNum);
        System.out.println("Color is :"         +color);
        System.out.println("Price is :"         +price);
        System.out.println();
    }
     public static void main(String[] args) {
        Phone p1 = new Phone();
        // e1.displayWatch_details();

        Phone p2 = new Phone();
        // e2.displayWatch_details();

        Phone p3 = new Phone();
        // e3.displayWatch_details();
        
     }
}


