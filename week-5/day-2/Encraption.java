import java.util.Scanner;

public class Encraption{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String encryptedString = encrypt(str);
        System.out.println("Encrypted string: " + encryptedString);
        String decryptedString = decrypt(encryptedString);
        System.out.println("Decrypted string: " + decryptedString);
    }

    public static String encrypt(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = (char) (str.charAt(i) + 1);
            sb.append(c);
        }
        return sb.toString();
    }

    public static String decrypt(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = (char) (str.charAt(i) - 1);
            sb.append(c);
        }
        return sb.toString();
    }
}
