import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int[][] rray = new int[10][10];
        // Scanner input=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Scanner input = new Scanner(System.in);
                rray[i][j] = input.nextInt();
            }
        }
       // Arrays.sort(rray);sorting command
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(rray[i][j]);
            }
        }
    }
}
