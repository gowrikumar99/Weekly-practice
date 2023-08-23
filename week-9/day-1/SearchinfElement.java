// DATA STRUCTURES

// searching elementes in da
import java.util.*;
public class Main
{
    public void linearSearch(int arr[],int key)
    {
        boolean isFind=false;
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(key==arr[i])
            {
               isFind=true;
               index=i;
               break;
            }

        }
        if(isFind==true)
        {
            System.out.println("element is found at "+index +"th positon");
        }
        else
        System.out.println("element is not found");
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Main obj=new Main();
       System.out.println("enter the size");
       int size=sc.nextInt();
       int arr[]=new int[size];
       System.out.println("enter arry elements");
       for(int i=0;i<size;i++)
       {
           arr[i]=sc.nextInt();
       }
       System.out.println("enter the element you want to find");
       int key=sc.nextInt();
       obj.linearSearch(arr,key);

    }
}


has context menu