












import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
//    List<String> list=new ArrayList<String>();
    ArrayList list=new ArrayList();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of elements");
    int length=sc.nextInt();
    for(int i=0;i<length;i++)
    {
        int element=sc.nextInt();
        list.add(element);
    }
    System.out.println("the elements are");
    for(Object al:list)
    {
        System.out.println(al);
    }

    }
}