import java.awt.*;

public class Circle extends Shape {
    private int radius, height, width;

    public Circle(int radius, int height, int width, DrawAPI drawAPI){
        super(drawAPI);
        this.radius= radius;
        this.height = height;
        this.width= width;
    }
    @Override
    public void draw() {
        drawAPI.drawCircle(radius, height, width);
    }
}
