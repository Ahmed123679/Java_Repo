package collections.array_list_collection;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class ArrayCollection {
    public static void main(String[] args) {
   
        // list.forEach(System.out::println);
        // Consumer<Integer> consumer = ArrayCollection::printInteger;
        // Supplier<Integer> square = () -> 10;   
        // Predicate<Integer> isEven = (x) -> x%2 == 0;
        // Function<Integer,Integer> squareNumber = (x) -> x*x; 
        
    }
    static void printInteger(Integer x) {
            System.out.println(x);
    }
}
