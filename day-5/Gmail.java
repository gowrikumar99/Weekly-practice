import java.util.Scanner;
class Gmail
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int ucount=0,lcount=0,dcount=0,scount=0;
      char ch;
      System.out.println("enter your password");
      String Gmail=sc.next();
      for(int i=0;i<Gmail.length();i++)
        {
          ch=Gmail.charAt(i);
         if(ch>='A' && ch<='Z') 
         {
           ucount++;
         }
          else if(ch>='a'&& ch<='z')
          {
            lcount++;
          }
          else if(ch>='0' && ch<='9')
          {
            dcount++;
          }
                     
       else {
         scount++;
            }
        }
      if(ucount>0 && lcount>0 && dcount>0 && scount>0)
      {
        System.out.println("valid Gmail");
      }
      else
        System.out.println("in valid Gmail"); 
    }
  }