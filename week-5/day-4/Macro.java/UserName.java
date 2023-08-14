
/*4. Data validator: Create a menu based application that can display list of options:
--> Email Verifier: Create a method that takes an email address as input and verifies if it is in the correct format using regular expressions.
--> Username and password Verifier: Create a method that takes an username and password as input and verifies these are following basic rules (having 1 uppercase, lowercase, 1 digit, 1 special character etc....)
--> Mobile number Verifier: Create a method that takes a mobile number as input and verifies it contains only digits or not, length should be 10 digits, starts with 6 or 7 or 8 or 9.*/
import java.util.Scanner;
class MenuOptions
  {
public static void email(String str)
    {
      int acount=0;
      int scount1=0;
      int scount2=0;
      int dcount=0;
for(int i=0;i<str.length();i++)
        {
          char ch=str.charAt(i);
          if(ch>='a' && ch <='z')
          {
            acount++;
          }
          else if (ch=='@')
          {
            scount1++;
          }
          else if(ch=='.')
          {
            scount2++;
          }
          else
          {
            dcount++;
          }
        }
      if(acount>0 & scount1==1 && scount2==1  && dcount>0)
      {
        System.out.println("valid email ");
      }
      else
      {
         System.out.println("not a valid email ");
      }    
    }
    public static void password(String str2)
    {

 

      int lcount=0;
      int ucount=0;
      int dcount=0;
      int scount=0;
      

 

      for(int i=0;i<str2.length();i++)
        {
          char ch=str2.charAt(i);

 

          if(ch>='a'&& ch<= 'z')
          {
            lcount++;
          }
          else if(ch>='A'&& ch<= 'Z')
          {
            ucount++;
          }
          else if(ch>='0'&& ch<= '9')
          {
            dcount++;
          }
          else
          {
            scount++;
          }
        }

 


      if(lcount>0 && scount>0 && dcount>0 && ucount>0)
      {
        System.out.println("valid password");
      }
      else
      {
       System.out.println("not a valid password");
      }
      
    }

 


    public static void mobile(String str3)
    {
 

 

          if(str3.length()==10)
          {
            if(str3.startsWith("6")||str3.startsWith("7")||str3.startsWith("8")||str3.startsWith("9"))
            {

 

              System.out.println("valid mobile no"); 
            }
            else
           {
        System.out.println("invalid mobile no");
           }
             
          } 
          
      else       
          {
            System.out.println("the mobile no should be 10 digits only");
         }
    
          
        }

 

public static void quit()
    {
      System.exit(0);
    }

 


       public static void main(String args [] )
    {

 

     Scanner sc=new Scanner(System.in);
      
    System.out.println("choose the option \n 1 for email verifier  \n  2 for username and password verifier \n  3 for mobile number verifier  \n 4 for quit ");

 

      System.out.println("enter the choice (1,2,3,4)");
      char ch=sc.next().charAt(0);

 

      switch(ch)
        {
            
          case '1':
            Scanner sc1=new Scanner(System.in);
           System.out.println("enter the string");
           String str = sc1.nextLine();

 

          email(str);
          break;  

 

          case '2':
           Scanner sc2=new Scanner(System.in);

 

            
          System.out.println("enter the password");
           String str2 = sc2.nextLine();

 

          password(str2);
            
          break; 

 

          case '3':
           Scanner sc3=new Scanner(System.in);
            
           System.out.println("enter the mobile no");
           String str3 = sc3.nextLine();

 

          mobile(str3);
            
          break;  

 

          case '4':
          quit();
          break;  

 

          default :
          System.out.println("invalid");

 

       
        }
      
      
    }
  }
 