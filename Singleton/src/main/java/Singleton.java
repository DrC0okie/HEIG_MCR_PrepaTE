public class Singleton {
    private static class Instance {
        static final Singleton instance = new Singleton();
    }

    private Singleton() { }

    public static Singleton getInstance() {
        return Instance.instance;
    }

    public void showMessage() {
        System.out.println("Bonjour, je suis une instance unique de Singleton !");
    }
}
