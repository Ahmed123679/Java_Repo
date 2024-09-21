package sorted_list;

import java.util.*;

public class SortedListDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(6);
        nums.add(5);
        nums.add(0);
        Collections.sort(nums);  
        for(int i = 0;i<nums.size();i++)
        {
            System.out.println(nums.get(i));
        }     
        Collections.reverse(nums)  ;
        for(int i = 0;i<nums.size();i++)
        {
            System.out.println(nums.get(i));
        }    
    }
}
