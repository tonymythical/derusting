/*
 * In this file you will follow the comments' instructions to complete
 * the Person class.
 */

public class Person {
  // Declare a public String instance variable for the name of the person
  // Declare a private int instance variable for the age of the person
  public String name;
  private int age;
  // Create a constructor that takes the name and age of the person
  // and assigns it to the instance variables
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Create a toString method that gives the name and age of the person
  @Override
  public String toString() {
    return "Name: " + name + ", Age: " + age;
  }

  // Implement the below public instance method "birthYear"
  public int birthYear(int currentYear) {
    return currentYear - this.age;
  }
  // There should NOT be any print statement in this method.
  /**
   * birthYear returns the year the person was born.
   * 
   * The birth year is calculated by subtracting the person's age from currentYear
   * that's passed in as an int. It assumes that the person's birthday has already
   * passed this year.
   * 
   * @param currentYear an int for the current year
   * @return The year the person was born
   */
  // (create the instance method here)


  public static void main(String[] args) {
    // Create an instance of Person
    Person person1 = new Person("Tony", 25);

    // Create another instance of Person with a different name and age and
    // assign it to a different variable
    Person person2 = new Person("Yony", 99);

    // Print the first person
    System.out.println(person1);

    // Print the second person
    System.out.println(person2);

    // Get the name of the first person and store it in a local variable
    String firstName = person1.name;

    // Using the birthYear method, get the birth year of the first person
    // and store it in a local variable. Input the actual current year (e.g. 2025)
    // as the argument.
    int bornIn = person1.birthYear(2026);

    // In a separate statement, print the local variable holding the birth year.
    System.out.println(firstName + " was born in: " + bornIn);

    /**
     * Terminology!
     * 
     * A class is the overall definition, like a blueprint.
     * An instance is a specific object made according to that definition.
     * We use "instance" and "object" to mean the same thing.
     * 
     * For example, if there is a Person class, we can make an instance of a specific person: Auberon.
     * 
     * There can be many instances for the same class. For example: Auberon, Xinting, Baya are all
     * different instances of the Person class.
     * 
     * Each instance has its own instance variables: Auberon's age can be different from Baya's age.
     */
  }
}
