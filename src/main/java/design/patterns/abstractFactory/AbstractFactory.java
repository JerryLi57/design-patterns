package design.patterns.abstractFactory;

/**
 * @description: AbstractFactory
 * @author: lijiayu
 * @date: 2019-10-28 10:50
 **/
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
