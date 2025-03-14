import java .util.*;
import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = scanner.nextInt();
        for(int i=num;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
