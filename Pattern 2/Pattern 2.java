import java .util.*;
import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        num = 1;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=cols;j++)
            {
                System.out.print(num +" ");
                num ++;
            }
            System.out.println();
        }
    }
}
