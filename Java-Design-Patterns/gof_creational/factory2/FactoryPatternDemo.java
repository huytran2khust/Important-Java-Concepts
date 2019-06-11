package Java-Design-Patterns.gof_creational.factory2;

public class FactoryPatternDemo {

    public static void main(String args[])
    {
        ShapeFactory factory = new ShapeFactory();

        Shape myShape = factory.getShape("CIRCLE");
        myShape.draw();
    }
}
