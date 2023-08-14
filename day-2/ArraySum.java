//Write a program that takes an array of integers as input and calculates the sum of all the elements in the array.
import java.util.Scanner;
class ArraySum{
    public static void sum(int a[],int size)
    {
      int sum=0;
      for (int i=1;i<size;i++)
        {
          sum=sum+a[i];         
        }
      System.out.println("the sum of arraay is "+sum);
    }
    public static void main(String args[])
    {
      Scanner input=new Scanner(System.in);
      System.out.println("enter size of the array");
      int size=input.nextInt();
      int a[]=new int[size];
      System.out.println("enter array elements");
      for(int i=0;i<size;i++)
        {
          a[i]=input.nextInt();
        }
      sum(a,size);
    }
  }