import java.util.Scanner;
class Sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();
        
        
        int i;
        int count=0;
        for(i=1;i<=10;i++){
            for(int j=1;j<=i;j++){
              if(i%j==0){
                count++;  //+1
              }
            }
            if(count==2){ 
            System.out.println(i);
            }
        }
    }
}
