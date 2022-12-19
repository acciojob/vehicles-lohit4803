import com.driver.WaterVehicle;

public class Boat implements WaterVehicle
{
    String name;
    int capacity;

    public String getVehicleName()
    {
        return name;
    }

    public int getVehicleCapacity()
    {
        return capacity;
    }
}
