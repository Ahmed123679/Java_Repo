import java.util.*;;
public class Arrays {
    public static void main(String... args)
    {
        int arr[][] = new int[3][];
        arr[0] = new int[10];
        arr[1] = new int[90];
        arr[2] = new int[30];
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0;i<10;i++) {
            numbers.add(i);
        }
        /* Array List methods
         * add(index=length,value)
         * remove(index)
         * set(index,value)
         * get(index) return value at index
         */
        for(var x:numbers) {
            System.out.println(x);
        }

        // for(var x:args) {
        //     System.out.println(x);
        // }
    }
    public void finalize() {
        System.out.println("END");
    }
}
