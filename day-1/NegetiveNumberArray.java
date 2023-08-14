//negetive numbersarray
import java.util.Scanner;
class NegetiveNumberArray{
  public static void main(String[] args){
    int a[]=new int[5];
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the elementes : ");
    for(int i=0;i<a.length;i++){
      a[i]=input.nextInt();
    }
    System.out.println("Negetive elementes are :");
    for (int i=0;i<a.length;i++){
      if(a[i]<0){
        
      }
      System.out.println(a[i]+"");
    }
  }
}