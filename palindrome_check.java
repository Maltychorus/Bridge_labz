import java.util.Scanner;
public class palindrome_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input a string from user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Reverse the string
        String reversed = new StringBuilder(input).reverse().toString();

        // Print the reversed string
        System.out.println("Reversed string: "+ reversed);

        if (input.equals(reversed)){
            System.out.println("The string is a palindrome.");
        }
        else {
            System.out.println("The string is not a palindrome.");
        }
        scanner.close();
    }
}
