import java.util.Scanner;

public class EqualIgnore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        boolean isEqual = str1.equals(str2);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);

        System.out.println("Using equals: " + isEqual);
        System.out.println("Using equalsIgnoreCase: " + isEqualIgnoreCase);
    }
}
