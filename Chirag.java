class vijay{ // parent class hai Vijay naam ki.

    int money ;
    String flats ;

    void show(){
        System.out.println("Total money is "+money);
        System.out.println("Total flats  are "+flats);
    }

}

public class Chirag extends vijay  //child class hai Chirag naam ki.
{
    void get(int money , String flats)
    {
        this.money = money;
        this.flats = flats ;
    }

    public static void main(String[] args) {

        Chirag c1 = new Chirag();
        c1.get(100000000,"100");
        c1.show();
    }
    
}
