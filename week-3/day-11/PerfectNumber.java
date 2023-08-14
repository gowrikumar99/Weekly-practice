import java.util.Scanner;
class PerfectNumber{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number perfect or not :");
    int num=input.nextInt(); //28
    int sum=0;
    for(int i=1;i<=num;i++){  //1<=28
      if(num%i==0){    //28%1=28,28%2=14,28%4=7,28%7=4,28%14=2,28%28=1;===(28=14+7+4+2+1)
        sum=sum+i; //sum=0+1=1,1+2=3,3+4=7,7+7=14,14+14=28;
      }
    }
    if(num==sum){
      System.out.println("this is perfect number");
      
    }else{
      System.out.println("this is not perfect number");
    }
  }
}