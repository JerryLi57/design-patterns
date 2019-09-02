package design.patterns.observer;

/**
 * @description: test Observer Pattern
 * @author: lijiayu
 * @date: 2019-09-02 11:11
 **/
public class TestObserver {

    public static void main(String[] args) {
        WechatServer server = new WechatServer();
        UserA ua = new UserA();
        UserB ub = new UserB();
        server.registerObserver(ua);
        server.registerObserver(ub);
        server.pushMessage("PHP是世界上最好用的语言！");
        System.out.println("================================================");
        server.removeObserver(ub);
        server.pushMessage("Java是世界上最好用的语言！");
    }
}
