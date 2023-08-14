//countofNegetiveElementes
import java.util.Scanner;
class CountOfNegetive{
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    int a[]=new int[6];
    System.out.println("enter values :");
    for(int i=0;i<a.length;i++){
      a[i]=input.nextInt();
    }
    int count=0;
    for(int i=0;i<a.length;i++){
      if(a[i]<0){ 
      count++;
      }
      }
    System.out.println("number of elementes"+count);
  }
  }
