import java.util.Scanner;
class InsertElement
  {
    public static void main(String args[])
    {
      Scanner input=new Scanner(System.in);
      int a[]={1,2,5,4,3};
      int b[]=new int[a.length+1];
      System.out.println("enter the value to insert");
      int value=input.nextInt();
      System.out.println("enter the index position ");
      int pos=input.nextInt();
      for(int i=0;i<b.length;i++)
        {
          if(i==pos)
          {
            b[i]=value;
          }
          else if(i>pos)
          {
            b[i]=a[i-1];
          }
          else 
          {
            b[i]=a[i];
          }
            
        }
      System.out.println("the array elements are");
      for(int i=0;i<b.length;i++)
        System.out.print(b[i]+" ");
      
    }
  }