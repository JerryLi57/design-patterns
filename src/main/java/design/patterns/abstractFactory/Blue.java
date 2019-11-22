package design.patterns.abstractFactory;

/**
 * @description: Blue
 * @author: lijiayu
 * @date: 2019-10-28 10:28
 **/
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
