

class Count extends Thread
{
  Count()
  {
    super("My Extending Thread");
    System.out.println("My Thread Created "+this);
    start();
  }
  public void run()
  {
    try
    {
      for(int i=0;i<10;i++)
      {
        System.out.println("Print the Count : "+i);
        Thread.sleep(1000);
      }
    }
    catch(InterruptedException e)
    {
      System.out.println("Thread is Interuupted ");
    }
  
    System.out.println("My thread run is over" );

  }
}
class ExtendingExample
{
  public static void main(String[] args)
  {
    Count cnt = new Count();
    
    try
    {
      while(cnt.isAlive())
      {
        System.out.println("Main thread will be alive till the child thread is live");
        Thread.sleep(10000);
      }
    }
    catch(InterruptedException e)
    {
      System.out.println("Main thread interrupted");

    }
    
    System.out.println("Main thread's run is over" );
  }
}
