// 3. even or odd numbers checking
import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
         int num=sc.nextInt();
        
         if(num%2==0){
            System.out.println("even number");
         }else{
            System.out.println("odd number : ");
         }
    }
}



// 4.print first N natural numbers 

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
         int num=sc.nextInt();
        
         for(int i=0;i<num;i++){
     System.out.println(i+" ");
         }
    }
}

// 5.sum of natural numbers

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
         int num=sc.nextInt();
         
         int sum=0;
         for(int i=0;i<=num;i++){
           sum=sum+i;
         }
         System.out.println(sum);
    }
}

