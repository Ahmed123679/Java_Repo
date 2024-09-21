package inheritance;

public class Main {
    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.WhoAmI();
        obj.x = 10;
        System.out.println(obj instanceof Super);
    }
}
