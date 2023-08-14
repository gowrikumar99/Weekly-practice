import java.util.Scanner;
class LastWord{
  public static void main(String args[]){
    Scanner lastwd=new Scanner(System.in);
    System.out.println("enter the string :");
    String st=lastwd.nextLine();
    String str[]=st.split(" ");
    String last="";
    for(int i=str.length-1;i>=0;i--){
      last=str[i];
      break;
      
    }
    System.out.println("this is last word is : "+last);
  }
}