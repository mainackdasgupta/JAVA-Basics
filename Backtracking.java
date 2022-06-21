// Code for printing all the permutations of the string "ABC".

public class Backtracking {
    public static void printPermutation(String str, String perm, int indx){
        
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }

        for(int i = 0; i<str.length(); i++){
            char currChar = str.charAt(i);                                              //takes the first alphabet and saves in the currChar substring, i.e 'A' of "ABC" in the first itaration.
            String newStr = str.substring(0,i) + str.substring(i+1);        //now this does the second step of givening two combinations of 'A' in the first place as "A-BC" and "A-CB" by backtracking.
            printPermutation(str, perm + currChar, indx+1);                            //this line repeats the itatation to get the other permutaions by calling itself again.    
        }
    }
    public static void main (String args[]){
        String str = "ABC";
        printPermutation(str, "", 0);
    }
}
