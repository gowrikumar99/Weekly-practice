

import java.util.Scanner;
class LeapYear1
  {
    public static void main(String args[])
    {
     
    Scanner sc= new Scanner(System.in);
      
do{
  

 

      System.out.println("enter starting the year");
      int start = sc.nextInt();

 

      System.out.println("enter the ending year");
      int end = sc.nextInt();

 

    
      if(start<=end)
      {

 

      for(int i=start;i<=end;i++)
        {
       if((i%4==0 && i%100!=0)|| (i%400==0))
      {
        
        System.out.print(i+" ");
      }
        }
        break;
        
      }
        
    
    else
    {
      System.out.println("the start year should be less than end year please renter again");

 


    }
}
     while(true);   

 

        
      
    }  
    }
  