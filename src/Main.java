public class Main {
    public static void main(String[] args) {
        // Create two objects of Square class 's1' and 's2'.
        Square s1 = new Square();
        s1.length = 10F;

        Square s2 = new Square();
        s2.length = 20F;

        // Calculate and print their areas after assigning values to their side lengths.
        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}

class Square {

    public float length;

    public float area() {
        return length * length;
    }
}