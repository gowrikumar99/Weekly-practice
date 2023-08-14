import java.util.Scanner;
class Length{
  public static void main(String[] args){
    String str="universe";
    String str1="HelloWorld";
    String str2=str.concat(str1);
  
    System.out.println(str.length());
    System.out.println(str2);
    System.out.println("str>str1 "+str.compareTo(str1));
  }
}