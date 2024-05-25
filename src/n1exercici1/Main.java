package n1exercici1;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods objs = new NoGenericMethods("calculator", "notepad", "pencil");

        System.out.println("Order 1: " + objs.getObject1() + ", " + objs.getObject2() + ", " + objs.getObject3());
        System.out.println("Order 2: " + objs.getObject2() + ", " + objs.getObject3() + ", " + objs.getObject1());
    }
}