package design.patterns.abstractFactory;

/**
 * @description: Circle
 * @author: lijiayu
 * @date: 2019-10-28 10:22
 **/
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
