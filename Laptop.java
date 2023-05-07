import java.util.Scanner;

public class Laptop{
    
    String brand;
    String modelNum;
    String color;
    int price;

    void takinginput(){
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter brand name : ");
        brand = s1.next();
        System.out.println("Enter model number : ");
        modelNum = s1.next();
        System.out.println("Enter the color : ");
        color = s1.next();
        System.out.println("Enter the price : ");
        price = s1.nextInt();

        System.out.println();
        
    }

    void insertLaptop_details(String b,String mn,String c,int p){
        
        brand = b;
        modelNum = mn;
        color = c;
        price = p;
    }

    void displayLaptop_details(){
       
        System.out.println("Brand name is :"    +brand);
        System.out.println("Model number is :" +modelNum);
        System.out.println("Color is :"         +color);
        System.out.println("Price is :"         +price);
        System.out.println();
    }
     public static void main(String[] args) {
        Laptop e1 = new Laptop();
        e1.takinginput();
        e1.insertLaptop_details( e1.brand,e1.modelNum,e1.color,e1.price); 
        e1.displayLaptop_details();

        Laptop e2 = new Laptop();
        e2.takinginput();
        e2.insertLaptop_details( e2.brand,e2.modelNum,e2.color,e2.price);
        e2.displayLaptop_details();

        Laptop e3 = new Laptop();
        e3.takinginput();
        e3.insertLaptop_details( e3.brand,e3.modelNum,e3.color,e3.price);
        e3.displayLaptop_details();

        
     }
}

