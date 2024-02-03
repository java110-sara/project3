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
      
      // get input from the user
      System.out.println("This is a palindrome validator...");
      System.out.print("Please enter a string to see if it is a palindrome:  ");
      userInput = keyboard.nextLine();
      
      // asses if input is a palindrome
      for (int i = 0; i < userInput.length(); i++) {
         if (i >= userInput.length()/2) {
            isPalindrome = userInput.regionMatches(false, i, userInput, userInput.length()-1-i, 1);
         }
         if (isPalindrome == false) {
            System.out.println("Your string, " + userInput + ", is not a palindrome.");
            System.exit(0);
         }
      }
      
      // if you made through the loop it is a palindrome
      System.out.println("Congratulations! Your string, " + userInput + ", is a palindrome.");
      System.exit(0);
      
      
   }
}