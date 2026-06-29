public abstract class Vehicle 
{
    private String make;
    private int year;

    public Vehicle(String make, int year)
    {
        this.make = make;
        this.year = year;
    }

    public abstract double fuelCostPer100Km();

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}