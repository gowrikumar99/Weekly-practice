import java.util.*;
class enenOdd
  {
    public static void even(int a[])
    {
      int even=0;
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2==0)
          {
            even=even+1;
          }
        }
      System.out.println("the even numbers present are:"+even);
    }
    public static void odd(int a[])
    {
      int odd=0;
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2!=0)
          {
            odd=odd+1;
          }
        }
      System.out.println("the odd numbers present are:"+odd);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
      System.out.println("enter the array elements");
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      even(a);
      odd(a);
    }
  }