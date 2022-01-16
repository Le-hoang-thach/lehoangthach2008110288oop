package OO;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Shape shape1 = new Shape( "triangle","Cone" , "small");
        shape1.name();
        shape1.turn();
        shape1.sound();
        Shape shape2 = new Shape("square","shutlle", "small");
        shape2.turn();
        shape2.sound();
        Shape shape3 = new Shape("circle", "globular", "small");
        shape3.name();
        shape3.turn();
        shape3.sound();

    }
}
