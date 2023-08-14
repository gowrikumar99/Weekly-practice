import java.util.Scanner;
class AddTwoMatrix{
  public static void main(String[] args){
    int a[][]=new int[2][2];
    int b[][]=new int[2][2];
    int c[][]=new int[2][2];
    Scanner input=new Scanner(System.in);
    System.out.println("Enter first matrix data");
    for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
        a[i][j]=input.nextInt();
      }
    }
    System.out.println("Enter first matrix data");
    for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
        b[i][j]=input.nextInt();
      }
    }
    System.out.println("first matrix \n");
     for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
        System.out.println(a[i][j]+"");
      }
       System.out.println("\n");
    }
     System.out.println("second matrix \n");
     for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
        System.out.println(b[i][j]+"");
      }
       System.out.println("\n");
    }
     System.out.println("Sum of two matrix \n");
     for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
        c[i][j]=a[i][j]+b[i][j];
        System.out.println(c[i][j]+"");
      }
       System.out.println("\n");
    }
  }
}