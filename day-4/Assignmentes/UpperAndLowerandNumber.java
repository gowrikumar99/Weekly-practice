//uppercaseandLowercaseand symblesandNumbers in string
import java.util.Scanner;
class CountUpperAndLowerAndSymleAndnumbers
{
    public static void main(String args[]){ 
      Scanner input=new Scanner(System.in);
        String str = "Gowrikumar99@gmail.com";
        int upper = 0, lower = 0, number = 0, special = 0; 
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')   //all uppercase letters
            {
              upper=upper+1;
            }  
            else if (ch >= 'a' && ch <= 'z')   //all lowercase letters
            {
              lower=lower+1;
            }
            else if (ch >= '0' && ch <= '9')  //all numbers from 0-9
            {
               number=number+1;
            }
            else
            {
              special=special+1;      //all special characters
            }
        }
 
        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("Number : " + number);
        System.out.println("Special characters : " + special);
    }
}