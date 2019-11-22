package design.patterns.singleton;

/**
 * @description: SingletonInner
 * @author: lijiayu
 * @date: 2019-10-23 13:47
 **/
public class SingletonInner {

    private static class SingletonHolder {
        private static final SingletonInner INSTANCE = new SingletonInner();
    }

    private SingletonInner() {
    }

    public static final SingletonInner getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
