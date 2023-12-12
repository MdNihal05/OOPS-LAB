import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the substring to find: ");
        String substring = scanner.nextLine();

        if (input.contains(substring)) {
            System.out.println("Substring found in the given string.");

            if (input.startsWith(substring)) {
                System.out.println("The given string starts with the substring.");
            }

            if (input.endsWith(substring)) {
                System.out.println("The given string ends with the substring.");
            }
        } else {
            System.out.println("Substring not found in the given string.");
        }
    }
}
