public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int width, int height) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + width + ", " + height + "]");
    }
}
