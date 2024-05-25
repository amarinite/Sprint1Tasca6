package n2exercici1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Karlie", "Jones", 25);
        String message = "A message for the people";
        float number = 23.5f;

        GenericMethods.printArguments(number, message, person1.getName());
    }
}