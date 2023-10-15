package singleton;

/**
 * Most widely used implementation, it doesn’t require synchronization.
 * Synchronization is handled by JVM.
 *
 * When the singleton class is loaded, SingletonHelper class is not loaded into memory and
 * only when someone calls the getInstance() method,
 * this class gets loaded and creates the singleton class instance.
 */
public class BillPughSingleton {

    private BillPughSingleton(){}

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}