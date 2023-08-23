//special methods available in stack.
//push,pop,peek,search,isEmpty()
import java.util.*;
class Stack{
    public static void main(String[] args) {
        Stack<String>books= new Stack<>();
        books.add("red");
        books.add("black");
        books.add("white");
        System.out.println(books);//  print red,black,white
        System.out.println(books.peek()); // last element print white
        System.out.println(books);
        System.out.println(books.pop()); // last element remove
        System.out.println(books); // then remain red and white
        books.push("red");
        books.push("black");
        books.push("white");
        books.push("black");
        books.push(null);
        System.out.println(books); // red,black,white
      System.out.println(books.pop());  // push method=add method. add method to push method same output.white
      System.out.println(books);//red,black
      System.out.println(books);  // ptrnt red,black,white
      System.out.println(books.search("white")); // 1  down to count
      System.out.println(books.indexOf("white")); //upto count index starting 0 index position
      System.out.println(books);// print red,black,white
      System.out.println(books.isEmpty());  // false .hear 3 values,red,black,white
      System.out.println(books.empty());
    }
}