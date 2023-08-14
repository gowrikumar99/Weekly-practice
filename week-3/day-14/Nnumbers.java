import java.util.Scanner;
class Sample
  {
    public static void printNumbers(int n)
    {
      for(int i=1;i<=n;i++)
        {
          System.out.println(i);
        }
    }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      int n=s.nextInt();
      printNumbers(n);
       
    }
  }