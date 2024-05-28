public class Main {
    public static void main(String[] args) {
        // Créer le sujet
        Subject subject = new Subject();

        // Obtenir l'instance de ListenerRegistrar pour attacher les observateurs
        ListenerRegistrar registrar = subject.getListenerRegistrar();

        // Créer un observateur avec qualifier
        Observer observer1 = new Observer("Observateur 1", registrar);
        Observer observer2 = new Observer("Observateur 2", registrar);

        // Changer la propriété du sujet
        subject.setName("Nom initial");
        subject.setName("Nouveau nom");

        // Supprimer un observateur et changer la propriété
        subject.removePropertyChangeListener(observer1);
        subject.setName("Encore un nouveau nom");
    }
}
