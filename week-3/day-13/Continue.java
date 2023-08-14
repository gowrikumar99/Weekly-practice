//continue statement
import java.util.Scanner;
class Continue
  {
    public static void main(String args[])
    {
      System.out.println("enter the number :");
     for(int i=1;i<=9;i++)
       {
         if(i==8)
         {
           continue;
         }
         System.out.println(i);
       }
    }
  }