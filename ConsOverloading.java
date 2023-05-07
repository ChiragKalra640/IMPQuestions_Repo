public class ConsOverloading {
    int x,y,z;
    ConsOverloading(int x){
        System.out.println(x);
    }

    ConsOverloading(int x,int y){
        System.out.println(x+y);
    }

    ConsOverloading(int x,int y,int z){
        System.out.println(x+y+z);
    }

    public static void main(String[] args) {
        new ConsOverloading(10);
        new ConsOverloading(10,20);
        new ConsOverloading(10,20,30);
    }
}
