package Assignemnt1.Type2;

public class application {

    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Square s = new Square();
        Triangle t = new Triangle();

        /** There is the Polymorphism */
        Apply call = new Apply();
        call.whoAreYou(c);
        call.whoAreYou(r);
        call.whoAreYou(s);
        call.whoAreYou(t);

    }
}
