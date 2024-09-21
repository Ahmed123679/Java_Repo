package streamAPI;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // joinStrings(); // joining collection on a sequence
        // SummrayStat();
        // PartitionBy();
        GroupMap();
       
    }
    static void joinStrings()
    {
        List<String> names = Arrays.asList("Ahmed","Ibrahim","Ali");
        var nameStream = names.stream();
        String x = nameStream.collect(Collectors.joining(",")).toString();
        System.out.println(x);
    
    }
    static void GroupBY()
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> listStream = list.stream();

        Map<String,List<Integer>> m = 
        listStream.collect(Collectors.groupingBy((num)-> num > 5?"Bigger than 5":"lessthan 5"));
        for(Map.Entry<String,List<Integer>> entry : m.entrySet())
        {
            System.out.println(entry);
        }
    }
    static void SummrayStat()
    {
        List<Double> num = Arrays.asList(1.0,2d,3d,5d,610.0,3456.6);
        var stat = num.stream().mapToDouble((x) -> x).summaryStatistics();
        System.out.println(stat);
    }
    static void PartitionBy()
    {
        List<String> countries = Arrays.asList("USA","KSA","UK","PRC","ARE");
        countries.stream().collect(
            Collectors.partitioningBy((c) -> c.length() <= 2)
        ).forEach((Boolean key,List<String> value) -> System.out.println(key + ":" + value));;
    }
    static void GroupMap()
    {
        List<Employee> emp = 
        Arrays.asList(
            new Employee(1,"Ahmed",272.9),
            new Employee(2,"Mohamed",272.9),
            new Employee(3,"Hassan",272.9),
            new Employee(4,"Ali",272.9),
            new Employee(5,"Mazen",272.9)
            );
            var newList = emp.stream().collect(
                Collectors.groupingBy((e) -> e.getName().charAt(0),
                //Collectors.mapping(Employee::getId, Collectors.toList())
                Collectors.reducing(BinaryOperator.maxBy((e1,e2) -> e1.getName().length() - e2.getName().length()))
                )
            );
            System.out.println(newList);
    }
}
class Employee {

    // attributes
    private int id;
    private String name;
    private Double salary;
    
    // constructor
    public Employee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    // getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
    
}
