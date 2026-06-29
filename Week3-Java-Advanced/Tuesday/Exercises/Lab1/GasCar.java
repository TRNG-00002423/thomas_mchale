public class GasCar extends Vehicle 
{

    private int litersPer100Km;
    private double pricePerLiter;

    public GasCar(String make, int year, int litersPer100Km, double pricePerLiter)
    {
        super(make, year);
        this.litersPer100Km = litersPer100Km;
        this.pricePerLiter = pricePerLiter;
    }

    @Override
    public double fuelCostPer100Km() 
    {
        return this.litersPer100Km * this.pricePerLiter;
    }

    public int getLitersPer100Km() {
        return litersPer100Km;
    }

    public void setLitersPer100Km(int litersPer100Km) {
        this.litersPer100Km = litersPer100Km;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }
}