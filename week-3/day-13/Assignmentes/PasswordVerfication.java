/*Write a program that prompts the user to enter a password. Use a loop to keep asking for the password until a correct one is entered. Use the break statement to exit the loop when the correct password is provided. Implement a menu that allows the user to continue or exit the program.*/
import java.util.Scanner;
class PV{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    String password="password";
    while(true){
      System.out.print("Enter password : ");
      String userpassword=input.nextLine();
      if(userpassword.equals(password)){
        System.out.println("Access granted");
        break;
      }else{
        System.out.println("incorrect password");
      }
    }
  }
}