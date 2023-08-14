//vowels from string
import java.util.Scanner;
class V{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    String str="gowrikumar";
   int  vowels=0, conconentes=0;   //vowels and conconentes equals to zero
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
       vowels=vowels+1;    //vowels increment
      
    }else{
      conconentes=conconentes+1;  //conconentes increment
    }
    }
    System.out.println("Enter the vowel :"+vowels);
    System.out.println("Enter the conconent : "+conconentes);
  }
}