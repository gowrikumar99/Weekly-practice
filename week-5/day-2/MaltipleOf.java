import java.util.Scanner;
class MaltipleOf{
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    System.out.println("enter the number");
    int num=input.nextInt();
    num=1;
    do{
      System.out.println(num);
        num=num+1;
    }while(num<=100);
  }
}