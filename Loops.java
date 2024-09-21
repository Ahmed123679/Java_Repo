public class Loops {
    static void main(String[] args)
    {
        // loops
        String[] data = {"Hello","World","Hi"};
       for(var x:data) {
        System.out.println(x);
    }
        for(int i = 0;i<data.length;i++) {
        System.out.println(data[i]);
        
    }
    int i = 0;
        while(i < data.length)
        {
           System.out.println(data[i]);
           i++;
           
        }
        i = 0;
        do {
            System.out.println(data[i]);
            i++;
        }while(i<data.length);
    }
}
