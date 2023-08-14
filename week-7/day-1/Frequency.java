import java.util.Scanner;
class Frequency{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size : ");
    int a=sc.nextInt();
    System.out.println("Enter the elementes: ");
    int b[]=new int[a];   // 1,2 3 4,1,2,3
    for(int i=0;i<b.length;i++){
      b[i]=sc.nextInt(); 
    }
    boolean c[]=new boolean[a];
    for(int j=0;j<c.length;j++){
      c[j]=false;
    }
    for(int i=0;i<c.length;i++){
      int count=1;
      if(c[i]==true){
        continue;
      }
      for(int j=i+1;j<b.length;j++){
        if(b[i]==b[j]){
          count++;
          c[j]=true;
        }
      }
       System.out.println(b[i]+" "+count); 
    }
  }
}