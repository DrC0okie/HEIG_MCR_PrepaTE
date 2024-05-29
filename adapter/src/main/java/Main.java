public class Main {
    public static void main(String[] args) {
        // Créer des personnages existants
        Character atreidesWarrior = new AtreidesWarrior();
        Character harkonnenWarrior = new HarkonnenWarrior();

        // Créer un guerrier Fremen
        FremenWarrior fremenWarrior = new FremenWarrior();

        // Adapter le guerrier Fremen pour qu'il corresponde à l'interface Character
        Character fremenAdapter = new FremenWarriorAdapter(fremenWarrior);

        // Ajouter les personnages dans un tableau pour simuler une bataille
        Character[] characters = { atreidesWarrior, harkonnenWarrior, fremenAdapter };

        // Simuler une attaque de chaque personnage
        for (Character character : characters) {
            character.attack();
        }
    }
}