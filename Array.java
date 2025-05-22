import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        // ch = input.next().charAt(0);

        int[] Number;// declareation
        Number = new int[10];// creation
        for (int i = 0; i < 10; i++) {
            Scanner input1 = new Scanner(System.in);
            Number[i] = input1.nextInt();
        }
        System.out.println(Number.length);
        for (int x : Number) {
            System.out.print(x);
            System.out.print(" ");
        }
        int[][] arry = new int[10][10];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                Scanner input = new Scanner(System.in);
                arry[i][j] = input.nextInt();
            }
        }

    }
}
