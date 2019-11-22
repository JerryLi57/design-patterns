package design.patterns.abstractFactory;

/**
 * @description: Rectangle
 * @author: lijiayu
 * @date: 2019-10-28 10:20
 **/
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
