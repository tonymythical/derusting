import java.util.*;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> inventory = new HashMap<>();

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    inventory.put("Guavas", 50);
    inventory.put("Strawberry", 20);
    inventory.put("Cherries", 100);

    // Get the value associated with a given key in the Map
    Integer guavaCount = inventory.get("Guavas");
    System.out.println("Count of Guavas: " + guavaCount);

    // Find the size (number of key/value pairs) of the Map
    int size = inventory.size();
    System.out.println("Number of items in inventory: " + size);

    // Replace the value associated with a given key (the size of the Map shoukld not change)
    inventory.put("Strawberry", 25);

    // Check whether the Map contains a given key
    boolean hasGrapes = inventory.containsKey("Grapes");
    System.out.println("Do we have Grapes? " + hasGrapes);

    // Check whether the Map contains a given value
    boolean hasQuantity100 = inventory.containsValue(100);
    System.out.println("Is any item count exactly 100? " + hasQuantity100);

    // Iterate over the keys of the Map, printing each key
    System.out.println("Keys:");
    for (String key : inventory.keySet()) {
        System.out.println(key);
    }

    // Iterate over the values of the map, printing each value
    System.out.println("Values:");
    for (Integer value : inventory.values()) {
        System.out.println(value);
    }

    // Iterate over the entries in the map, printing each key and value
    System.out.println("Full Inventory:");
    for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
