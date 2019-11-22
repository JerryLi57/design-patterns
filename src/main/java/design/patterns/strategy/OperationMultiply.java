package design.patterns.strategy;

/**
 * @description: OperationMultiply
 * @author: lijiayu
 * @date: 2019-11-21 20:56
 **/
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
