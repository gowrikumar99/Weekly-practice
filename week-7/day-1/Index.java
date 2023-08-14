import java.util.Scanner;
class Index{
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    int a[] ={1,2,3,4,5};
    System.out.println("Enter the index value");
    int num=sc.nextInt();
    for(int i=0;i<a.length;i++){
      if(i==num){
        System.out.println(+a[i]);
      }
    }
  
  }
}