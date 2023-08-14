//feftRotation
class leftRotation
  {
    public static void main(String args[])
    {
      int a[]={23,67,44,56,90,12};
      System.out.println("Befor perfroming left roatation  ");
      for(int i=0;i<a.length;i++)
        {
          System.out.print(a[i]+" ");
        }
      System.out.println();
      int temp=a[0];//23
      for(int i=0;i<a.length-1;i++)
        {
          a[i]=a[i+1];
        }
      a[a.length-1]=temp;
 
      System.out.println("after perfroming left roatation by 1 position ");
      for(int i=0;i<a.length;i++)
        {
          System.out.print(a[i]+" ");
        }
    }
  }