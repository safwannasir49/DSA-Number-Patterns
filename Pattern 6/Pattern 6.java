import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            int num = rows - i;
            for (int j = 0; j < (rows - i); j++) {
                System.out.print(num + j);
            }
            System.out.println();
        }

        scanner.close();
    }
}
