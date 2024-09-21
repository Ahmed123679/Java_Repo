package sort_using_comparator;
import java.util.*;
import sort_using_comparator.Car;
public class Car_Sorter implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        // TODO Auto-generated method stub
       return (int)(o1.getPrice() - o2.getPrice());
    }
    
}
