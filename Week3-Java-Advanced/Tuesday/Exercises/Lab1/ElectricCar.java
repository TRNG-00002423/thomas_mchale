public class ElectricCar extends Vehicle implements AutonomousCapable
{
    private int kWhPer100Km;
    private double pricePerKWh;

    public ElectricCar(String make, int year, int kWhPer100Km, double pricePerKWh) 
    {
        super(make, year);
        this.kWhPer100Km = kWhPer100Km;
        this.pricePerKWh = pricePerKWh;
    }

    @Override
    public double fuelCostPer100Km() 
    {
        return this.kWhPer100Km * this.pricePerKWh;
    }

    public int getKWhPer100Km() {
        return kWhPer100Km;
    }

    public void setKWhPer100Km(int kWhPer100Km) {
        this.kWhPer100Km = kWhPer100Km;
    }

    public double getPricePerKWh() {
        return pricePerKWh;
    }

    public void setPricePerKWh(double pricePerKWh) {
        this.pricePerKWh = pricePerKWh;
    }

    @Override
    public boolean supportsSelfDrive()
    {
        return true;
    }
}
