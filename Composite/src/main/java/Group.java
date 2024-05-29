import java.util.ArrayList;
import java.util.List;

class Group implements Shape {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    public void draw(String indentation) {
        System.out.println(indentation + "Drawing a Group:");
        for (Shape shape : shapes) {
            shape.draw(indentation + "  ");
        }
    }
}