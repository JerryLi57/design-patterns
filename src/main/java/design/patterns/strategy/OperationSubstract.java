package design.patterns.strategy;

/**
 * @description: OperationSubstract
 * @author: lijiayu
 * @date: 2019-11-21 20:51
 **/
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}