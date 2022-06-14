//this is the linear Search algorithm.


import java.util.Scanner;

public class Array2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please give the array size");       
        int Size = sc.nextInt();
        int theArray2[] = new int[Size];

        for (int i = 0; i < theArray2.length; i++) {
            theArray2[i] = sc.nextInt();
        }

        System.out.println("please give the element to be searched");
        int K = sc.nextInt();

        for (int i = 0; i < Size; i++) {
            if (theArray2[i] == K) {
                System.out.println("the value found at the index:" + i);
               // System.out.println("and the value is:" + theArray2[i]);
            } 
            /*else
                System.out.println("the element is not there in the array"); */
        }
       // System.out.println();
    }
}
