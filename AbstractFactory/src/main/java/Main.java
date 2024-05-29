import factories.AtreidesFactory;
import factories.HarkonnenFactory;
import factories.HouseFactory;
import soldiers.Soldier;
import vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        // Créer une factory pour la maison Atreides
        HouseFactory atreidesFactory = new AtreidesFactory();
        Soldier atreidesSoldier = atreidesFactory.createSoldier();
        Vehicle atreidesVehicle = atreidesFactory.createVehicle();

        // Utiliser les produits créés
        atreidesSoldier.attack();
        atreidesVehicle.move();

        // Créer une factory pour la maison Harkonnen
        HouseFactory harkonnenFactory = new HarkonnenFactory();
        Soldier harkonnenSoldier = harkonnenFactory.createSoldier();
        Vehicle harkonnenVehicle = harkonnenFactory.createVehicle();

        // Utiliser les produits créés
        harkonnenSoldier.attack();
        harkonnenVehicle.move();
    }
}