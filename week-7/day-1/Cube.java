// cube
import java.util.Scanner;
class Cube {
  public static void main(String[] args){
    System.out.print("Input number of terms : ");
    Scanner sc = new Scanner(System.in);
		   int n = sc.nextInt();
       for(int i=1;i<=n;i++)
     {
        System.out.println(i*i*i); 
    }
 }
}