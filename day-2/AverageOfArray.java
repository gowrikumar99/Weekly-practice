 //Array Average: Create a program that prompts the user to enter an array of numbers and then calculates the average of all the elements in the array.
import java.util.Scanner;
class AverageOfArray
  {
    public static void average(int a[],int size)
    {
      int sum=0,average=0;
      for(int i=0;i<size;i++)
        {
          sum=sum+a[i];
          average=sum/size;
        }
      System.out.println("the average array is "+average);
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
      average(a,size);
    }
  }