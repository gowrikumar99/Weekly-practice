//printing the number digits
import java.util.Scanner;
class DigitsFromNum{
  public static void main(String[] args){
    System.out.println("enter the number :");
    Scanner input=new Scanner(System.in);
    int num=input.nextInt();
    while(num>0){
      int digit=num%10;
      num=num/10;
      System.out.println(digit);
    }
  }
}