public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int width, int height) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + width + ", " + height + "]");
    }
}
