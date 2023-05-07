public class Earbuds{
    int price;
    String brand;
    String modelNum;
    String color;
    

    void insertEarbuds_details(int p,String b,String mn,String c){
        price =p;
        brand = b;
        modelNum = mn;
        color = c;
    }

    void displayEarbuds_details(){
        System.out.println("price is :"         +price);
        System.out.println("brand name is :"    +brand);
        System.out.println("maodel number is :" +modelNum);
        System.out.println("color is :"         +color);
        System.out.println();
    }
     public static void main(String[] args) {
        Earbuds e1 = new Earbuds();
        e1.insertEarbuds_details(2000,"boat","Airdops","black");
        e1.displayEarbuds_details();

        Earbuds e2 = new Earbuds();
        e2.insertEarbuds_details(10000,"nav","Airdops_a1","blue");
        e2.displayEarbuds_details();

        Earbuds e3 = new Earbuds();
        e3.insertEarbuds_details(29000,"chirag","Airdops_z1","red");
        e3.displayEarbuds_details();

        
     }
}
