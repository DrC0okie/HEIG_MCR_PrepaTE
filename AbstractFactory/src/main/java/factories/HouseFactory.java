package factories;

import soldiers.Soldier;
import vehicles.Vehicle;

public interface HouseFactory {
    Soldier createSoldier();
    Vehicle createVehicle();
}
