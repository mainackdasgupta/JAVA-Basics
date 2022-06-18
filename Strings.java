import java.util.*;

public class Strings {

    // this portion is about how we can compare two strings.

   /*  public static void main(String args[]) {
        String name1 = "Tony";
        String name2 = "Tony";
  
        if(name1.equals(name2)) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }


        if(name1.compareTo(name2) == 0) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }
  
        //DO NOT USE == to check for string equality
        //Gives correct answer here
        if(name1 == name2) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }
  
        //Gives incorrect answer here
        if(new String("Tony") == new String("Tony")) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }
       
    } */
      public static void main(String args[]){

       // Concatenation 
      String T1 = "tony";
      String T2 = "muku";
      String T3 = T1 + " "+ T2;
      String T4 = "Bruce Wanye";
      System.out.println(T3);

      // user input in strings.
      Scanner sc = new Scanner(System.in);
      String T = sc.nextLine();
      System.out.println(T);

      //ParseInt Method of Integer class
      String str = "123";
      int number = Integer.parseInt(str);
      System.out.println(number);

      
      for(int i = 0; i<T3.length(); i++){
        System.out.println(T3.charAt(i));    // Access characters of a string.
      }

      System.out.println(T4.substring(6,8));   //The substring of a string is a subpart of it.
     
      // converting a integer variable to string.
      int number1 = 123;
      String str1 = Integer.toString(number1);
      System.out.println(str1.length());
      System.out.println(str1);
    }
     
   
}
