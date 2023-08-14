import java.util.Scanner;
class SplitWordes{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
      String str="DUKKA GOWRI KUMAR";
    String rev="";
    int count=0;
    for(int i=0;i<str.length();i++){
      rev=rev+str.charAt(i);
      count=count+1;
    }
    System.out.println("this is wordcount :"+count);
    System.out.println("this is wordreverse :"+rev);
  }
}