class Bike
{
  String Bike_brand_name;
  String Bike_name;
  float Bike_price;
  int Bike_seating_capacity;
  int Bike_fuel_tank;
  
  void showData()
  {
      System.out.println("Bike Brand Name            : "+Bike_brand_name);
      System.out.println("Bike Name                  : "+Bike_name);
      System.out.println("Bike Price                 : "+Bike_price+" lakhs");
      System.out.println("Bike Seating Capacity      : "+Bike_seating_capacity);
      System.out.println("Bike Fuel Tank             : "+Bike_fuel_tank+" L");
      System.out.println();
  }
}
class BMW extends Bike
{
  BMW(String Bike_brand_name,String Bike_name,float Bike_price,int Bike_seating_capacity,int Bike_fuel_tank)
  {
    this.Bike_brand_name=Bike_brand_name;
    this.Bike_name=Bike_name;
    this.Bike_price=Bike_price;
    this.Bike_seating_capacity=Bike_seating_capacity;
    this.Bike_fuel_tank=Bike_fuel_tank;
  }
}
class TVS extends Bike
{
    TVS(String Bike_brand_name,String Bike_name,float Bike_price,int Bike_seating_capacity,int Bike_fuel_tank)
    {
      this.Bike_brand_name=Bike_brand_name;
      this.Bike_name=Bike_name;
      this.Bike_price=Bike_price;
      this.Bike_seating_capacity=Bike_seating_capacity;
      this.Bike_fuel_tank=Bike_fuel_tank;
    }
  }
class Bajaj extends Bike
{
    Bajaj(String Bike_brand_name,String Bike_name,float Bike_price,int Bike_seating_capacity,int Bike_fuel_tank)
    {
      this.Bike_brand_name=Bike_brand_name;
      this.Bike_name=Bike_name;
      this.Bike_price=Bike_price;
      this.Bike_seating_capacity=Bike_seating_capacity;
      this.Bike_fuel_tank=Bike_fuel_tank;
    }
  }
class Inheritance
{
  public static void main(String[] args)
  {
    BMW b = new BMW("BMW","bmw 60",5.15f,2,5);
    b.showData();
    TVS t = new TVS("TVS","victor",1.9f,2,6);
    t.showData();
    Bajaj ba = new Bajaj("BAJAJ","pulsar",2.79f,2,4);
    ba.showData();
  }
}




    

