public class Rectangle {
    // Fields
    private double length;
    private double width;
    private String color;

    // Constructor
    public Rectangle(double len, double w, String color) {
        this.length = len;
        this.width = w;
        this.color = color;
    }

    // Setter methods
    public void setLength(double len) {
        length = len;
    }

    public void setWidth(double w) {
        width = w;
    }

    public void setColor(String c) {
        color = c;
    }

    // Getter methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    // Passing objects as arguments
    public void showSides(Rectangle s) {
        System.out.println("This rectangle has a length of " + s.getLength());
    }
}
