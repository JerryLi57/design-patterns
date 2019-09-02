package design.patterns.observer;

/**
 * @description: 抽象观察者   定义了一个update()方法，当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
 * @author: lijiayu
 * @date: 2019-09-02 10:40
 **/
public interface Observer {

    /**
     * 当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
     * @param message 更新的消息上下文
     */
    void update(String message);
}
