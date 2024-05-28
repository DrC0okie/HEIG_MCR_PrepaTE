import java.beans.PropertyChangeListener;

@FunctionalInterface
public interface ListenerRegistrar {
    void register(PropertyChangeListener listener);
}