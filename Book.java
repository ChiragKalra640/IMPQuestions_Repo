class Book
{
  String book_name;
  int book_price;
  String book_pages;
  String book_language;


  //Constructor 
  Book(String book_name,int book_price,String book_pages,String book_language)
  {
    this.book_name=book_name;
    this.book_price=book_price;
    this.book_pages=book_pages;
    this.book_language=book_language;
  }

  //Constructor 
  Book(Book b){
    book_name = b.book_name;
    book_price = b.book_price;
    book_pages = b.book_pages;
    book_language = b.book_language;

  }
    
  //User Defined Method
  void display()
  {
    System.out.println("Book Name  : "+book_name);
    System.out.println("Book Price : "+book_price);
    System.out.println("Book Pages : "+book_pages);
    System.out.println("Book Langu : "+book_language);
    System.out.println();
  }
  
  public static void main(String[] args)
  {
    Book b1 = new Book("LIFES AMAZING SECRETS",261,"232 pages","English");
    Book b2 = new Book(b1);
    Book b3 = new Book(b2);
    Book b4 = new Book(" AMAZING SECRETS",261,"232 pages","hindi");

    b1.display();
    b2.display();
    b3.display();
    b4.display();
  }
}
