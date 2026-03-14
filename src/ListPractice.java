import java.util.*;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> fruits = new ArrayList<>();

    // Add 3 elements to the list (OK to do one-by-one)
    fruits.add("Apple");
    fruits.add("Blueberries");
    fruits.add("Cherries");

    // Print the element at index 1
    System.out.println("Element at index 1: " + fruits.get(1));

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    fruits.set(1, "Guava");

    // Insert a new element at index 0 (the length of the list will change)
    fruits.add(0, "Strawberry");

    // Check whether the list contains a certain string
    boolean hasApple = fruits.contains("Apple");
    System.out.println("Contains 'Apple'?: " + hasApple);

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    System.out.println("--- For-loop ---");
    for (int i = 0; i < fruits.size(); i++) {
      System.out.println("Index " + i + ": " + fruits.get(i));
    }

    // Sort the list using the Collections library
    Collections.sort(fruits);

    // Iterate over the list using a for-each loop
    // Print each value on a second line
    System.out.println("--- For-each loop ---");
    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}