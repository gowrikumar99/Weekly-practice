//reverced string 
import java.util.Scanner;
class Reverse   
{    
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String string = "GOWRIKUMAR";
      String reversedStr = "";     //Stores the reverse of given string   
            for(int i = string.length()-1; i >= 0; i--){    // the string from last and add each character to reversedStr   
            reversedStr = reversedStr + string.charAt(i);    
        }    
        System.out.println("Original string: " + string); //original string display 
        System.out.println("Reverse of given string: " + reversedStr);  //Displays the reverse of given string   
    }    
}    