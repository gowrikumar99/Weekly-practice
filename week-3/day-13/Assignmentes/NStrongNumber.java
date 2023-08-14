//nth strong number
import java.util.Scanner;
 class NStrongNumber{
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.print("Enter the value of N: ");
    int n = input.nextInt();
    int count = 0;
    int num = 1;
    while (count < n) {
      int temp = num;
      int sum = 0;
      while (temp > 0) {
        int digit= temp % 10;
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
          fact =fact*i;
        }
        sum =sum+fact;
        temp /= 10;
      }
      if (sum == num) {
        System.out.println(num);
        count++;
      }
      num++;
    }
  }
}



