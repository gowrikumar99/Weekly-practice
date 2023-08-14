// armstrong number
import java.util.Scanner;
class armstrong{
  public static void main(String[] args){ 
    Scanner input=new Scanner(System.in);
    int num=input.nextInt();
    int sum=0;
    int temp=num;
    while(temp>0){
      int digit=temp%10;
      sum=sum=sum+Math.pow(digit,3);
      temp=temp/10;
      
    }return num==sum;
  }
}