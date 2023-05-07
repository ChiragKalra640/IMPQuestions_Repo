//parameterized constructor


public class Watch{
    
    String brand;
    String modelNum;
    String color;
    int price;

    
//parametrized constructor
       Watch(String brand,String modelNum,String color, int price){
        
        this.brand = brand;
        this.modelNum = modelNum;
        this.color = color;
        this.price = price;

        displayWatch_details();
    }

    void displayWatch_details(){
       
        System.out.println("Brand name is :"    +brand);
        System.out.println("Model number is :" +modelNum);
        System.out.println("Color is :"         +color);
        System.out.println("Price is :"         +price);
        System.out.println();
    }
     public static void main(String[] args) {
        Watch w1 = new Watch("titan","jjk679","blue",9800);
        // e1.displayWatch_details();

        Watch w2 = new Watch("rolex","jjk990","black",98899);
        // e2.displayWatch_details();

        Watch w3 = new Watch("apple","jj099k","green",989976);
        // e3.displayWatch_details();
        
     }
}

