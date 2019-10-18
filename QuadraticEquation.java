package lab1;

public class QuadraticEquation {
    public Pair searchRoots(double a, double b, double c) throws IllegalArgumentException {
        Pair pair = new Pair(0.0, 0.0);
        if (a == 0) {
            pair.x1 = b / -c;
            pair.x2 = b / -c;
            return pair;
        }
        if (a == 0.0 && b == 0.0) {
            throw new IllegalArgumentException();
        }
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant < 0)
            throw new IllegalArgumentException("Roots are complex");
        else {
            pair.x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            pair.x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return pair;
        }
    }
}

