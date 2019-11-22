package design.patterns.abstractFactory;

/**
 * @description: Green
 * @author: lijiayu
 * @date: 2019-10-28 10:27
 **/
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
