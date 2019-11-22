package design.patterns.abstractFactory;

/**
 * @description:
 * @author: lijiayu
 * @date: 2019-10-28 10:27
 **/
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
