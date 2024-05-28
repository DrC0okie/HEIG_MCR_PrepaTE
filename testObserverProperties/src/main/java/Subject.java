import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Subject {
    private String name;
    private PropertyChangeSupport support;

    public Subject() {
        this.support = new PropertyChangeSupport(this);
    }

    // Méthode pour obtenir une instance de ListenerRegistrar
    public ListenerRegistrar getListenerRegistrar() {
        return this::addPropertyChangeListener;
    }

    // Ajoute un PropertyChangeListener
    private void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    // Supprime un PropertyChangeListener
    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    // Méthode pour changer la propriété et notifier les observateurs
    public void setName(String value) {
        String oldValue = this.name;
        this.name = value;
        // Notifie les observateurs du changement de la propriété
        support.firePropertyChange("name", oldValue, this.name);
    }

    // Méthode pour obtenir la valeur de la propriété
    public String getName() {
        return name;
    }
}
