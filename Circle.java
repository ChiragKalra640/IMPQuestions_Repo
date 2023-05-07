//BY AGGREGATION 


class Operation  
{
    double square(double n)
    {
        return n*n;

    }
}


public class Circle
 {

    Operation op; // Entity Reference
    double pi = 3.14;

    double area (double radius)
    {
        op = new Operation();
        double rsquare = op.square(radius);
        return pi*rsquare;
    }

    public static void main(String[] args) 
    {
        Circle c1 = new Circle();
        double area_of_circle = c1.area(5);
        System.out.println("Area of circle is : " +area_of_circle);
        
    }
    
}


