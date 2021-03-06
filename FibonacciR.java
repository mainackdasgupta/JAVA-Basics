public class FibonacciR {
    public static void printFibo(int secondlastterm, int lastterm, int numberofterms){

        if(numberofterms == 0){
            return ;
        }

        int nextterm = lastterm + secondlastterm;
        System.out.print(nextterm);
        printFibo(lastterm, nextterm, numberofterms-1);

    }
    public static void main(String args[]){
        int firstterm = 0;
        int secondterm = 1;
        System.out.print(firstterm);
        System.out.print(secondterm);

        int numberofterms = 7;                                // this can be taken from user but here i have taken 7.

        printFibo(firstterm, secondterm, numberofterms-2);
    }
}
