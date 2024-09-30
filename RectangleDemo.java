public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle box = new Rectangle(20, 15, "red");

        System.out.println("The length of the rectangle is: " + box.getLength());
        System.out.println("The width of the rectangle is: " + box.getWidth());
        System.out.println("The color of the rectangle is: " + box.getColor());
        
        box.showSides(box);
    }
}
