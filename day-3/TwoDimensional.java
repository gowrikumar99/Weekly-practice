//two dimensional array
mport java.util.Scanner;
class Sample
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the row size");
      int row=sc.nextInt();
      System.out.println("enter the coloumn size");
      int coloumn=sc.nextInt();
      int arr[][]=new int[row][coloumn];
      System.out.println("enter the elements");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<coloumn;j++)
            {
              arr[i][j]=sc.nextInt();
            }
        }
      System.out.println("the elements are");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<coloumn;j++)
            {
              System.out.print(arr[i][j]+" ");
            }
          System.out.println();
        }
     
               
    }
  }
