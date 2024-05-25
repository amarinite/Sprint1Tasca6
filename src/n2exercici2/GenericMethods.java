package n2exercici2;

public class GenericMethods {
    public static <T> void printArguments(T... args) {
        for (T arg : args) {
            System.out.println(arg);
        }
    }
}
