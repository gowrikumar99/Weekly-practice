//difference between equals() and ==
import java.util.Scanner;
class Sample
  {
    public static void main(String args[])
    {
    String str="hello";
    String str1="hello";
    String str2="hai";
      String str6="hai";
      String str3=new String("hello");
      String str4=new String("hai");
      String str5=new String("hello");
  /*    System.out.println(str.equals(str1));//true
      System.out.println(str.equals(str2));//false
      System.out.println(str.equals(str3));//true
       System.out.println(str2.equals(str4));//true  */
      System.out.println(str==str1); //true
       System.out.println(str==str3); //false
      System.out.println(str2==str4); //false 
         System.out.println(str2==str6); //true
 
    }
  }