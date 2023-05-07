//Create Custom Exception class
class MyIOException extends Exception
{
  private String msg;
  
  MyIOException(String msg)
  {
    this.msg=msg;
  }
  
  public String toString()
  {
    return msg;
  }
}


// latest class

class TestCustomException
{
  static void show()throws MyIOException
  {
    throw new MyIOException("valid value");
  }
  public static void main(String[] args)
  {
    try
    {
      show();
    }
    catch(MyIOException e)
    {
      System.out.println(e);
    }
    
    System.out.println("Programe will Continue!!!");
  }
}