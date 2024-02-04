//name: Sara Russert
//date: 2/3/24
//file: Palendrome.java

import java.util.Scanner;

public class Palindrome {
   public static void main(String[] args) {
      // class variables
      Scanner keyboard = new Scanner(System.in);
      String userInput;
      Boolean isPalindrome = true;
      int counter = 0;
      
      // get input from the user
      // System.out.println("This is a palindrome validator...");
      System.out.print("Enter a string:  ");
      userInput = keyboard.nextLine();
      
      // asses if input is a palindrome
      for (int i = 0, j = userInput.length()-1; i < userInput.length(); i++, j--) {
         if (i <= userInput.length()/2) {
            boolean stringMatch = userInput.regionMatches(false, i, userInput, j, 1);
            if (stringMatch == false) {
               counter++;
               System.out.println("The chars at " + i + " and " + j + " do not match.");
               if (isPalindrome == true)
                  isPalindrome = false;
            }
         }
      }

      // if invalid palindrome
      if (isPalindrome == false) {
            System.out.println(userInput + " is not a valid palindrome.");
            System.out.println("The number of invalid character matches: " + counter);
            System.exit(0);
      }
      // if valid palindrome
      System.out.println(userInput + " is a valid palindrome.");
      System.exit(0);
      
      
   }
}