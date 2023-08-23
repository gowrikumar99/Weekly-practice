import java.util.*;
public class VectorDemo{
public static void main(String args[]){
    Vector v1=new Vector();
    v1.add("Gowrikumar");
    v1.add("amma");
  // output is gowrikumar,amma;
    System.out.println(v1); 

    v1.add("appanna");
    v1.add("ganga");
    v1.add(0,"gowri");// index position we give firstposition 0;
    //System.out.println(v1);// o/p gowri,appanna,ganga;

    //v1.add("y1");
    //v1.add("y2");
    //v1.add("y3");
    //v1.add("y4");
    //v1.add("y5");
    //v1.add("y6");
    //v1.add("y7");
    //v1.add("y8");
    //v1.add("y9");
    //v1.add("y10");
    //v1.add("y1");  // duplicatea are allowed
    //size-no of elementes present in list
    //capacity-array capacity
    //System.out.println(v1);      //y1,y2,y3,.....y11;
    //System.out.println("size : "+v1.size());   // 11
    //System.out.println("capacity : "+v1.capacity());  //   20
}
}
