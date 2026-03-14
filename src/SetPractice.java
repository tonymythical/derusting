import java.util.*;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    Set<String> colorSet = new HashSet<>();

    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    colorSet.add("Red");
    colorSet.add("Blue");
    colorSet.add("Green");

    // Check whether the Set contains a given String
    boolean hasBlue = colorSet.contains("Blue");
    System.out.println("Does set contain Blue? " + hasBlue);

    // Remove an element from the Set
    colorSet.remove("Green");

    // Get the size of the Set
    int setSize = colorSet.size();
    System.out.println("Set size: " + setSize);

    // Iterate over the elements of the Set, printing each one on a separate line
    System.out.println("Remaining colors:");
    for (String color : colorSet) {
        System.out.println(color);
    }

    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
