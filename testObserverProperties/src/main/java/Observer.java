import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Observer implements PropertyChangeListener {
    private String observerName;

    public Observer(String observerName, ListenerRegistrar registrar) {
        this.observerName = observerName;
        registrar.register(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        // Affiche le changement de propriété
        System.out.println(observerName + " a été notifié. La propriété '"
                + evt.getPropertyName() + "' a changé de '"
                + evt.getOldValue() + "' à '"
                + evt.getNewValue() + "'.");
    }
}
