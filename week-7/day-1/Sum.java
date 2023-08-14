import java.util.Scanner;
class Sum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array : ");
    int a=sc.nextInt();
    System.out.println("Enter the elementes : ");
    int []b=new int  [a];
    for(int i=0;i<b.length;i++){
      b[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=1;i<b.length;i++){
      sum=sum+b[i];
    }
    System.out.println(sum);
  }
}