package designpatterns.singleton;

public class SingletonWithHolderClass {

    private SingletonWithHolderClass(){}

    private static final class InstanceHolder {
        static final SingletonWithHolderClass INSTANCE = new SingletonWithHolderClass();
    }

    public static SingletonWithHolderClass getInstance() {

        return InstanceHolder.INSTANCE;
    }
}
