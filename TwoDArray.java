// Just performing input output in 2D array.

import java.util.Scanner;
public class TwoDArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int theTDArray[][] = new int[row][column];

        // for input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                theTDArray[i][j] = sc.nextInt();
            }
        }
         //for output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(theTDArray[i][j] + " ");
            }
        }
        System.out.println();

    }
}
