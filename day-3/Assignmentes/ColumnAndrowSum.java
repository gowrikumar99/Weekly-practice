import java.util.Scanner;
class ColumnAndRowSum{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
      int a[][]={{1,5,8,6},{7,2,5,4},{3,6,9,2},{5,7,4,3}};
      //print the matrix
      for(int i=0;i<4;i++){
      for(int j=0;j<4;j++){
        System.out.println(a[i][j]+"");
      }
         System.out.println();
      }
     System.out.println();
    //sum of row elementes
     for(int i=0;i<4;i++){
       int sum=0;
      for(int j=0;j<4;j++){
        sum=sum+a[i][j];
      }
         System.out.println("sum of "+(i+1)+"is : "+sum);
      }
     System.out.println();
    //sum of column elementes
     for(int i=0;i<4;i++){
       int sum=0;
      for(int j=0;j<4;j++){
        sum=sum+a[j][i];
      }
         System.out.println("sum of column"+(i+1)+"is :"+sum);
      }
    }
  }
