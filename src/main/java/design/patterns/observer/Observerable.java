package design.patterns.observer;

/**
 * @description: 抽象被观察者接口  声明了添加、删除、通知观察者方法
 * @author: lijiayu
 * @date: 2019-09-02 10:39
 **/
public interface Observerable {

    /**
     * 注册一个观察者
     * @param o 观察者
     */
    void registerObserver(Observer o);

    /**
     * 删除一个观察者
     * @param o 观察者
     */
    void removeObserver(Observer o);

    /**
     * 通知所有的观察者
     */
    void notifyObserver();
}
