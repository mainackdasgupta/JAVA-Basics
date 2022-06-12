
public class factorial{
    public static int calfactorial1(int n){
        if( n == 1 || n == 0){      //BASE CASE
            return 1;
        }
        int fact_nm1 = calfactorial1(n-1);     //Recursion
        int fact_n = n * fact_nm1;             //The work(kaam)
        return fact_n;
       
    }
    public static void main(String args[]){
        int n = 8;
        int ans = calfactorial1(n); //n=3
        System.out.println(ans);

    }
}