package n2exercici1;

public class GenericMethods {
    public static <T, V> void printArguments(T arg1, V arg2, String arg3) {
        System.out.println("Argument 1: " + arg1);
        System.out.println("Argument 2: " + arg2);
        System.out.println("Argument 3: " + arg3);
    }
}
