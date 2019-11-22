package design.patterns.abstractFactory;

/**
 * @description: FactoryProducer
 * @author: lijiayu
 * @date: 2019-10-28 10:56
 **/
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}