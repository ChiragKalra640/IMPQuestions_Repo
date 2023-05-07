class WatchStatic
{

  static String company_name = "TITAN";  //static variable , collage name , school name , mtlb jo common rhega vo static kr denge taki baar bar uska data na lena pde (comomon property ko sabke sath share krna ho to usko hum static bna skte hai)
  int price;
  String model;
  String color;
  
  WatchStatic(int price,String model,String color)
  {
    this.price=price;
    this.model=model;
    this.color=color;
  }
  void displayWatchData()
  {
    System.out.println("Collage Name is   : "+company_name);
    System.out.println("Student ID   is   : "+price);
    System.out.println("Student Name is   : "+model);
    System.out.println("Student Course is : "+color);
    System.out.println();
  }
  
  public static void main(String[] args)
  {
    WatchStatic s1 = new WatchStatic(1000,"a101","Blue ");
    WatchStatic s2 = new WatchStatic(2000,"b101","black");
    WatchStatic s3 = new WatchStatic(3000,"c101","yellow");
    s1.displayWatchData();
    s2.displayWatchData();
    s3.displayWatchData();
  }
  
}
