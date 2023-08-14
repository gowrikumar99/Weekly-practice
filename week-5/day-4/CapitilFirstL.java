//Write a program that takes a sentence as input and capitalizes the first letter of each word in the sentence. Assume that words are separated by spaces.
import java.util.Scanner;
class Sentence
  {
    public static void capital(String str)
    {

 

    
        String s[] = str.split(" ");
      
      String original="";
         
      for(int i=0;i<s.length;i++)
        {
          String temp=s[i];
          char ch[] =temp.toCharArray();
          String str1="";
          for(int j=0;j<ch.length;j++)
            {
              if(j==0)
              {
                
               ch[j]=Character.toUpperCase(ch[j]);
              }
               str1=str1+ch[j];
            
            }
        //  System.out.println(str1);
          original = original+str1+" ";
          
        }
    System.out.println(original);  
}
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
System.out.println("enter the sentence");
      String str=sc.nextLine();

 

      capital(str);
      
    }
  }