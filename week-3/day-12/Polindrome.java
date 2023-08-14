//polindrome
import java.util.Scanner;
class Polindrome{
  public static void main (String args []) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number :");
    int num =input.nextInt();
    int reverse= 0, digit=0;
    int gowrikumar= num;
    while (num >0) {    //8338>10 //833>0 //83>0; 8>0;
      digit= num % 10;  //8338%10=833 ,remainder is 8 // 833%10=83 remainder is 3// 83%10=8 ,remainder is 3// 8%10=0.8 we can tac 8 only
      reverse = (reverse* 10) + digit; //(0*10)+8=8//(8*10)+3=83//(83*10)+3=833//(833*10)+8=8338
      num /= 10;//8338/10=833 // 833/10=83// 83/10=8
    }
    if (gowrikumar== reverse) {
      System.out.println (gowrikumar + " is a Palindrome Number.");
    } else {
      System.out.println (gowrikumar + " is not a Palindrome Number.");
    }
  }
}
