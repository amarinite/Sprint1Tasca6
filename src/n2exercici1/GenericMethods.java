package n2exercici1;

public class GenericMethods {
    public static <T> void printArguments(T arg1, T arg2, String arg3) {
        System.out.println("Argument 1: " + arg1);
        System.out.println("Argument 2: " + arg2);
        System.out.println("Argument 3: " + arg3);
    }
}
