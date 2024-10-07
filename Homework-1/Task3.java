import java.util.Scanner;

public class Task3 {
    public static int countOccurrences(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        int occur = countOccurrences(input, ch);
        System.out.printf("The character %c occurs %d times\n", ch, occur);
    }
}