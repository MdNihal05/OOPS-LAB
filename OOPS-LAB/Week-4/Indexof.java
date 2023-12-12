import java.util.Scanner;

public class Indexof{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine().toLowerCase();

        System.out.print("Enter the alphabet to count: ");
        char alphabet = scanner.next().toLowerCase().charAt(0);

        int count = 0;
        int index = text.indexOf(alphabet);

        while (index != -1) {
            count++;
            index = text.indexOf(alphabet, index + 1);
        }

        System.out.println("Occurrences of " + alphabet + ": " + count);
    }
}
