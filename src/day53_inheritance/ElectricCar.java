package day53_inheritance;

public class ElectricCar {

    private String make;
    private String model;
    private double price;
    private int year;
    private int range;
    private static int count;  // all object will share this variable

    public ElectricCar(String make, String model, double price, int year, int range)
    {
         setMake(make);       // they are some , useful when setter has some condition
        this.model = model;
        this.price = price;
        this.year = year;
        this.range = range;
        count++;  // increase count by 1 --> everytime new car added
    }

    public static int getCount(){
        return count;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    // model3.
    protected void drive(int miles){

        if(range == 0 || range - miles < 0){
            System.out.println("ERROR: cannot drive that far, need to charge");
        }
        else{
            range -= miles;
            System.out.println("Driving " + miles + " miles...");
        }

    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {

        if(make.isEmpty()){
            System.out.println("ERROR: can not be blank");
        }else {
            this.make = make;
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", range=" + range +
                '}';
    }
}
