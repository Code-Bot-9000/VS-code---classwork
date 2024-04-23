package Class_Examples;

public class PersonTest
{
    public static void main(String[] args) {
        // Creating objects of Person class
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Accessing and printing information using getter methods
        System.out.println("Person 1:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        System.out.println();

        System.out.println("Person 2:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());

        System.out.println();

        // Changing information using setter methods
        person1.setName("Charlie");
        person1.setAge(35);

        // Printing updated information
        System.out.println("Updated Person 1:");
        person1.printInfo();
    }
}