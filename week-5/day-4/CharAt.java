
import java.util.Scanner;
class encrypt
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String st=sc.nextLine();
  
      for(int i=0;i<st.length();i++)
        {
          if(i%2==0)
          {
            st.charAt(i);
            System.out.println(st.charAt(i));
         }
      }
      for(int i=0;i<st.length();i++)
        {
          if(i%2!=0)
          {
            st.charAt(i);
            System.out.println(st.charAt(i));

          }
      }

    }
  }