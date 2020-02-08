// CSCI 200 Program 2

import java.util.*;

public class Program2 {
  //
  // method: isPalindrome
  // pre-conditions: a string is passed in
  // post-conditions: return true if the string is a palindrome otherwise return false
  //
  public static Boolean isPalindrome(String s){
    s = s.toUpperCase();
    s = s.trim();
    s = s.replaceAll("\\s", "");
//    s = s.replaceAll(",", "");
//    s = s.replaceAll(".", "");
//    s = s.replaceAll("-", "");
//    s = s.replaceAll("!", "");

    StringBuilder sb = new StringBuilder();

    // append a string into StringBuilder sb
    sb.append(s);

    // reverse StringBuilder reversed
    String reversed = sb.reverse().toString();

    // determine if input is Palindrome
    return s.equals(reversed);
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
