// java program to demonstrate array programs in array list user defined objects.
import java.util.ArrayList;
import java.util.Iterator;
class Collection{
  
public static void main(String args[]){
  // creating user class object
  Student s1=new Student(101,"gowri",23);
  Student s2=new Student(102,"kumar",24);
  Student s3=new Student(103,"yadav",25);

  ArrayList<Student> al=new ArrayList<Student>();
  al.add(s1);
}
}