public class Decision {
    static void main(String[] args)
    {
        String x = "Hello";
        String y = "hEllo";
        byte h = (byte)'H';
        byte w = (byte)'W';
        System.out.printf("h = %d , w = %d\n h-w = %d\n",h,w,h-w);
        System.out.println(x.compareTo(y));
        System.out.println(y.compareTo(x));

        if(x.equalsIgnoreCase(y))
        {
            System.out.println("Equal Strings");
        }else 
        {
            System.out.println("NOT Equal Strings");

        }
        double num = (x.charAt(0) == 'H') ? 10:0;
        System.out.println(num);

        var state = "ON";
        switch(state) {
                case "ON":
                System.out.println("state is on");
            break;
                case "OFF":
                System.out.println("state is off");
            break;
                default:
                System.out.println("state is unknown");
            
        }

    }
}
