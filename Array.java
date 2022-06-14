import java.util.Scanner;

public class Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);                   //this the user input object.
       // System.out.println("please give the array size");
        int Size = sc.nextInt();                               //this isthe variable where the user input for the array size will be stored.
        int thearray[] = new int[Size];                        //this is the array where the user input elements will be stored.

        //for input
        for(int i = 0; i<Size; i++){
            thearray[i] = sc.nextInt();                       //this line is putting the user inputs in the array with the help of for loop.
        } 
        //for output
        for(int i = 0; i< Size; i++){
            System.out.println(thearray[i]);
        }
    }
}


