import java.util.ArrayList;
import java.util.List;

public class VehicleDemo {
    public static void main(String[] args) {
        List<Vehicle> myList = new ArrayList<>();
        myList.add(new ElectricCar("Car1", 26, 15, .16));
        myList.add(new GasCar("Car1", 26, 7, 1.45));

        System.out.println(myList.get(0).fuelCostPer100Km());

        if (myList.get(0) instanceof AutonomousCapable)
        {
            System.out.println(((AutonomousCapable) myList.get(0)).supportsSelfDrive());
        }
    }
}
