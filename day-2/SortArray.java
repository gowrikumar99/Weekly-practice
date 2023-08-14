//Array Sorting: Implement a sorting algorithm (e.g., bubble sort, insertion sort) to arrange the elements of an array in ascending or descending order.
import java.util.Scanner;
class SortArray
  {
    public static void sortArray(int a[],int size)
    {
      int i,j,temp=0;
      for(i=0;i<size;i++)
        {
          for(j=i+1;j<size;j++)
            {
              if(a[j]<a[i])
              {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              }
            }
        }
      System.out.println("after sorting the elements");
      for(i=0;i<size;i++)
        {
          System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[])
    {
      Scanner input=new Scanner(System.in);
      System.out.println("enter the size of  array");
      int size=input.nextInt();
      int a[]=new int[size];
      System.out.println("enter array elements");
      for(int i=0;i<size;i++)
        {
          a[i]=input.nextInt();
        }
      sortArray(a,size);
    }
  }