package design.patterns.observer;

/**
 * @description: 观察者A
 * @author: lijiayu
 * @date: 2019-09-02 11:05
 **/
public class UserA implements Observer {

    private String message;

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public void read() {
        System.out.println("I'm User A 收到推送消息： " + message);
    }
}
