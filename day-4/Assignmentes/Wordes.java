//print wordes and length
import java.util.Scanner;
class Wordes{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    String str="Gowrikumar";     //input string name
    int count=0;
    for(int i=0;i<str.length();i++){
      count=count+1;
    }
    System.out.println(count);
  }
}