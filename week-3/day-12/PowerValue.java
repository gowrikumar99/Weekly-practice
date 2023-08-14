//Power of base
import java.util.Scanner;
class PowerValue{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter any number :");
    int num=input.nextInt();
    int result=2;
    for(int i=1;i<=num;i++){ 
    result=result*base;
  }
  System.out.println("this base of power value:"+result);
}
}