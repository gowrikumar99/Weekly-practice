//find prime number
import java.util.Scanner;
class PrimeNumber{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=input.nextInt();
    int count=0;
    for(int i=1;i<=num;i++){  //i=1,1<=5//2<=5 remainder is 1 then count is not increse 5<=5 condition satisfied then count value is increse count==2
      //(NOTE: here count is i value i=1 count is increse count=count+1=0+1=1,i=5 count is increse5%5=0 before count value is 1 but now 5%5=0 then count value increment count==2 )
      if(num%i==0){           //5%1=0 then count=1//
        count++;   //first count==0,num%1==0 then count==1,num%5==0 then count==2    
      }
    }
    if(count==2){
      System.out.println("this is prime number");
    }else{
      System.out.println("this is not prime number");
    }
  }
}