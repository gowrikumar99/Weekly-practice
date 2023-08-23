import java.util.*;
class SelectionSort
  {
    public static void selectionSort(int arr[])
    {
      int i,j,temp=0;
      //  4,2,5,7,9,15
      //  2,4,5,7,9.15
      for(i=0;i<arr.length;i++)
        {
          int min=i; // here i=0 index position;  i=1 index position
          for(j=i+1;j<arr.length;j++)  // j=i+1;   j=1+1=2;
            {
              if(arr[j]<arr[min])  // 2<4;  4<5
                min=j; // 4=j;   // 
            }
          temp=arr[min]; // temp=arr[4];
          arr[min]=arr[i];// 4=2;
          arr[i]=temp; // 2=temp;
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("Enter elements in the array");
      for(int i=0;i<arr.length;i++)
        {
         arr[i]=sc.nextInt();
        }
      System.out.println("before sorting");
      for(int i=0;i<arr.length;i++)
        {
          System.out.print(arr[i]+" ");
        }
      selectionSort(arr);
      System.out.println("after sorting");
       System.out.println();
      for(int i=0;i<arr.length;i++)
        {
          System.out.print(arr[i]+" ");
        }
    }
  }