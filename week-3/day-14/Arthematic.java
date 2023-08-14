//arthematic oeration
import java.util.Scanner;
class Arthematic{
  public static void addition(double num1,double num2){
    double result1=num1+num2;
    System.out.println(result1);
  }public static void subtraction(double num1,double num2){
    double result2=num1-num2;
    System.out.println(result2);
  }public static void multiplication(double num1,double num2){
    double result3=num1*num2;
    System.out.println(result3);
  }public static void madulo(double num1,double num2){
    double result4=num1%num2;
    System.out.println(result4);
  }public static void division(double num1,double num2){
    double result5=num1/num2;
    System.out.println(result5);
  }
    public static void main(String[] args){
      Scanner input=new Scanner(System.in);
      System.out.println("enter the num1 : ");
      double num1=input.nextDouble();
      System.out.println("enter the num2 :");
      double num2=input.nextDouble();
      addition(num1,num2);
      subtraction(num1,num2);
      multiplication(num1,num2);
      madulo(num1,num2);
      division(num1,num2);
    
  }
}