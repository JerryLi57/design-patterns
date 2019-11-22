package design.patterns.abstractFactory;

/**
 * @description: Square
 * @author: lijiayu
 * @date: 2019-10-28 10:21
 **/
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
