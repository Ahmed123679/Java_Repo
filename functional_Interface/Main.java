package functional_Interface;
import java.util.function.*;;
public class Main {
    public static void main(String[] args) {
        
        Predicate<Integer> p = new Predicate<Integer>() {
    
            @Override
            public boolean test(Integer t)  {
                return true;
            }
            
        };
        System.out.println((p.test(2)));
    }


    
   
}
