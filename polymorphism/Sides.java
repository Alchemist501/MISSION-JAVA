abstract class Shapes {
    abstract void numberOfSides();
}

class Rectangle extends Shapes {
    void numberOfSides() {
        System.out.println("Rectangle has 4 sides");
    }
}

class Triangle extends Shapes {
    void numberOfSides() {
        System.out.println("Triangle has 3 sides");
    }
}

class Hexagon extends Shapes {
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides");
    }
}

public class Sides {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
        Hexagon h = new Hexagon();
        t.numberOfSides();
        r.numberOfSides();
        h.numberOfSides();
    }
}