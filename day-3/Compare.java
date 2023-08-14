//compareTo()
import java.util.Scanner;
class Sample
  {
    public static void main(String args[])
    {
      String s1="hai";
      String s2="bye";
      String s3="hai";
      String s4="welcome";
      System.out.println("s1>s2 "+s1.compareTo(s2)); //6
       System.out.println("s1==s3 "+s1.compareTo(s3)); //0
       System.out.println("s1<s4 "+s1.compareTo(s4)); //-15
        
    }
  }