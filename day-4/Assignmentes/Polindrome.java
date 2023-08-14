//polindrome in string
import java.util.Scanner;
 class Palindrome{
   public static void main(String args[]){
      Scanner input= new Scanner(System.in);
      String str="mom";      //original string
      String rev = "";       //storage string
      str = input.nextLine();
      int length = str.length();
      for ( int i = length - 1; i >= 0; i-- ){
        rev = rev + str.charAt(i);
        if (str.equals(rev)){
         System.out.println(str+" is a palindrome");
        }
        else{System.out.println(str+" is not a palindrome");
        }
      }
      System.out.println("Enter a string:");
   }
}