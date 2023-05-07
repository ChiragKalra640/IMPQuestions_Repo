import java.util.Scanner;

public class testNextLine {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Item ID :");
        String itemID = s1.next();

        System.out.println("Enter item price ");
        String priceStr = s1.next();
        
        double price = Double.valueOf(priceStr);
        System.out.println("Price of item " +itemID+ " is $ " +price ); 
    }
    
}
