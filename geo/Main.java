package geo;

public class Main {
    public static void main(String[] args) {
        
        Shape rectangle = (x,y) -> (x*y);
        System.out.println((rectangle.caculateArea(10, 20)));   
    }

}
