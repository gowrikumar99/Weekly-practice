
//find the reverse value and print the value
import java.util.Scanner;
class ReverseNumber{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("enter the number : ");
    int num=input.nextInt(); //789
    int reverse=0;
    while(num>0){     //789>0; // 78>0;// 7>0;
      int digit=num%10;   //digit  789%10= remender is=9; //78%10=8; 7%10=7
      reverse=(reverse*10)+digit; //(0*10)+9=9;//(9*10)+8=98;//(98*10)+7=987
      num=num/10;//789/10=78 ; //78/10=7; //7%10=0;
    }
    System.out.println("reverse number is : "+reverse);
    
  }
}