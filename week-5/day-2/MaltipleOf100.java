import java.util.Scanner;
class M{
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number :");
    int num=input.nextInt();
    do{ 
    if(num%100==0){
    System.out.println("this is divisible by 100");
      break;
    }
     else{
    System.out.println("this is not devisible");
  
  }
 } while(true);
}
}