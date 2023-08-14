//  check an element is present in array or not
 import java.util.Scanner;
class Search
  {
    public static void searchElement(int a[],int key)
    {
      int i;
      int count=0;
      for(i=0;i<a.length;i++)
        {
          if(a[i]==key)
          {
            count++;
            break;
          }
        }
      if(count>0)
      {
        System.out.println("element is found at "+i+ "th index");
      }
           else
            System.out.println("element is not found");
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a[]={34,78,90,12,34,56};
      System.out.println("enter the key value to search");
      int key=sc.nextInt();
      searchElement(a,key);
    }
  }
