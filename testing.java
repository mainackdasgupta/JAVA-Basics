import java.util.*;
public class testing {
    int binarysearch( arr, int n, int k){
        for(int i = 0; i < n; i++){
            if(arr[i] == k){
                return i;
            }else{
                return -1;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();                       //this line is putting the user inputs in the array with the help of for loop.
        } 

        int b = binarysearch( arr, n, k)
        //for output
        for(int i = 0; i< n; i++){
            System.out.println(b);
        }
          
    } 
}
