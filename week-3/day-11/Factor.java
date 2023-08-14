import java.util.Scanner;
class Factor{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    //System.out.println("Enter the factorial number : ");
    int num=30;
    
    for(int i=1;i<=num;i++){
      if(num%i==0){
        System.out.println(i);
      }
    }
  }
}