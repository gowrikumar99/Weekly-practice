import java.util.Scanner;
class Break
  {
    public static void main(String args[])
    {
      System.out.println("enter the number :");
     for(int i=1;i<=9;i++)
       {
         if(i==3)
         {
           break;
         }
         System.out.println(i);
       }
    }
  }