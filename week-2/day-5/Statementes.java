// 64. Write a JAVAprogram to find length of a string and compare and concatenate two strings

/* 
class Example{
    public static void main(String[] args) {
        String a="GOWRI";
        String b="kumar";
       
        // lowercase and uppercase methods
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        
        // concat and length methods
        System.out.println(a.concat(b));
        System.out.println(b.length());
        
        // trim and isEmpty methods;
        String c="    gowrikumar     ";
        String d="";
        System.out.println(c.trim());
        System.out.println(d.isEmpty());
        
        // charAt and isEmpty methods
        System.out.println(b.charAt(2));
        System.out.println(a.indexOf('O'));
        System.out.println(b.equals(a));
    
    // comparession method
    if(a==b){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
    }
}

//65. Write a JAVAprogram to find total number of alphabets, digits or special character in a string
import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :-  ");
        String sentence=sc.nextLine();

        char letters[] = sentence.toCharArray(); // tochar()Array method dwara sentence lo store chesina charecters ni letters[] ane array lo store chesukuntunnamu.
        int alphabets =0;
        int numbers=0;
        int others=0;
        int spaces=0;

        for(int i=0;i<letters.length;i++){
           if(Character.isLetter(letters[i])){ 
              alphabets++;
           }else if(Character.isDigit(letters[i])){
            numbers++;
           }else if(Character.isSpaceChar(letters[i])){
             spaces++;
           }else{
            others++;
           }
        }
        System.out.println("Alphabets : "+alphabets);
        System.out.println("numbers: "+numbers);
        System.out.println("spacialcharactors"+spaces);
        System.out.println("spaces : " +others);
        sc.close();
    }
}

// 66. Write a JAVAprogram to count total number of vowels and consonants in a string.

// count number of degits

// input 3456---->
import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        System.out.println("Enter any number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("No of digits :"+count);
    }
}


import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        int vowels=0, consonents=0;
        String str1="Hi Friends Welcone to our Channel";
        str1=str1.toLowerCase();

        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || 
               str1.charAt(i)=='i' || str1.charAt(i)=='o' || 
               str1.charAt(i)=='u' ){
                vowels++;
               }
            else if(str1.charAt(i)>='a' && str1.charAt(i)<='z'){
                 consonents++;
            }
        }


        
    }
}
*/