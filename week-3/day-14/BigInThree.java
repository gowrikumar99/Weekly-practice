//findout which number is bigger in three numbers
import java.util.Scanner;
class BigInThree{
public static void findLargest(int num1,int num2, int num3){
    if(num1>=num2 && num1>=num3){
        System.out.println("the biggest number is "+num1);
        
    }
    else if(num2>=num3){
        System.out.println("the biggest number "+num2);
        
    }
    else{
        System.out.println("the biggest number"+num3);
        
    }
}
  public static void main(String[] args){
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter the first number");
  int num1=scan.nextInt();
  System.out.println("Enter the second number");
  int num2=scan.nextInt();
  System.out.println("Enter the Third number");
  int num3=scan.nextInt();
  findLargest(num1,num2,num3);
  }
}

