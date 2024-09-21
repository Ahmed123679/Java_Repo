package sort_using_comparator;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        var cars = new ArrayList<Car>();
        cars.add(new Car("BMW",1839));
        cars.add(new Car("Opel",18310));
        cars.add(new Car("Mazda",839));
        cars.add(new Car("Skoda",1849));
        Collections.sort(cars,new Car_Sorter()); // using car sorter

        for(Car c : cars)
        {
            System.out.println(c);
        }
        Collections.sort(cars,new Car_Sorter());
        for(Car c : cars)
        {
            System.out.println(c);
        }
    }
}
