//febonacic series
import java.util.Scanner;
class Febonoses{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("enter the number: ");
    int num=input.nextInt();
    int first=0,second=1;
    System.out.println(first+"");
    System.out.println(second+"");
    for(int i=1;i<num;i++){
      int third=first+second;
      System.out.println("third+");
      first=second;
      second=third;
    }
    
  }
}