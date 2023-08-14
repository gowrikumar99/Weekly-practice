import java.util.Scanner;
class NumDivisibleBy3{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the value : ");
    int num=input.nextInt();
    int i=1;
    for(i=1;i<=num;i++){
      if(i%3==0){
        System.out.print(i+" ");
        
      }
    }
  }
}