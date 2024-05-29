package factories;

import soldiers.HarkonnenSoldier;
import soldiers.Soldier;
import vehicles.HarkonnenVehicle;
import vehicles.Vehicle;

// Factory pour la maison Harkonnen
public class HarkonnenFactory implements HouseFactory {
    @Override
    public Soldier createSoldier() {
        return new HarkonnenSoldier();
    }

    @Override
    public Vehicle createVehicle() {
        return new HarkonnenVehicle();
    }
}
