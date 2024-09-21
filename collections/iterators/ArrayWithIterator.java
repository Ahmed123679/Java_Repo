package collections.iterators;
import java.util.*;
public class ArrayWithIterator {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(1);
        myList.add(10);
        myList.add(12);

        Iterator<Integer> itr = myList.iterator();
        ListIterator<Integer> i = myList.listIterator(); 
        Integer value;
        for(;itr.hasNext();)
        {
            int del = itr.next();
            System.out.println(del);
            System.out.println(del + "is going be removed");
            
            itr.remove();
        }
        itr = myList.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        List<Integer> newList = new LinkedList<>();
        newList.add(10);
        test(newList);
        // for(Integer i = itr.next();itr.hasNext();i = itr.next())
        // {
        //     System.out.println("" + i);
        // }
    }
    static void test(Collection<? extends Integer> collection)
    {
        
    }
}
