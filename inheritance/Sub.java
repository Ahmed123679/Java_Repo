package inheritance;

public class Sub extends Super {
    public Sub() {
        super("Ahmed");
        System.out.println("This is Subclass");
    }
    public void WhoAmI() {
        System.out.println("I am Sub");
    }
    protected int x = 100;
}
