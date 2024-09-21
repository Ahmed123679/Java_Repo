package inheritance;

public interface MyInterface {
    void display(); // implicity public abstract
    int x = 10; // implicitly static final int = 10;
    default void method() {
        System.out.println("this is an interface");
    }
}
