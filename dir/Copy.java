package dir;
/**
 * This is Copy class used for copying.
 */
public class Copy {
    public static void main(String[] args)
    {
        Copy x = new Copy("Hello");
        Copy y = new Copy(x);
    }
    public Copy(Copy right)
    {
        System.out.println("This is Copy Constructor");
    }
    public Copy(String x) {
        System.out.println(x);
    }
    
}
