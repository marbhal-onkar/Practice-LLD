package singleton;

public class ThreadSafeSingletonV1 {

    private static ThreadSafeSingletonV1 instance;

    private ThreadSafeSingletonV1(){}

    public static synchronized ThreadSafeSingletonV1 getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingletonV1();
        }
        return instance;
    }

}