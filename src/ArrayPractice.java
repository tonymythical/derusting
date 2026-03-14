public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] planets = new String[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    planets[0] = "Mercury";
    planets[1] = "Venus";
    planets[2] = "Earth";
    planets[3] = "Mars";

    // Get the value of the array at index 2
    String thirdPlanet = planets[2];
    System.out.println("The planet at index 2 is: " + thirdPlanet);

    // Get the length of the array
    int arrayLength = planets.length;
    System.out.println("The array has " + arrayLength + " slots.");

    // Iterate over the array using a traditional for loop and print out each item
    System.out.println("--- Traditional Loop ---");
    for (int i = 0; i < planets.length; i++) {
        System.out.println("Index " + i + ": " + planets[i]);
    }

    // Iterate over the array using a for-each loop and print out each item
    System.out.println("--- For-Each Loop ---");
    for (String planet : planets) {
        System.out.println(planet);
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
