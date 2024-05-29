package factories;

import soldiers.AtreidesSoldier;
import soldiers.Soldier;
import vehicles.AtreidesVehicle;
import vehicles.Vehicle;

public class AtreidesFactory implements HouseFactory {
    @Override
    public Soldier createSoldier() {
        return new AtreidesSoldier();
    }

    @Override
    public Vehicle createVehicle() {
        return new AtreidesVehicle();
    }
}
