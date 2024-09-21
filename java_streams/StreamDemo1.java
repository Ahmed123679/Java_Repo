package java_streams;
import java.util.stream.*;

import java.util.*;
import collections.array_list_collection.ArrayCollection;
import java.util.function.*;

public class StreamDemo1 {
    public static void main(String[] args) {

        Predicate<Integer> x = m -> m>10;
        // creating stream using stream of method
        List<String> names = new ArrayList<>();
        String[] arra =  {"Hello","Ahmed","Ibrahim"};
        Stream<String> stream = Stream.of(arra);
        stream.sorted((s1,s2) -> s2.compareTo(s1)).forEach(System.out::println);

        // creating a stream from a collection

        Collection<Integer> arr = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream2 = arr.stream();
        Map<Integer,List<Integer>> variabel = stream2.collect(Collectors.groupingBy((x) -> x%2 == 0 ? 0:1));
        List<Integer> evenNumbers = stream2.filter((num)-> num%2 == 0).collect(Collectors.toList());
        evenNumbers.forEach(System.out::println);
        Double[] doubles = {81.0,2.0,3.0,4.0,5.0};
        Stream<Double> stream3 = Arrays.stream(doubles);
        Map<String,Integer> map = new HashMap<>();
        // sorting a user defined class
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(10,"BMW"));
        cars.add(new Car(11,"Toyota"));
        cars.add(new Car(12,"Marcedez"));
        cars.add(new Car(13,"Cadelac"));
        cars.add(new Car(14,"Volx"));
        Stream<Car> carStream = cars.stream();
        List<String> carNames = carStream.map(Car::getModel).collect(Collectors.toList());
        carNames.forEach(System.out::println);
        carStream
        .sorted(Comparator.comparingInt(Car::getPrice))
        .forEach((car) -> System.out.println(car));
        List<String> lowerCase = Arrays.asList("a","b","c","d");
        List<String> upperCase = lowerCase.stream().map((character) -> character.toUpperCase()).toList();
        upperCase.forEach(System.out::println);
    }
}
class Car {
    private int price;
    private String model;
    public Car(int price,String model)
    {
        this.price = price;
        this.model = model;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString() {
        return "Car [price=" + price + ", model=" + model + "]";
    }
    
}
