package design.patterns.strategy;

/**
 * @description: Context
 * @author: lijiayu
 * @date: 2019-11-21 20:58
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}