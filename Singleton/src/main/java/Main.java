public class Main {
    public static void main(String[] args) {
        // Obtention de l'unique instance du singleton
        Singleton singleton = Singleton.getInstance();

        // Appel d'une méthode de l'instance Singleton
        singleton.showMessage();
    }
}