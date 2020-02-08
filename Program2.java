// CSCI 200 Program 2

import java.util.*;

public class Program2 {
  //
  // method: isPalindrome
  // pre-conditions: a string is passed in
  // post-conditions: return true if the string is a palindrome otherwise return false
  //
  public static Boolean isPalindrome(String s){
      // put your code here
  }

  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String word = scan.nextLine();
      //
      // keep reading words until the word QUIT is read in
      //
      while (!word.equals("QUIT")) {
        //
        // call the isPalindrome method passing it the word
        // based on what this method returns (true or false) output a message
        //
        if (isPalindrome(word))
            System.out.println("the string [" + word + "] IS a palindrome.");
        else
            System.out.println("the string [" + word + "] IS NOT a palindrome.");
        word = scan.nextLine();
      }
  }
}
