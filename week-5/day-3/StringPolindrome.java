import java.util.Scanner;
class StringPolindrome{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
      String str="mom sir dod madam";
      String str1="";
    String str2[]=str.split(" ");
    for(int i=0;i<=str2.length;i++){
      str1=str2[i];
     // String str4="";
          String rev="";
        for(int j=str1.length()-1;j>=0;j--)
          {
           
          char ch=str1.charAt(j);
           rev= rev+ch;
         
          if(rev.equals(str1))
          {
            System.out.println(str1);
    }
          
    }
        //str4=str4+str2+" ";
    }
    //System.out.println(str4);
  }
}
    
      
  