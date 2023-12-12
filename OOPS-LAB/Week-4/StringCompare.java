import java.util.*;

public class StringCompare{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        int result = str1.compareTo(str2);

        if (result == 0) {
            System.out.println("Both strings are equal.");
        } else if (result < 0) {
            System.out.println("First string is lexicographically smaller than the second string.");
        } else {
            System.out.println("First string is lexicographically larger than the second string.");
        }
    }
}
