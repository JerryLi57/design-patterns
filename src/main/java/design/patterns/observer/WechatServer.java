package design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 被观察者，比如这里是一个微信公众号服务
 * @author: lijiayu
 * @date: 2019-09-02 10:47
 **/
public class WechatServer implements Observerable {

    private List<Observer> observers = new ArrayList<Observer>();

    private String message;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        if(!observers.isEmpty()){
            observers.remove(o);
        }
    }

    public void notifyObserver() {
        for(Observer item : observers){
            item.update(this.message);
        }
    }

    public void pushMessage(String message) {
        this.message = message;
        this.notifyObserver();
    }

}
