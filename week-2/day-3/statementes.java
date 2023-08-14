// 6. print the odd numbers beetwen 1 to n

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
         int num=sc.nextInt();
         
        for(int i=0;i<num;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}

// 7.sum of odd numbers.


import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
         int num=sc.nextInt();
         
         int sum=0;
        for(int i=0;i<num;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println("sum of odd numbers are : "+sum);
    }
}



// 8. take character  input from the user.


import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character : ");
        
        char c;
        c=sc.next().charAt(0);
        System.out.println(c);

    }
}



// 9.character is vowel or consonent

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        System.out.println("Enter any character : ");
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.next().charAt(0);
       if(ch='a' || ch='e' || ch='i' ||ch='o' || ch='u'){
        System.out.println("vowels");
       }else{
        System.out.println("characters");
       }

    }
}

// 10. ASCI values of characters
// input A------>65
import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        System.out.println("Enter any character : ");
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.next().charAt(0);
        int a=ch;

        System.out.println("Asci values of "+ch+" is : "+a);

    }
}

// 11 print A TO Z alphabets
// ABCDEFGHIJKLMNOPQRS
import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        
        for(char i='A';i<='Z';i++){
            System.out.println(i+" ");
        }
    }
}

// 12.calculate the power of number

// input n=5
// power p=3
// 5*5*5=125
import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num1=sc.nextInt();
        System.out.println("Enter the power : ");
        int num2=sc.nextInt();
        int result=1;
        for(int i=1;i<=num2;i++){
        result=result*num1;
        }
       System.out.println(result);
        
    }
}
