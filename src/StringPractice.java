import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String myStr = "Hello World";

    // Find the length of the string
    int length = myStr.length();
    System.out.println("Length: " + length);

    // Concatenate (add) two strings together and reassign the result
    myStr = myStr + "!";

    // Find the value of the character at index 3
    char charAtThree = myStr.charAt(3);
    System.out.println("Character at index 3: " + charAtThree);

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    boolean containsAbc = myStr.contains("abc");
    System.out.println("Contains 'abc'?: " + containsAbc);

    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < myStr.length(); i++) {
        System.out.println(myStr.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    List<String> fruitList = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    fruitList.add("Apple");
    fruitList.add("Guava");
    fruitList.add("Cherry");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joinedFruits = String.join(", ", fruitList);

    // Check whether two strings are equal
    boolean areEqual = "Apple".equals(fruitList.get(0));
    System.out.println("Is index 0 'Apple'?: " + areEqual);

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
    System.out.println("Joined String: " + joinedFruits);
  }
}
