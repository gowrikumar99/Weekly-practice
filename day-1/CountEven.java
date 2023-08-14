import java.util.*;
class CountEven
  {
    public static void counteven(int a[])
    {
      int count=0;
      for(int i=1;i<a.length;i++)
        {
          if(a[i]%2==0)
          {
            System.out.println(a[i]+" ");
            count++;
          }
        }
      System.out.println("the number of even numbers are"+count);
    }
    public static void main(String args[])
    {
      int a[]=new int[5];
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array elements");
      for(int j=1;j<a.length;j++)
        {
          a[j]=sc.nextInt();
        }
      counteven(a);
    }
  }