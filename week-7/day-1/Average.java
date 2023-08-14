
import java.util.Scanner;

public class Average{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of days");
    int n=sc.nextInt();
    double temp[]=new double[n];
    System.out.println("enter the temperatures of 7 days");
    for(int i=0;i<temp.length;i++)
      temp[i]=sc.nextDouble();
    double low_temp=temp[0];
    for(int j=0;j<temp.length;j++){
      if(low_temp>temp[j])
        low_temp=temp[j];
    }
    System.out.println("the lowest temperature of the week is "+low_temp);
  }
}