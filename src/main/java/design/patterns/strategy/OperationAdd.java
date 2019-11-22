package design.patterns.strategy;

/**
 * @description: OperationAdd
 * @author: lijiayu
 * @date: 2019-11-21 20:48
 **/
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}