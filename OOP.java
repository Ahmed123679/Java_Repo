public class OOP {
    private String name;
    public static void main()
    {
        OOP obj = new OOP(10);
    }
    
    public OOP(String name) {
        this.name = name;
    }
    public OOP(int number) {
        System.out.println(number);
    }
}
