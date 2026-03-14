public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float aFloat = -1f;
    System.out.println("The float value is: " + aFloat);

    // Create an int with a positive value and assign it to a variable
    int anInt = 14;

    // Use the modulo % operator to find the remainder when the int is divided by 3
    int remainderByThree = anInt % 3;
    System.out.println("Remainder being divided by 3: " + remainderByThree);

    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    if (anInt % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }

    // Divide the number by another number using integer division
    int divisionResult = anInt / 4;
    System.out.println("Result of " + anInt + " / 4 (integer division): " + divisionResult);

    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
