import java.util.Arrays;

class Triangle {

    private final double[] sides;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        this.sides = new double[]{side1, side2, side3};
        Arrays.sort(sides);
        boolean isTriangle = isTriangle();
        if (!isTriangle) throw new TriangleException();
    }

    boolean isTriangle(){
        return !(sides[0] + sides[1] <= sides[2]) && (!(sides[0] + sides[1] + sides[2] < 0.3));
    }

    boolean isEquilateral() {
        return sides[0] == sides[1] && sides[1] == sides[2];

    }
    boolean isIsosceles() {
        return sides[0] == sides[1] || sides[1] == sides[2];

    }

    boolean isScalene() {
        return sides[0] != sides[1] && sides[1] != sides[2];

    }
}
