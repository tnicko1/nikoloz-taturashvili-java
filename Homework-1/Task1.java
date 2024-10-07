import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] container = {16, 15, 4, 42, 8, 23};
        Arrays.sort(container);
        for (int j : container) {
            System.out.print(j + " ");
        }
    }
}
