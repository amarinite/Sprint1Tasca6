package n1exercici1;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods objs1 = new NoGenericMethods("calculator", "notepad", "pencil");
        NoGenericMethods objs2 = new NoGenericMethods("pencil", "calculator", "notepad");

        System.out.println("Order 1: " + objs1.getObject1() + ", " + objs1.getObject2() + ", " + objs1.getObject3());
        System.out.println("Order 2: " + objs2.getObject1() + ", " + objs2.getObject2() + ", " + objs2.getObject3());
    }
}