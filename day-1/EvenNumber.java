//CountNumberArray
import java.util.Scanner;
class EvenNumber
  {
    public static void evenNumber(int a[])
    {
      System.out.println("even elements are: ");
      for(int j=0;j<a.length;j++)
        {
          if(a[j]%2==0)
          {
            System.out.println(a[j]);
          }
        }
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
      System.out.println("enter the element: ");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      evenNumber(a);
    }
  }