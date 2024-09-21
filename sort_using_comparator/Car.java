package sort_using_comparator;

public class Car {
    private String model;
    private double price;
    
    
    class Engine {
        private int h;
        public Engine()
        {
            h = 10;
            Car x = new Car("Hello",101);
            x.model = "Hello";
        }
    }

    public Car(String model,double price)
    {
        Engine e = new Engine();
        e.h = 10;
        this.model = model;
        this.price = price;
    }
    public double getPrice()
    {
        return this.price;
    }
    public String getModel()
    {
        return this.model;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "model = " + this.model + " , " + "price = " + this.price;
    }
}
