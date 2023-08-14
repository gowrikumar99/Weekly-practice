import java.util.Scanner;
class PrimeNumberArray
  {
    public static void prime(int number)
    {
      int total=0;
     Scanner sc=new Scanner(System.in);
       for(int i=0;i<=number;i++)
        {
         int count=0;
          for(int j=1;j<=i;j++)
            {
             if(i%j==0)
             {
               count++;
             }
            }
        
      if(count==2)
      {
        System.out.println(i);
      }
       }
   }
          
            
    }