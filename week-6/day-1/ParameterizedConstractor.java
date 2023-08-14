import java.util.Scanner;
class ParameterizedConstractor{
  String name;
  int id;
  String branch;
  public static void main(String args[]){
    ParameterizedConstractor s1=new ParameterizedConstractor("gowri");
    ParameterizedConstractor s2=new ParameterizedConstractor("kumar",102);
    ParameterizedConstractor s3=new ParameterizedConstractor("dukka",103,"mechanical");
  }
  ParameterizedConstractor(String x){
    name=x;
    System.out.println("first constractor: ");
    System.out.println("name: "+name);
  }
  ParameterizedConstractor(String x,int y){
    name=x;
    id=y;
    System.out.println("second constractor: ");
    System.out.println("name: "+name+"id"+id);
  }
  ParameterizedConstractor(String x,int y,String z){
    name=x;
    id=y;
    branch=z;
    System.out.println("3rd constractor: ");
    System.out.println("name: "+ name+"id"+ id+"branch"+ branch);
  }
}