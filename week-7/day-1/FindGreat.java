/*
1.Write a Java program that takes three numbers from the user and prints the greatest number.

 

Test Data

Input the 1st number: 25

Input the 2nd number: 78

Input the 3rd number: 87

Expected Output :

The greatest: 87
  */
import java.util.Scanner;
class FindGreat{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    if(num1>num2 && num1>num3){
      System.out.println("num1 is biggest"+num1);
    }else if(num2>num3){
      System.out.println("num2 is biggest"+num2);
    }else{
      System.out.println("num3 is biggest"+num3);
    }
  }
}
