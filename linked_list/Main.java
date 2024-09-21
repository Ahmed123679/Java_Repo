package linked_list;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Ahmed");
        list.add("Ibrahim");
        list.add("Ali");
        list.add("AbdulSalam");
        for(String name: list)
        {
            System.out.println(name);
        }
        System.out.println(list.get(2));
        System.out.println(list.element());
        System.out.println(list.indexOf("Hello"));
        // System.out.println(list.);
    }
}
