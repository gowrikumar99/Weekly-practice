
import java.util.Scanner;
class Table1{
  public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number :");
     int n=sc.nextInt();
    for(int i=1;i<=10;i++){
      System.out.println(n+"*"+i+"="+(n*i));
      // here n=5, i=1       5*1=(5*1)
      // here n=5, i=2      5*2=(5*2)
    }
    
  }
}