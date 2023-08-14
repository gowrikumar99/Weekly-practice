//minimum size of array
import java.util.Scanner;
class MinimumArr{
  public static void minimum(int a[],int size){
    int mini=a[0];
    for(int i=0;i<size;i++){
      if(mini>a[i]){
        mini=a[i];
      }
    }
    System.out.println("the miniimum element is :"+mini);
    
  }
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    System.out.println("enter the size of array :");
    int size=input.nextInt();
    int a[]=new int[size];
    System.out.println("enter the elements ");
    for(int i=0;i<size;i++){
      a[i]=input.nextInt();
    }
    minimum(a,size);
  }
}