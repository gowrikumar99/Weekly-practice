// 13.total and average markes of 5 subjects
import java.util.Scanner;
class Sample{
    public static void main(String[] args) {
        int a,b,c,d,e;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter markes of 5 subjects");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();

        int sum=a+b+c+d+e;
        System.out.println("Total markes : " +sum);
        double avg=sum/5;
        System.out.println("avg markes : " +avg);

    }
}

// 14. find the factorial of a number

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt();
       int fact=1;
       for(int i=1;i<=num;i++){
        fact=fact*i;
       }
        System.out.println(fact);
    }
}

// 15.factor of a nuumber

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt();
       for(int i=1;i<=num;i++){
        if(num%i==0){
       System.out.println(i);
        }
       }
    }
}

// 16. count digits in number.

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt();
       int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("no of digits : "+count);
    }
}


// 17.age eligible for voting

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int age=sc.nextInt();
      if(age>=18){
        System.out.println("eligible");
      }else{
        System.out.println("not eligible");
      }
        
    }
}


// 18.multiplication of table

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt();
      
        for(int i=0;i<=10;i++){
         System.out.println(num+"*"+i+"="+num*i);
        }
        
    }
}

*/
// 19 . tax calculation program
// input sal<=10000  -- > no tax
// input sal>10000 b/w sal<=100000---->10% tax
// input sal>100000  ----20% tax;


import java.util.Scanner;
class Sample{
    public static void main(String[] args) {
    int sal; double tax;
    System.out.println("Enter salary : ");
    Scanner sc=new Scanner(System.in);
    sal=sc.nextInt();
    if(sal<=10000){
        System.out.println(sal+"No tax");
    }else if(sal>10000 && sal<=100000){
        tax=sal*0.10;
        System.out.println(sal+" "+tax);
    }else{
         tax=sal*0.20;
        System.out.println(sal+" "+tax);
    }
    
    }
}