interface Sayable
{  
    default void say()
    {  
        saySomething();  
    } 
    private void saySomething() 
  {  
        System.out.println("Hello... I'm private method");  
    }  
} 
public class PrivateInterface implements Sayable
{
  public static void main(String[] args)
  {
    Sayable s1 = new PrivateInterface();
    s1.say();
  }
}
