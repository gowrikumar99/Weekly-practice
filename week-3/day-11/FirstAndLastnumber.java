import java.util.Scanner;
class First and lastnumber{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the any positive number :");
    int num=input.nextInt();
    int FirstName=num;//897
    int LastName=num%10;//897%10
    while(FirstName>=10){ //true
      FirstName=FirstName/10;
      //LastName=LastName/10;
      //897/10=89 89/10=8   di=8
    }
    System.out.println("First Name="+FirstName);
    System.out.println("Last Name="+LastName);
  }
}