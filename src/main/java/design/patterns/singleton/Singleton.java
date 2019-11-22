package design.patterns.singleton;

/**
 * @description: Singleton
 * @author: lijiayu
 * @date: 2019-10-23 13:42
 **/
public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
