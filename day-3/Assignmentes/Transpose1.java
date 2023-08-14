import java.util.Scanner;
class Transpose{
  public static void main(String[] args){
     int a[][]=new int [2][2];
    Scanner input= new Scanner(System.in);
    System.out.println("Enter array Data");
    for(int i=0;i<=1;i++){
      for(int j=0;j<=1;j++){
        a[i][j]=input.nextInt();
      }
    }
  System.out.println(" array matrix");
    for(int i=0;i<=1;i++){
      for(int j=0;j<=1;j++){
        System.out.println(a[i][j]);
      }
    }
    System.out.println();
    System.out.println("Transpose matrix");
    for(int i=0;i<=1;i++){
      for(int j=0;j<=1;j++){
        System.out.println(a[j][i]);
      }
    }
    System.out.println();
  }
}