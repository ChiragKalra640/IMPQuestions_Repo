
import java.util.Scanner;

class Atm
{
  public static void main(String[] args)
  {

    Scanner s1 = new Scanner(System.in);
    System.out.print("Enter your Pin : ");
    String pin = s1.next();
    if(pin.equals("1111"))
    {
      System.out.println("Select your Acccount Type:\nSaving(S)\nCurrent(C)\nfixed(F)\n ");
      String acc_type = s1.next();
      if(acc_type.equalsIgnoreCase("S")||acc_type.equalsIgnoreCase("C")||acc_type.equalsIgnoreCase("F"))
      {
        System.out.println("Enter Amount to Withdraw: ");
        int amount = s1.nextInt();
        if(amount<=40000)
        {
          System.out.println("Amount succesfully Withdraw : "+amount);
        }
        else
        {
          System.out.println("Insufficient Funds....");
        }
        
      }
      else
      {
        System.out.println("Select valid Account Type...");
      }
    }
    else
    {
      System.out.println("Incorrect Pin...");
    }

  }
}
